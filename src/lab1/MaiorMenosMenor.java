package lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
* Laboratorio de Programacao 2 - Lab 1
*
* @author Arthur Almeida Alves - 119110792
*/
public class MaiorMenosMenor {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList <Integer> inteiros = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			inteiros.add(scan.nextInt());
		}
		
		subMaiorMenor(inteiros);
		scan.close();
	}

	private static void subMaiorMenor(ArrayList<Integer> inteiros) {
		System.out.println(Collections.max(inteiros) - Collections.min(inteiros));
	}

}
