package lab1;
import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/

public class Meses {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] meses = scan.nextLine().split(" ");
		String [] gastos = scan.nextLine().split(" ");
		int i = 0;
		String objetivo = scan.next();
		
		while(i < meses.length){			
			
			if(meses[i].equals(objetivo)) {
				System.out.println(gastos[i]);
				break;
			}
			
			i++;
		}
		
		scan.close();
	}

}
