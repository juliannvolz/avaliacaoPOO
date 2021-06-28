package br.com.senai.aluno;

import java.util.List;
import java.util.Scanner;

public class AlunoController {

	private Scanner tec;
	
	public AlunoController() {
		tec = new Scanner(System.in);	
	}
	
	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();	
	}
	
	public Aluno cadastrarAluno() {
		Aluno aluno = new Aluno();
		
		System.out.println("--- CADASTRAR ALUNO ---");
		System.out.println("Informe o nome: ");
		tec.nextLine();
		aluno.setNomeAluno(tec.nextLine());
		
		System.out.println("Informe a sua idade: ");
		aluno.setIdadeAluno(tec.nextInt());
		
		System.out.println("Informe o país de origem: ");
		aluno.setPais(tec.nextLine());
		
		System.out.println("Informe seu estado: ");
		aluno.setEstado(tec.nextLine());
		
		System.out.println("Informe sua cidade: ");
		aluno.setCidade(tec.nextLine());
		
		return aluno;
	}
	
	public List<Aluno> listarAluno(List<Aluno> alunos) {
		
		if(alunos.isEmpty()) {
			System.out.println("Não possui dados para listar");
			return null;
		}
		
		System.out.println(" --- ALUNOS CADASTRADOS ---");
		System.out.printf("| %2s | %10s | %4s | %6s | %6s | %6s |\n",
				"Id", "Nome" , "Idade", "País", "Estado", "Cidade");
		
		for(int i = 0; i < alunos.size(); i++) {
			System.out.println("| %2d | %10s | %4d | %6s | %6s | %6s |\n");
			i,
			alunos.get(i).getNomeAluno(),
			alunos.get(i).getIdadeAluno(),
			alunos.get(i).getPais(),
			alunos.get(i).getEstado(),
			alunos.get(i).getCidade());
		}
		
			
		return alunos;
	}
	
}
