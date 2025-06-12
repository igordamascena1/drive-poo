package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quociente {

	public static int quociente(int num1, int num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		int numerador, denominador;
		Scanner entrada = new Scanner(System.in);
		boolean continuar = true;
		
		do {
			try {
				System.out.println("Informe o numerador: ");
				numerador = entrada.nextInt();
				System.out.println("Informe o denominador: ");
				denominador = entrada.nextInt();
				System.out.println("Quociente: " + quociente(numerador, denominador));
				continuar = false;
			}catch(ArithmeticException | InputMismatchException e) {
				System.err.println("Não é permitido!" + e.getMessage());
			}finally { //opcional! Usado somente para limpeza de dados!
				System.out.println("Sempre será executado!");
			}
			entrada.nextLine();
		}while(continuar);		

	}

}
