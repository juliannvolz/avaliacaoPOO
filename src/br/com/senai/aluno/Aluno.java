package br.com.senai.aluno;

import br.com.senai.curso.Curso;
import br.com.senai.endereco.Endereco;

public class Aluno extends Endereco {
	
	//ATRIBUTOS
	private String nomeAluno;
	private int idadeAluno;
	private Curso cursos;
	
	//M�TODOS
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public int getIdadeAluno() {
		return idadeAluno;
	}
	public void setIdadeAluno(int idadeAluno) {
		this.idadeAluno = idadeAluno;
	}
	public Curso getCurso() {
		return cursos;
	}
	public void setCurso(Curso cursos) {
		this.cursos = cursos;
	}
	
}
