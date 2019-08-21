package lab1;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/

import java.util.Scanner;

public class DobroTriplo {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
		System.out.println("dobro: " + valor * 2 + ", triplo: " + valor * 3);
		scan.close();
	}
}
