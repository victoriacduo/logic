package exercicios;

import java.util.Scanner;

public class Ex2 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Ler um vetor de 10 elementos. Crie um segundo vetor, com todos os elementos 
		// na ordem inversa, ou seja, o �ltimo elemento passar� a ser o primeiro, o pen�ltimo ser� o segundo e assim por diante. Imprima os dois vetores.

		int v1[], v2[];
		v1 = new int[10];
		v2 =  new int[10];
		
		System.out.println("Insira 10 n�meros: ");
		
		for(int i = 0; i < v1.length; i++) {
			
			v1[i] = input.nextInt();
		}
		
		System.out.println("Vetor 1:");
		
		for(int i = 0; i < v1.length; i++) {
			
//			v2[i] = input.nextInt();
			
			System.out.print(v1[i] + "\t");
		
		}
		
		System.out.println();
		
		System.out.println("Vetor 2:");
		
		for(int i = 0; i < v1.length; i++) {
			
			System.out.print((v2[i] = v1[9-i]) + "\t");
		}
		
	}

}