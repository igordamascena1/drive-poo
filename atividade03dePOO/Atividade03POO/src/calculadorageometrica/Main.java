package calculadorageometrica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FormaGeometrica forma = null;

        System.out.println("Calculadora Geometrica");

        while (true) {
            System.out.println("\nDigite o nome da forma geometrica (circulo, quadrado, retangulo, trianguloretangulo) ou 'sair' para encerrar:");
            String escolha = scanner.nextLine().trim().toLowerCase();

            if (escolha.equals("sair")) {
                System.out.println("Encerrando o programa.");
                break;
            }

            try {
                switch (escolha) {
                    case "circulo":
                        System.out.print("Digite o raio: ");
                        double raio = Double.parseDouble(scanner.nextLine());
                        forma = new Circulo(raio);
                        break;

                    case "quadrado":
                        System.out.print("Digite o lado: ");
                        double lado = Double.parseDouble(scanner.nextLine());
                        forma = new Quadrado(lado);
                        break;

                    case "retangulo":
                        System.out.print("Digite a base: ");
                        double base = Double.parseDouble(scanner.nextLine());
                        System.out.print("Digite a altura: ");
                        double altura = Double.parseDouble(scanner.nextLine());
                        forma = new Retangulo(base, altura);
                        break;

                    case "trianguloretangulo":
                        System.out.print("Digite a base: ");
                        double baseT = Double.parseDouble(scanner.nextLine());
                        System.out.print("Digite a altura: ");
                        double alturaT = Double.parseDouble(scanner.nextLine());
                        forma = new TrianguloRetangulo(baseT, alturaT);
                        break;

                    default:
                        System.err.println("Forma invalida! Nenhuma forma chamada '" + escolha + "' foi encontrada.");
                        continue;
                }

                System.out.println("\nDetalhes da Forma:");
                System.out.println("Forma: " + forma.getNomeForma());
                System.out.println("Dimensoes: " + forma.getDetalhesDimensoes());
                System.out.printf("Area: %.2f\n", forma.calcularArea());
                System.out.printf("Perimetro: %.2f\n", forma.calcularPerimetro());

                RegistroCalculo registro = new RegistroCalculo(forma);
                System.out.printf("Registro - Area: %.2f\n", registro.getAreaCalculada());
                System.out.printf("Registro - Perimetro: %.2f\n", registro.getPerimetroCalculado());

            } catch (DimensaoInvalidaException e) {
                System.err.println("Erro: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("Erro: Entrada numerica invalida.");
            }
        }

        scanner.close();
    }
}
