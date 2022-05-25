package modelo;

import java.util.Scanner;

public class Fgts {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int valor = 3;
		
		String[] nome = new String[valor];
		int[] salario = new int[valor];
		
		for(int i = 0; i < valor; i++) {
		
			System.out.print("Nome[" + i + "]: ");
			nome[i] = input.next();
			System.out.print("Salário[" + i + "]: ");
			salario[i] = input.nextInt();
			
		}
		for(int i = 0; i < valor; i ++) {
			
			System.out.println(nome[i] +" R$"+ (salario[i] * 0.08));
		}

	}

}
