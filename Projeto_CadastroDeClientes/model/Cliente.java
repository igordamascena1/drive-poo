package model;

public class Cliente {
	
	private String nome;
	private String email;
	private String sexo;
	private String telefone;
	
	public Cliente(String nome, String telefone, String email, String sexo) {
		super();
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
