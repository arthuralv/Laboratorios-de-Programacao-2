package lab1;
import java.util.Scanner;

/**
* Laboratório de Programação 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/

public class Media {

	public static void calculaMedia() {
		Scanner scan = new Scanner(System.in);
		String [] lista = scan.nextLine().split(" ");
		double media = 0;
		for(int i = 0; i < lista.length; i++) {
			media += Integer.parseInt(lista[i]);
		}
		media /= lista.length;
		boolean primeiro = true;
		for(String num: lista) {
			if (Integer.parseInt(num) > media) {
				if(primeiro) {
					System.out.print(num);
					primeiro = !primeiro;
				} else {
					System.out.print(" " + num);
				}
			}
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		calculaMedia();		
	}

}
