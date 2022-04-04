package exerciciosmatriz;

import java.util.Random;

public class Ex8 {

	public static void main(String[] args) {
		
//		8 Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op�oes:
//		(a) somar as duas matrizes.
//		(b) subtrair a primeira matriz da segunda.
//		(c) adicionar uma constante as duas matrizes.
//		(d) imprimir as matrizes.

		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz1[i][j] = new Random().nextInt(100);
				matriz2[i][j] = new Random().nextInt(100);
			}
		}

		System.out.println("Primeira matriz");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matriz1[i][j] + "\t");

			}
			
			System.out.println();
		}

		System.out.println("Segunda matriz");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matriz2[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("Soma das matrizes");
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print((matriz1[i][j] + matriz2[i][j]) + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("Subtra��o das matrizes");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print((matriz1[i][j] - matriz2[i][j]) + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("Constante das matrizes (coluna 2 e linha 2 = 50)");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz1[1][1] = 50;
				System.out.print(matriz1[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("Constante das matrizes (coluna 2 e linha 2 = 50)");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz2[1][1] = 50;
				System.out.print(matriz2[i][j] + "\t");
			}
			
			System.out.println();
			
			}
	} 
}
