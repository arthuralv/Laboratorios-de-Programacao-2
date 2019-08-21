package lab1;
import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class Sorvete {
	
	public static void verificaVelocidade(int p1, int v1, int p2, int v2, int hora){
		int dist1 = v1 * hora + p1;
		int dist2 = v2 * hora + p2;
		System.out.println(Math.abs(dist1 - dist2));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		verificaVelocidade(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
		scan.close();
	}

}
