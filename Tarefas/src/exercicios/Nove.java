package exercicios;

import java.util.Scanner;

public class Nove {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int a, b, result;
		
		System.out.print("Digite um número: ");
		a = entrada.nextInt();
		System.out.print("Digite outro número: ");
		b = entrada.nextInt();
		
		result = a + b;
		
		System.out.println("O valor da soma é = "+result);
		
	}

}
