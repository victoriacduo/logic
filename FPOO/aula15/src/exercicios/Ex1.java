package exercicios;

import java.util.Scanner;

public class Ex1 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// 1 - Fa�a um programa que l� 10 n�meros inteiros do teclado e armazene em um vetor. Ao final imprima o vetor armazenado nos dois sentidos.

		int v[];
		v = new int[10];
		
		System.out.println("Insira 10 n�meros: ");
		
		for(int i = 0; i < v.length; i++) {
			v[i] = input.nextInt();
			
		}
		
		for(int i = 0; i < v.length; i++) {
			
			System.out.println(v[i]);
		}
		
		for(int i = 0; i < v.length; i++) {
			
			System.out.println(v[9-i]);
			
		}
		
	}

}
