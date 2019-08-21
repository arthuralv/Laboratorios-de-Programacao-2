package lab1;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/

import java.util.Locale;
import java.util.Scanner;


public class Pass {

	public static void main(String[] args) {
		verificaMedia();
	}
	
	public static void verificaMedia() {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		System.out.println((scan.nextDouble() + scan.nextDouble()) / 2.0 >= 7 ? "pass: True!" : "pass: False!");
		scan.close();
	}

}
