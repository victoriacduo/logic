package modelo;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Aleatorios {
	
	public static Scanner scan;
	
	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		int menu = 0;
		
		while(menu !=4) {
			System.out.print("1. Números Inteiros\n2. Números Reais\n3. Nomes\n4. Sair");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				GerarInteiros();
				break;
			case 2:
				GerarReal();
				break;
			case 3:
				GerarNome();
				break;
			case 4:
				System.out.println("Obrigado");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			
		}
			
	}
		
	public static void GerarReal() {
		scan = new Scanner(System.in);
		Random rand = new Random();
			
		System.out.println("Digite quantos números deseja gerar: ");
		int quantidade = scan.nextInt();
			
		double[] numeros = new double[quantidade];
			
		for(int i = 0; i < quantidade; i++) {
			numeros[i] = rand.nextDouble() * 100;
			System.out.printf("%.2f\n", numeros[i]);
		}

	}
	
	public static void GerarInteiros() {
		scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Digite quantos números deseja gerar, até 10: ");
		int quantidade = scan.nextInt();
		
		int[] numeros = new int[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			numeros[i] = rand.nextInt(100);
			System.out.println(numeros[i]);
		}
		
	}
	
	public static void GerarNome() {
		scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Digite quantos nomes você deseja, até 10: ");
		int quantidade = scan.nextInt();
		
		String[] nomes = {"João", "Maria", "José", "Roberta", "Gabriel", "Pamela", "Rogger", "Juliana", "Antônio", "Weverton"};
		
		for(int i = 0; i < quantidade; i++) {
			int a = rand.nextInt(nomes.length);
			System.out.println(nomes[a]);
			
		}
		
	}

}