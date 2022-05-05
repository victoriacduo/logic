package exercicios;

import java.util.Scanner;

public class Inss {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double salario, desconto;
		
		System.out.println("Informe seu salário: ");
		salario = entrada.nextDouble();
		
		if(salario > 2000) {
			desconto = salario * 11 / 100;
		}else if(salario < 1200) {
			desconto = salario * 9 / 100;
		}else {
			desconto = salario * 8 / 100;
		}
		
		salario = salario - desconto;
		System.out.println("O desconto será de: "+ desconto);
		System.out.println("O salário final será de: "+ salario);
		
	}

}
