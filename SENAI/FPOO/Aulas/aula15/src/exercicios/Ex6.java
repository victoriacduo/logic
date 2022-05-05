package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {
	
	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();

	public static void main(String[] args) {
		
		// Utilizando vetores, crie um programa que organize uma quantidade 
		// qualquer de números inteiros fornecidos pelo usuário da seguinte forma: 
		// primeiro os números pares em ordem crescente e depois os números ímpares em ordem decrescente.

		System.out.println("Insira quantos números deseja organizar: ");
		int numeros = input.nextInt();
		
		int n1 = 0;
		int n2 = 0;
		int par = 0;
		int impar = 0;
		int[] v1 = new int[numeros];
		
		System.out.println("1º Vetor:");
		
		for(int i = 0; i < v1.length; i++) {
			
			v1[i] = rand.nextInt(10);
			
			if(v1[i] % 2 == 0) {
				n1++;
			} else {
				n2++;
			}
			
		}
		
		for(int i = 0; i < v1.length; i++) {
			
			System.out.print(v1[i] + "\t");
			
		}
		
		int[] v2 = new int[n1];
		int[] v3 = new int[n2];
		
		for(int i = 0; i < v1.length; i++) {
			
			if(v1[i] % 2 == 0) {
				v2[par] = v1[i];
				par++;
			} else {
				v3[impar] = v1[i];
				impar++;
			}
		}
		
		int x = 0;
		
		for(int i = 0; i < v2.length; i++) {
			for(int j = 0; j < v2.length; j++) {
				
				if(v2[i] < v2[j]) {
					x = v2[i];
					v2[i] = v2[j];
					v2[j] = x;
				}
			}
		}
		
		for(int i = 0; i < v3.length; i++) {
			for(int j = 0; j < v3.length; j++) {
				
				if(v3[i] > v3[j]) {
					x = v3[i];
					v3[i] = v3[j];
					v3[j] = x;
				}
			}
		}
		
		System.out.println("\n2º Vetor:");
		for(int i = 0; i < v2.length; i++) {
			
			System.out.print(v2[i] + "\t");
			
		}
		
		System.out.println("\n3º Vetor:");
		for(int i = 0; i < v3.length; i++) {
			
			System.out.print(v3[i] + "\t");
			
		}
	}

}
