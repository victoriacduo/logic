package exercicios;

import java.util.Scanner;

public class Ex6 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 6 - Receba dois valores do usuário e mostre a soma dos pares e ímpares entre esse intervalo.
		
		int soma = 0;
		
		System.out.print("Insira dois valores: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		for(int i = n1; i <= n2; i = i + 2) {
			
			if(n1 % 2 == 1) {
				soma += i;
			} else {
			 
				
			}
			
		}
		
		System.out.println(soma);
		
	}
	
}