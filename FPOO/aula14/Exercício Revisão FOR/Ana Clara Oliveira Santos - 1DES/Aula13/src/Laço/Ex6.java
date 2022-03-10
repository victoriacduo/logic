package Laço;

import java.util.Scanner;

public class Ex6 {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		System.out.println("Programa para calcular intervalo de números pares");
		System.out.print("Digite o primeiro número: ");
		int numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = entrada.nextInt();
		
		System.out.print("Resultado: ");
		
		int soma1 = 0;
		if (numero1 % 2 == 0) {
			for (int i = numero1; i <= numero2; i+=2) {
				soma1 = soma1 + i;
				System.out.println(soma1);
	}
		}else {
			for (int i = numero1 + 1; i <= numero2; i+=2) {
				soma1 = soma1 + i;  
			        System.out.println(soma1);
			}
		}
	}		
}

	



