package Laço;

import java.util.Scanner;

public class Ex3 {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int x [] = new int[10];
		int maior = 0, menor = 999999;
		
		for(int i = 0; i < x.length; i++) {
			System.out.print("Digite o " + (i+1) + " ° valor: ");
			x[i] = entrada.nextInt();
			if (x[i] > maior) {
				maior = x[i];
			}
		}
		
		for(int j = 0; j < x.length; j++) {
			if (x[j] < menor) {
				menor = x[j];
			}
		}
		
		System.out.println("O maior valor é: " + maior );
		System.out.println("O menor valor é: " + menor );

	}

}
