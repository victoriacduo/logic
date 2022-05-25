package exercicios;

import java.util.Scanner;

public class Um {

	public static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite um valor: ");
		a = entrada.nextInt();
		System.out.println("Digite outro valor: ");
		b = entrada.nextInt();
		System.out.println("Digite o último valor: ");
		c = entrada.nextInt();
		
		int result = (a + b) / c;
		
		System.out.println("O valor da expressão é: "+result);

	}

}
