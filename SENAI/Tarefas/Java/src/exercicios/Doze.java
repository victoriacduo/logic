package exercicios;

import java.util.Scanner;

public class Doze {
	
	public static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		double filhos, salario, beneficio;
		
		System.out.print("Informe seu salário: ");
		salario = entrada.nextDouble();
		System.out.print("Informe o número de filhos: ");
		filhos = entrada.nextDouble();
		
		if (salario > 1655.98) {
			System.out.println("Você não pode receber o beneficio.");
		} else {
			beneficio = filhos * 56.47;
			System.out.printf("O beneficio recebido sera de R$%.2f", beneficio);
			
		}
		
	}

}
