package main;

public class Main {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Lucas", 28);
		
		try {
			p.adicionarContato("Jo"); // Deve lançar exceção
		} catch (ContatoInvalidoException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			p.adicionarContato("Joana"); // Deve funcionar
			System.out.println("Contato adicionado com sucesso.");
		} catch (ContatoInvalidoException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}

