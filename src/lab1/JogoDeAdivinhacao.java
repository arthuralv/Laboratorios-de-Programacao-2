package lab1;
import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class JogoDeAdivinhacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		int chute;
		while(true) {
			chute = scan.nextInt();
			if (chute == numero) {
				System.out.println("ACERTOU");
				break;
			} else if (chute < numero) {
				System.out.println("MENOR");
			} else {
				System.out.println("MAIOR");
			}
			
		}
		scan.close();
	}

}
