package exercicios;

import java.util.Random;

public class Ex5 {
	
	static Random rand = new Random();

	public static void main(String[] args) {
		// Faça um programa que leia e monte dois vetores de números inteiros com 20 
		// números cada. Depois de montados gere um terceiro vetor formado pela diferença 
		// dos dois vetores lidos, um quarto vetor formado pela soma dos dois vetores lidos e 
		// por último um quinto vetor formado pela multiplicação dos dois vetores lidos.

		int v1[], v2[], v3[], v4[], v5[];
		v1 = new int[20];
		v2 = new int[20];
		v3 = new int[20];
		v4 = new int[20];
		v5 = new int[20];
		
		for(int i = 0; i < 20; i++) {
			v1[i] = rand.nextInt(8);
			v2[i] = rand.nextInt(6);
		}
		
		for(int i = 0; i < 20; i++) {
			v3[i] = v1[i] - v2[i];
			v4[i] = v1[i] + v2[i];
			v5[i] = v1[i] * v2[i];
		}
		
		System.out.println("Primeiro vetor: ");
		
		for(int i = 0; i < 20; i++) {
			System.out.println(v1[i]);
	}
		
		System.out.println("Segundo vetor: ");
		
		for(int i = 0; i < 20; i++) {
			System.out.println(v2[i]);
	}
		
		System.out.println("Terceiro vetor: ");
		
		for(int i = 0; i < 20; i++) {
			System.out.println(v3[i]);
	}
		
		System.out.println("Quarto vetor: ");
		
		for(int i = 0; i < 20; i++) {
			System.out.println(v4[i]);
	}
		
		System.out.println("Quinto vetor: ");
		
		for(int i = 0; i < 20; i++) {
			System.out.println(v5[i]);
	}

}
	
}