package exercicios;

import java.util.Scanner;

public class Treze {
	
	public static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.print("Digite o valor do 1� lado: ");
		a = entrada.nextInt();
		System.out.print("Digite o valor do 2� lado: ");
		b = entrada.nextInt();
		System.out.print("Digite o valor do 3� lado: ");
		c = entrada.nextInt();
		
		if (a == b && b == c) {
			System.out.println("O triangulo � equil�tero.");
		} else if (a != b && b != c) {
			System.out.println("O triangulo � escaleno");
		} else {
			System.out.println("O triangulo � is�sceles.");
			
		}
		
	}
	
}