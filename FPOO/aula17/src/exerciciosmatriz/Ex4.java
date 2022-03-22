package exerciciosmatriz;

import java.util.Random;

public class Ex4 {

	public static void main(String[] args) {
		// 4 Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao acima da diagonal principal.

		int[][] matriz = new int [3][3];
		int soma = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = new Random().nextInt(50);
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%5d ", matriz[i][j]);
			}

			System.out.println();
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if(i == j) {
					soma = soma + matriz[i][j];
				}
			}
			
		}
		
		System.out.println("aaaaaaa: " + soma);
		
	}

}