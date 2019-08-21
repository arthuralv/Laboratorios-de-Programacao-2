package lab1;

import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class AbaixoAssinado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra;
		int contador = 0;
		int media = 0;
		
		while(true) {
			palavra = scan.next();
			if(palavra.equals("fim")) break;
			media += scan.nextInt();
			contador++;
		}
		
		media /= contador;
		System.out.println(contador + System.lineSeparator() + media);
		scan.close();
	}

}
