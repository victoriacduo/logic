package exerciciosmatriz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Ex6 {

	 public static void main(String[] args) {
	     // 6 Faça um programa para gerar automaticamente numeros entre 0 e 99 de uma cartela de bingo. 
		 // Sabendo que cada cartela devera conter 5 linhas de 5 números, gere estes dados de modo a nao 
		 // ter números repetidos dentro das cartelas. O programa deve exibir na tela a cartela gerada.   
		 
		 int[][] matriz = new int[5][5];
		 int[] vetor = new int[25];
		 
		 for(int i = 0; i < 5; i++) {
			 for(int j = 0; j < 5; j ++) {
				 matriz[i][j] = new Random().nextInt(100);
		 }
	}
			 for(int i = 0; i < matriz.length; i++) {
				 vetor[i] = matriz[5][5];
				 
				 
				 
				 
		
				 }
			 }
			 
}