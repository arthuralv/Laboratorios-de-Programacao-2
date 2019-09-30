package lab1;
import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class RepresentacaoDeCores {
	
	public static void verificaCor(int x, int y, int z) {
		if(x < 128|| y < 128 || z < 128) {
			System.out.println("PRETO");
		} else {
			System.out.println("BRANCO");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		verificaCor(scan.nextInt(), scan.nextInt(), scan.nextInt());
		scan.close();	
	}

}
