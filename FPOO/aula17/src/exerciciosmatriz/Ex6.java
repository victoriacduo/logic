package exerciciosmatriz;

import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		// 6 Faça um programa para gerar automaticamente numeros entre 0 e 99 de uma
		// cartela de bingo.
		// Sabendo que cada cartela devera conter 5 linhas de 5 números, gere estes
		// dados de modo a
		// nao ter números repetidos dentro das cartelas. O programa deve exibir na tela
		// a cartela gerada.

		int[][] matriz = new int[5][5];
		int[] vetor_numeros = new int[25];
		System.out.println("Bingo 5x5");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = new Random().nextInt(100);
			}
		}

		for (int i = 0; i < vetor_numeros.length; i++) {
			vetor_numeros[i] = matriz[i / 5][i % 5];
		}

		boolean repetido = false;

		for (int i = 0; i < 5; i++) {

			for (int k = 0; k < 5; k++) {
				
				do {
					repetido = false;
					for (int j = 0; j < 5; j++) {
						for (int l = 0; l < 5; l++) {

							if (matriz[i][j] == matriz[k][l] && i != k && j != l) {
								int new_value = new Random().nextInt(100);
								for (int vetor = 0; vetor < vetor_numeros.length; vetor++) {
									if (new_value == vetor_numeros[vetor]) {
										new_value = new Random().nextInt(100);
									}
								}
							}
						}
					}
				} while (repetido);
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
