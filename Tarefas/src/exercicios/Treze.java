package exercicios;

import java.util.Scanner;

public class Treze {
	
	public static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.print("Digite o valor do 1º lado: ");
		a = entrada.nextInt();
		System.out.print("Digite o valor do 2º lado: ");
		b = entrada.nextInt();
		System.out.print("Digite o valor do 3º lado: ");
		c = entrada.nextInt();
		
		if (a == b && b == c) {
			System.out.println("O triangulo é equilátero.");
		} else if (a != b && b != c) {
			System.out.println("O triangulo é escaleno");
		} else {
			System.out.println("O triangulo é isósceles.");
			
		}
		
	}
	
}