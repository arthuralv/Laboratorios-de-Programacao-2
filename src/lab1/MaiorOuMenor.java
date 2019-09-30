package lab1;
import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class MaiorOuMenor {
	
	public static void verificaTamanho(String primeira, String segunda) {
		if (primeira.length() < segunda.length()) {
			System.out.println(primeira + "\n" + segunda);
		} else if (primeira.length() > segunda.length()){
			System.out.println(segunda + "\n" + primeira);
		} else {
			System.out.println(primeira + "\n" + primeira);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String primeira = scan.next(), segunda = scan.next();
		verificaTamanho(primeira, segunda);
		scan.close();
	}

}
