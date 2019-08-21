package lab1;
import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class PalavrasPoeticas {

	public static void verificaPoesia(String prim, String seg) {
		 if (prim.charAt(0) == seg.charAt(0) && prim.charAt(prim.length() - 1) == seg.charAt(seg.length() - 1)) {
			 System.out.println("S");
		 } else { 
			 System.out.println("N");
		 }
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		verificaPoesia(scan.next(), scan.next());
		scan.close();
	}

}
