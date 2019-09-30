package lab1;

import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class MaiorMenorPalavra {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra = scan.next();
		String maior = palavra;
		String menor = palavra;
		for(int i = 0; i < 4; i++) {
			palavra = scan.next();
			if (palavra.length() > maior.length()) {
				maior = palavra;
			} else if (palavra.length() < menor.length()) {
				menor = palavra;
			}
		}
		System.out.println(menor + System.lineSeparator() +  maior);
		scan.close();
	}

}
