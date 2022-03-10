package exercicios;

import java.util.Scanner;

public class Ex3 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Ler um vetor de 10 elementos inteiros e positivos. Criar um segundo vetor da seguinte forma: 
		// os elementos de índice par receberão os respectivos elementos divididos por 2; os elementos 
		// de índice ímpar receberão os respectivos elementos multiplicados por 3. Imprima os dois vetores.

		float v1[], v2[];
		v1 = new float[10];
		v2 = new float[10];
		
		System.out.println("Digite 10 números inteiros e positivos: ");
		
		for(int i = 0; i < 10; i++) {
			v1[i] = input.nextFloat();
		}
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				v2[i] = v1[i] / 2;
			} else {
				v2[i] = v1[i] * 3; 
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Vetor 1: " + v1[i]);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Vetor 2: " + v2[i]);
	}

}
	
}