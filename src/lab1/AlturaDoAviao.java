package lab1;
import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class AlturaDoAviao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double ideal = scan.nextInt();
		double atual = scan.nextInt();
		double aprx = Math.abs(ideal - atual);
		double altura, aprxAtual;
		while(true) {
			altura = scan.nextInt();
			aprxAtual = ideal - altura;
			aprxAtual = (aprxAtual < 0) ? -aprxAtual : aprxAtual;
			if (aprxAtual == 0) {
				System.out.println("OK");
				break;
			} else if (aprxAtual >= aprx) {
				System.out.println("PERIGO");
			} else if (aprxAtual < aprx){
				System.out.println("ADEQUADO");
			}
			aprx = aprxAtual;			
		}
		scan.close();
	}

}
