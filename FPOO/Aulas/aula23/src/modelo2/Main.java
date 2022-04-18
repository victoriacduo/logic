package modelo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	// 2 - Escreva um arquivo de texto com números aleatórios, depois o leia e exiba
	// os números em ordem crescente.
	
	public static int vetorzinho[] = new int [5];
	
	public static void main(String[] args) {
		
		Arquivo arq = new Arquivo();
		
		Scanner input = new Scanner(System.in);

		int opcao = 0;
		
		do {
			System.out.println("1. Cadastrar");
			System.out.println("2. Ordenar");
			System.out.println("0. Sair");
			opcao = input.nextInt();
			input.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("Cadastrar aleatórios: ");
				
				for(int i = 0; i < vetorzinho.length; i++) {
					vetorzinho[i] = new Random().nextInt(10);
				}
				
				String lendo = ordemCrescente();
				
				arq.armazenar(lendo, "Numeros", false);
				
				break;
			case 2:
				ArrayList<String> infoFile = arq.ler("Numeros");
				
				for(String linha : infoFile) {
					String[] temp = linha.split("");
					System.out.println(linha);
					
				}
				break;
			case 0:
				System.out.println("Tchau");
				break;
			}	
		} while(opcao != 0);
	}

	private static String ordemCrescente() {
		
		String aleatoria = "";
		
		Arrays.sort(vetorzinho);
		
		for(int i = 0; i < vetorzinho.length; i++) {
			aleatoria += (vetorzinho[i] + " ");
		}
		
		return aleatoria;
	}

}