package main;

import java.util.HashMap;

public class Disciplina implements Relatorio{
	
	private String nomeDisciplina;
	private Professor professor;
	private int codigo;
	private HashMap<Aluno, double[]> notasAlunos;
	
	public Disciplina (String nomeDisciplina, Professor professor, int codigo) {
		this.nomeDisciplina = nomeDisciplina;
		this.professor = professor;
		this.notasAlunos = new HashMap<Aluno, double[]>();		
		professor.adicionarDisciplina(this);
		this.codigo = codigo;
	}
	
	public void adicionarNota(Aluno aluno, double nota1, double nota2) {
		double notas [] = {nota1, nota2};
		notasAlunos.put(aluno, notas);
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome\tNota 1\tNota 2\tMédia\tConceito");
		for (Aluno aluno : notasAlunos.keySet()) {
			double notas[] = notasAlunos.get(aluno);
			if (notas != null) {
				System.out.print(aluno.getNome());
				System.out.printf("%.2f", notas[0]);
				System.out.printf("%.2f", notas[1]);
				double media = calcularMedia(notas[0], notas[1]);
				System.out.print("\t" + media);
				System.out.println("\t" + mostrarConceito(media));
			}		
			
		}
	}
	
	public double calcularMedia(double n1, double n2) {
		return (n1+n2)/2;
	}
	
	public String mostrarConceito(double media) {
		if (media >= 7 && media <= 10) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
	}
	
	public boolean adicionarAluno(Aluno aluno) {
		//double [] notas = {0, 0};
		if (!this.notasAlunos.containsKey(aluno)) {
			this.notasAlunos.put(aluno, null);
			return true;
		}
		return false;
		
	}
	
	public double [] getNotas(Aluno aluno) {
		return this.notasAlunos.get(aluno);
	}
	
	public String getNome() {
		return this.nomeDisciplina;
	}
	
	public int getCodigo() {
		return this.codigo;
	}



}
