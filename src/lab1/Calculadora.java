package lab1;
import java.util.Locale;
import java.util.Scanner;
/**
* Laboratório de Programação 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class Calculadora {
	
	public static double soma(double x, double y) {
		return x + y;
	}
	
	public static double subtracao(double x, double y) {
		return x - y;
	}
	
	public static double multiplicacao(double x, double y) {
		return x * y;
	}
	
	public static double divisao(double x, double y) {
		return x / y;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		switch(scan.nextLine()) {
			case "+":{
				System.out.println("RESULTADO: " + soma(scan.nextDouble(), scan.nextDouble()));
				break;
			}
			case "-":{
				System.out.println("RESULTADO: " + subtracao(scan.nextDouble(), scan.nextDouble()));
				break;
			}
			case "*":{
				System.out.println("RESULTADO: " + multiplicacao(scan.nextDouble(), scan.nextDouble()));
				break;
			}
			case "/":{
				double x, y;
				x = scan.nextDouble();
				y = scan.nextDouble();
				if (y == 0) {
					System.out.println("ERRO");
				}
				else {
					System.out.println("RESULTADO: " + divisao(x, y));
				}
				
				break;
			}
			default: System.out.println("ENTRADA INVALIDA");	
		}
		scan.close();
	}
}
