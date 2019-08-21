package lab1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class Notas {
	
	public static void verificaNumeros(int soma, ArrayList<Integer> numeros) {
		int acima = 0, abaixo = 0, maior = 0, menor = 0, media = 0;
		
		if (numeros.size() > 0){
			maior = Collections.max(numeros);
			menor = Collections.min(numeros);
			for (int num: numeros) if(num >= 700) acima++; else abaixo++;
			media = soma / numeros.size();
		}
		
		System.out.println("maior: " + maior
				+ "\n" + "menor: " + menor 
				+ "\n" + "media: " + media 
				+ "\n" + "acima: " + acima 
				+ "\n" + "abaixo: " + abaixo);
	}
	
	public static void main(String[] args) {
		ArrayList <Integer> numeros = new ArrayList <Integer> ();
		Scanner scan = new Scanner(System.in);
		String nome = scan.next();		
		int nota;
		int soma = 0;
		
		while(!nome.equals("-")) {
			nota = scan.nextInt();
			numeros.add(nota);
			soma += nota;
			nome = scan.next();
		}
		
		verificaNumeros(soma, numeros);		
		scan.close();
	}

}
