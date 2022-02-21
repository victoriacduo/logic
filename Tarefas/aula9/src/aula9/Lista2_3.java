package aula9;

import java.util.Scanner;

public class Lista2_3 {

	public static void main(String[] args) {
		int[] idades = leVetor();
		
		mostra(idades);
		
		int maioridade = maiorIdade(idades);
		System.out.println("A maior idade é: " + maioridade);

	}
	
	public static int[] leVetor() {
		int[] lerVetor = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < lerVetor.length; i++) {
			System.out.println("Digite uma idade: ");
			lerVetor[i] = input.nextInt();
		
		}
	
	return lerVetor;

	}
	
	public static void mostra(int[] imprimir) {
		
		for(int i = 0; i < imprimir.length; i++) {
			System.out.println(i + "\t" + imprimir[i]);
			
		}
	}
	
	public static int maiorIdade(int[] calcular) {
		int maioridade = 0;
		
		for(int i = 0; i < calcular.length; i++) {
			if(calcular[i] > maioridade) {
				maioridade = calcular[i];
			}
		}
		
	return maioridade;
	}
}