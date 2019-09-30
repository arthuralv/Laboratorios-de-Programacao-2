package lab1;

import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class InicioDaVogal {
	
	public static void verificaVogal(String palavra) {
		System.out.println(("Aa".indexOf(palavra.toLowerCase().charAt(0)) != -1) ? "s" : "n");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			verificaVogal(scan.next());
		}
		
		scan.close();
	}

}
