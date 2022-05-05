package exercicios;

import java.util.Scanner;

public class Ex3 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 3 - Desenvolva um algoritmo que leia 10 valores e mostre o maior e o menor.
		
		int[] v = new int[10];
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("Digite um valor: ");
			v[i] = input.nextInt();
		}
		
		int maior = v[1];
		int menor = v[1];
		
		for (int i = 0; i < v.length; i++) {
			if(v[i] > maior) {
				maior = v[i];
			}
			
			if(v[i] < menor) {
				menor = v[i];
			}
			
		}
		
		System.out.println(maior);
		System.out.println(menor);
		
	}

}