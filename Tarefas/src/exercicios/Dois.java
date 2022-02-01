package exercicios;

import java.util.Scanner;

public class Dois {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		float velo, dist, tempo;
		
		System.out.println("Digite a velocidade: ");
		velo = entrada.nextFloat();
		System.out.println("Agora digite a distância: ");
		dist = entrada.nextFloat();
		
		tempo = dist / velo;
		
		System.out.println("Tempo em horas: "+tempo);
		
	}

}
