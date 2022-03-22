package exerciciosmatriz;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// 2 Leia uma matriz 5 x 5. Leia tambem um valor X. O programa devera fazer uma
		// busca desse
		// valor na matriz e, ao final, escrever a localização (linha e coluna)
		// ou uma mensagem de "nao encontrado".

		int[][] vetor = new int[5][5];
		int x;
		int y = 0;

		System.out.print("Insira um número de 0 a 100: ");
		x = input.nextInt();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				vetor[i][j] = new Random().nextInt(100);
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d \t", vetor[i][j]);
			}

			System.out.printf("%n");

		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (x == vetor[i][j]) {
					y = vetor[i][j];

					System.out.println("Coluna: " + j + "\tLinha: " + i);
				}
			}

		}
		
		if (x != y) {
			System.out.println("Não encontrado.");
		}

	}
}