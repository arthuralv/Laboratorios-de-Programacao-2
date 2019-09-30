package lab1;
import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class Wally {
	
	public static String encontraWally(String [] lista) {
		String wally = "?";
		for(String nome: lista) {
			if(nome.length() == 5) {
				wally = nome;
			}
		}
		return wally;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome = encontraWally(scan.nextLine().split(" "));
		while(true) {
			if(nome.equals("wally")) break;
			System.out.println(nome);
			nome = encontraWally(scan.nextLine().split(" "));
		}
		scan.close();
	}

}
