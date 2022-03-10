package Laço;

import java.util.Scanner;

public class Ex2 {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		System.out.println("Programa para calcular intervalo de números ímpares");
        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Os números ímpares entre " + numero1 + " e " + numero2 + " são:");
        
        if (numero1 % 2 == 0) {
        	for (int i = numero1 +1; i <= numero2; i+=2) {
            System.out.print(" " + i);
        	}
        	} else {  
        		for (int i = numero1; i <= numero2; i+=2) {
        	        System.out.print(" " + i);
        		
        	}
		}	
	}
}

