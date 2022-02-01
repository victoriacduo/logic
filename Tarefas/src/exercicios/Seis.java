package exercicios;

import java.util.Scanner;

public class Seis {
	
	public static Scanner entrada;

	public static void main(String[] args) {
	
		entrada = new Scanner(System.in);
		double r, a, base, result, area;
		
		System.out.print("Qual o raio do cilindro? ");
		r = entrada.nextDouble();
		System.out.print("E a altura? ");
		a = entrada.nextDouble();
		
		base = 3.14 * (r * r);
		result = base * a;
		
		area = 3.14 * r * (r + a);
		
		System.out.print("A área do cilindro é "+ area +" e o volume é "+ result);

	}

}
