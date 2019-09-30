package lab1;
import java.util.Scanner;
/**
* Laboratório de Programação 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/

public class FuncMono {
	public static void verificaNumeros(int a, int b, int c, int d) {
		if (a != b && a != c && a != d && b != c && b != d && c != d) {
			System.out.println("POSSIVELMENTE ESTRITAMENTE " + verificaOrd(a, b, c, d));
		}
		else {
			System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
		}
	}
	
	public static String verificaOrd(int a, int b, int c, int d) {
		if(a > b  && b > c && c > d) {
			return "DECRESCENTE";
		}
		else {
			return "CRESCENTE";
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, d;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		verificaNumeros(a, b, c, d);
		scan.close();
	}

}
