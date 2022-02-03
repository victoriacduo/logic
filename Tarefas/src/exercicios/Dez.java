package exercicios;

import java.util.Scanner;

public class Dez {

	public static Scanner valor;
	
	public static void main(String[] args) {
		valor = new Scanner(System.in);
		double p = 13, rev = 0.37, areaTotal, area, custo;
		
		System.out.print("Digite o valor da área: ");
		areaTotal = valor.nextDouble();
		
		area = areaTotal / rev;
		custo = area * p;
		
		System.out.printf("O valor de custo será de R$ %.2f para uma area de %.2f", custo, area);

	}

}
