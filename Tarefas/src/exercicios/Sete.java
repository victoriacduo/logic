package exercicios;

import java.util.Scanner;

public class Sete {

	public static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int den, m, vol;
		
		System.out.print("Insira a massa: ");
		m = entrada.nextInt();
		System.out.print("Insira o volume: ");
		vol = entrada.nextInt();
		
		den = m / vol;
				
		System.out.print("A densidade é = "+den);

	}

}
