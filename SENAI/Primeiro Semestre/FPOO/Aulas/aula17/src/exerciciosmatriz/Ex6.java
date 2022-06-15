package exerciciosmatriz;

import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		
		// 6 Fa�a um programa para gerar automaticamente numeros entre 0 e 99 de uma
		// cartela de bingo. Sabendo que cada cartela devera conter 5 linhas de 5
		// n�meros, gere estes dados de modo a nao ter n�meros repetidos dentro das
		// cartelas. O programa deve exibir na tela a cartela gerada

		System.out.println("Bingo 5x5");
		int[][] Matriz = new int[5][5];
		int[] vetor = new int[25];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				Matriz[i][j] = new Random().nextInt(100);
			}

		}
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Matriz[i / 5][i % 5];

		}

		boolean repetido = false;
		
		for (int i = 0; i < vetor.length; i++) {
			do {
				for (int j = 0; j < vetor.length; j++) {
					repetido = false;
					
					if (vetor[i] == vetor[j] && i != j) {
						int value = new Random().nextInt(100);
						for (int vetor1 = 0; vetor1 < vetor.length; vetor1++) {
							
							if (value == vetor[vetor1]) {
								value = new Random().nextInt(100);
							}
							vetor[i] = value;
						}
						
						repetido = true;
					}
				}
				
			} while (repetido);
		}
		
		int k = 0;
		for (int j = 0; j < 5; j++) {
			for (int j2 = 0; j2 < 5; j2++) {
				Matriz[j][j2] = vetor[k];
				k++;
			}
		}

		for (int j2 = 0; j2 < 5; j2++) {
			for (int l = 0; l < 5; l++) {
				System.out.print(Matriz[j2][l] + "\t");
			}
			System.out.println();
		}
	}
}