package lab1;

import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class FiltroDeTemperatura {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		int contador = 0;
		
		while(true) {
			numero = scan.nextInt();
			
			if (numero == 0) {
				break;
			} else if (numero < 0) {
				contador++;
			}
		}
		
		System.out.println(contador);
		scan.close();
	}

}
