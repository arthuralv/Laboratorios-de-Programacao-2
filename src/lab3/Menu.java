package lab3;

import java.util.Scanner;

public class Menu {
	

	static Scanner scan = new Scanner(System.in);
	
	/**
	 * Representacao do Menu de opcoes para Agenda
	 * @author Arthur Almeida Alves
	 */
	
	
	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		String op;
		
		do {
			System.out.print(mostraMenu());
			op = scan.nextLine().split(" ")[0];
			System.lineSeparator();
			switch(op.toUpperCase()) {
			case "C":
				cadastrar(agenda, scan);
				break;
			case "L":
				System.out.println(agenda.listaContatos());
				break;
			case "E":
				System.out.print("Posicao: ");
				int posicao = scan.nextInt();
				scan.nextLine();
				System.out.println(agenda.exibirContato(posicao));
				break;
			case "S":
				break;
			default:
				System.out.println("OPCAO INVALIDA!" + System.lineSeparator());
			}
		} while (!"S".equals(op));
		
		scan.close();
	}
	
	public static void exibir(Agenda agenda) {
		
		
	}

	public static String mostraMenu() {
		return	"(C)adastrar Contato" + System.lineSeparator()
				+ "(L)istar Contatos" + System.lineSeparator()
				+ "(E)xibir Contato" + System.lineSeparator()
				+ "(S)air" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Opcao> ";	
	}
	
	public static void cadastrar(Agenda agenda, Scanner scan) {
		System.out.print("Posicao: ");
		int posicao = scan.nextInt();
		scan.nextLine();
		if (posicao < 101 || posicao > 0) {
			System.out.print("Nome: ");
			String nome = scan.nextLine();
			System.out.print("Sobrenome: ");
			String sobrenome = scan.nextLine();
			System.out.print("Telefone: ");
			String telefone = scan.nextLine();
			agenda.cadastraContato(posicao, nome, sobrenome, telefone);
		} else {
			System.out.println("POSICAO INVALIDA");
		}
	
	}

}
