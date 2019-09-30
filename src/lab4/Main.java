package lab4;

import java.util.Scanner;

public class Main {
	
	private static ControleAlunos controle = new ControleAlunos();
	private static Scanner scan = new Scanner(System.in);

	private static void menu() {
		  System.out.print("(C)adastrar Aluno" 
		+ System.lineSeparator() + "(E)xibir Aluno"
		+ System.lineSeparator() + "(N)ovo Grupo"
		+ System.lineSeparator() + "(A)locar Aluno no Grupo e Imprimir Grupos"
		+ System.lineSeparator() + "(R)egistrar Aluno que Respondeu"
		+ System.lineSeparator() + "(I)mprimir Alunos que Responderam"
		+ System.lineSeparator() + "(O)ra, vamos fechar o programa!"
		+ System.lineSeparator() 
		+ System.lineSeparator() + "Opcao> ");
	}

	private static void cadastraAluno() {
		System.out.print("Matricula: ");
		String matricula = scan.nextLine().trim();

		System.out.print("Nome: ");
		String nome = scan.nextLine();

		System.out.print("Curso: ");
		String curso = scan.nextLine().trim();

		System.out.println(System.lineSeparator() + controle.cadastraAluno(nome, matricula, curso) + System.lineSeparator());		
	}

	private static void exibeAluno() {
		System.out.print("Matricula: ");
		String matricula = scan.nextLine().trim();
		
		
		System.out.println(System.lineSeparator() + controle.consultaAluno(matricula) + System.lineSeparator());			
	} 

	private static void cadastraGrupo() {
		System.out.print("Grupo: ");
		String nome = scan.nextLine().trim();

		
		System.out.println(System.lineSeparator() + controle.cadastraGrupo(nome) + System.lineSeparator());
		
	}

	private static void alocaImprime() {
		String op;
		System.out.println("(A)locar Aluno ou (I)mprimir Grupo? ");
		op = scan.nextLine().trim().toUpperCase();
		
		if (op.equals("A")){
			System.out.print("Matricula: ");
			String matricula = scan.nextLine().trim();

			System.out.print("Grupo: ");
			String nome = scan.nextLine();
			
			System.out.println(System.lineSeparator() + controle.alocaAluno(matricula, nome.toUpperCase()) + System.lineSeparator());
			
		} else if (op.equals("I")){
			System.out.print("Grupo: ");
			String nome = scan.nextLine();
			
			System.out.println(System.lineSeparator() + controle.imprimeGrupo(nome.toUpperCase()) + System.lineSeparator());
			
		} else {
			System.out.println(System.lineSeparator() + "OPCAO INVALIDA!");
		}
		
	}
	
	private static void registraAluno() {
		System.out.print("Matricula: ");
		String matricula = scan.nextLine();
		
		
		System.out.println(System.lineSeparator() + controle.registraAluno(matricula) + System.lineSeparator());
	}
	
	private static void imprimeResponderam() {
		controle.imprimeResponderam();
	}

	public static void main(String[] args) {
		String op;

		do {
			menu();
			op = scan.nextLine().trim().toUpperCase();

			switch (op) {

			case "C":{
				cadastraAluno();
				break;
			}
			case "E":{
				exibeAluno();
				break;
			}
			case "N":{
				cadastraGrupo();
				break;
			}
			case "A":{
				alocaImprime();
				break;
			}
			case "R":{
				registraAluno();
				break;
			}
			case "I":{
				imprimeResponderam();
				break;
			}
			case "O":{
				break;
			}
			default:{
				throw new IllegalArgumentException ("OPCAO INVALIDA");
			}
		}
		} while (!op.equals("O"));

	}
	
}
