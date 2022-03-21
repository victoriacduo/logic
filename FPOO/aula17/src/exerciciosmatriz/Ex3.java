package exerciciosmatriz;

import java.util.Random;

public class Ex3 {	

	public static void main(String[] args) {
		
		// 3 Leia uma matriz de 3 x 3 elementos. Calcule e imprima a sua transposta
		
		int[][] vetor1 = new int[3][3];
		int[][] vetor2 = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; i++) {
				vetor1[i][j] = new Random().nextInt(100);
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(vetor1[i][j]);
			}
		}
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(vetor1[i][j] = vetor2[j][i]);
			}
		}
		
		

	}

}
