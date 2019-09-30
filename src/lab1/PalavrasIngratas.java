package lab1;

import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class PalavrasIngratas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = 0;
		
		while(c != 3) {
			if(!verificaVogal(scan.next())) c++;
		}
		
		scan.close();
	}

	public static boolean verificaVogal(String palavra) {
		for (int i = 0; i < palavra.length(); i++) {
			if("AEIOUaeiou".indexOf(palavra.charAt(i)) != -1) return true;
		}
		
		System.out.println(palavra);
		return false;
	}

}
