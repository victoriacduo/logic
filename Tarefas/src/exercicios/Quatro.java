package exercicios;

import java.util.Scanner;

public class Quatro {
	
	public static Scanner entrada;
	
	public static void main(String[] args) {
	
		entrada = new Scanner(System.in);
		int vel = 900, d, t;
		
		System.out.println("Insira uma distância acima de 900km: ");
		d = entrada.nextInt();
		
		t = d / vel;
		
		if(d > 900) {
			System.out.println("Serão necessárias " + t + " horas para sobrevoar");
		} else {
			System.out.println("Serão necessárias menos de uma hora para sobrevoar");
		}
		
	}

}
