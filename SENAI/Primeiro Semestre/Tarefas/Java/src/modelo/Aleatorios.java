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
			System.out.print("1. N�meros Inteiros\n2. N�meros Reais\n3. Nomes\n4. Sair");
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
				System.out.println("Op��o inv�lida");
				break;
			}
			
		}
			
	}
		
	public static void GerarReal() {
		scan = new Scanner(System.in);
		Random rand = new Random();
			
		System.out.println("Digite quantos n�meros deseja gerar: ");
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
		
		System.out.println("Digite quantos n�meros deseja gerar, at� 10: ");
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
		
		System.out.println("Digite quantos nomes voc� deseja, at� 10: ");
		int quantidade = scan.nextInt();
		
		String[] nomes = {"Jo�o", "Maria", "Jos�", "Roberta", "Gabriel", "Pamela", "Rogger", "Juliana", "Ant�nio", "Weverton"};
		
		for(int i = 0; i < quantidade; i++) {
			int a = rand.nextInt(nomes.length);
			System.out.println(nomes[a]);
			
		}
		
	}

}