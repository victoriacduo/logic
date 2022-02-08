package exercicios;

import java.util.Scanner;

public class Tres {
	
	public static Scanner entrada;

	public static void main(String[] args) {
	
		entrada = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um valor inteiro, positivo e diferente de zero: ");
		n = entrada.nextInt();
		
		if(n > 0) {
			System.out.println("N - 1 = " + (n-1) + " e N + 1 = " + (n+1));
		} else {
			System.out.println("N não é inteiro, positivo e diferente de zero");
		}
					
	}

}