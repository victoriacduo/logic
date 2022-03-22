package exerciciosmatriz;

import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		// 3 Leia uma matriz de 3 x 3 elementos. Calcule e imprima a sua transposta

		int[][] matriz = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = new Random().nextInt(20);
			}

		}

		System.out.println("Matriz:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%d \t", matriz[i][j]);
			}

			System.out.printf("%n");
		}

		System.out.println("Matriz transposta:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%d \t", matriz[j][i]);
				;
			}

			System.out.printf("%n");
		}

	}

}