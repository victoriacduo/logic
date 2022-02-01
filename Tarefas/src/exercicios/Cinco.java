package exercicios;

import java.util.Scanner;

public class Cinco {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int ca, al, vi, resto;
		
		System.out.println("Há quantos caminhões nesta fazenda? ");
		ca = 18 * entrada.nextInt();
		System.out.println("Quantos alquires a fazenda possui? ");
		al = 250 * entrada.nextInt();
		
		vi = al / ca;
		resto = al % ca;
		
		if(resto > 0) {
			System.out.println("Serão necessárias "+ (vi + 1) +" viagens para entregar toda a colheita");
		} else {
			System.out.println("Serão necessárias "+ vi +" viagens para entregar toda a colheita");
		}

	}

}
