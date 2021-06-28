package br.com.senai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.senai.aluno.Aluno;
import br.com.senai.aluno.AlunoController;
import br.com.senai.curso.Curso;
import br.com.senai.curso.CursoController;

public class ProgramaPrincipal {
	
	private static Scanner tec;
	
	public ProgramaPrincipal() {
		tec = new Scanner(System.in);	
	}
	
	public static int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();	
	}
	
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();
		List<Curso> cursos = new ArrayList<>();
		
		AlunoController alunoController = new AlunoController();
		CursoController cursoController = new CursoController();
		
		boolean sair = false;
		
		do {
			System.out.println("--- MENU ---");
			System.out.println("1) Registro de alunos");
			System.out.println("2) Registro de cursos");
			System.out.println("3) Sair do sistema");
			
			int opcao = leOpcao();
			
			switch(opcao) {
				case 1:
					alunoController.menu();
					break;
					
				case 2: 
					cursoController.menu();
					break;
				
				case 3:
					sair = true;
					break;
					
				default:
					System.out.println("Opção inválida");
					break;
			}
		} while(!sair);
		System.out.println("Sistema finalizado!");
		
	}
}
