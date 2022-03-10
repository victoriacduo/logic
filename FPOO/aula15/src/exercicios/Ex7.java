package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {
	
	static Random rand = new Random();
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Dados dois vetores de tamanho N, faça uma função que diga se os mesmos possuam conteúdo igual.

		System.out.println("Dê o tamanho dos vetores: ");
		int n = input.nextInt();
		int v1[] = new int[n];
		int v2[] = new int[n];
		
		for(int i = 0; i < v1.length; i++) {
			v1[i] = rand.nextInt(5);
			
			System.out.print(v1[i] + "\t");
		}
		
			System.out.println();
		
		for(int i = 0; i < v2.length; i++) {
			v2[i] = rand.nextInt(5);
			
			System.out.print(v2[i] + "\t");
		}
		
			System.out.println();
		
		for(int i = 0; i < v1.length; i++) {
			for(int j = 0; j < v2.length; j++) {
				if(v1[i] == v2[j]) {
					
					int x = v1[i];
					
					System.out.print(x + "\t");
				}
			}
		}
		
	}

}