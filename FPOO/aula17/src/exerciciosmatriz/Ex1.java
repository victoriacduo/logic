package exerciciosmatriz;

import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {

		// 1 Leia uma matriz 5 x 5, imprima a matriz e retorne a localizaçao (linha e a
		// coluna) do maior valor.

		int[][] vetor = new int[5][5];
		int maior = 0;

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

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i][j] > maior) {

					maior = vetor[i][j];

				}
			}
		}

		System.out.println("\nO maior número é " + maior);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (maior == vetor[i][j]) {
					System.out.print("Coluna: " + (j + 1) + "\tLinha: " + (i + 1));
				}

			}
		}

	}

}