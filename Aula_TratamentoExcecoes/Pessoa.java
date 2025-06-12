package main;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private int idade;
	private List<String> contatos;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.contatos = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	//Aqui eu obrigo quem chamou, tratar a exceção!
	public void adicionarContato(String nomeContato) throws ContatoInvalidoException {
		if (nomeContato == null || nomeContato.trim().length() <= 3) {
			throw new ContatoInvalidoException("O nome do contato deve ter mais de 3 letras.");
		}
		this.contatos.add(nomeContato);
	}

	// Aqui eu apenas lanço a exceção!
	public String buscarContato(int indice) {
		if (indice >= this.contatos.size()) throw new IndexOutOfBoundsException("Índice maior que o tamanho da lista!");	
		return this.contatos.get(indice);
	}
	
	

}
