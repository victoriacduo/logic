package exerciciosmatriz;

import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {

		// 1 Leia uma matriz 5 x 5, imprima a matriz e retorne a localizaçao (linha e a
		// coluna) do maior valor.

		int[][] matriz = new int[5][5];
		int maior = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = new Random().nextInt(100);
			}

		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d \t", matriz[i][j]);
			}

			System.out.printf("%n");
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] > maior) {

					maior = matriz[i][j];

				}
			}
		}

		System.out.println("\nO maior número é " + maior);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (maior == matriz[i][j]) {
					System.out.print("Coluna: " + (j + 1) + "\tLinha: " + (i + 1));
				}

			}
		}

	}

}