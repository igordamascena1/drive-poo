package main;

public class Enquete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int respostas[] = {2, 1, 3, 5, 1, 3, 5, 1, 4, 2, 3, 4, 
				1, 5, 3, 2, 1, 4, 2, 14};
		int frequencia[] = new int[6];
		
		try {//ele tenta executar
			for (int i=0; i< respostas.length; i++) {
				++frequencia[respostas[i]];
			}
		}catch(ArrayIndexOutOfBoundsException e) {//captura a exceção e tenta tratar
			System.err.println(e.getMessage());
		}
		
		
		System.out.printf("%s %10s\n", "Respostas", "Frequência");
		for (int i=1; i<frequencia.length; i++) {
			System.out.printf("%6d%10d\n", i, frequencia[i]);
		}
			

	}

}
