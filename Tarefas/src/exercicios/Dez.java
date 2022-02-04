package exercicios;

import java.util.Scanner;

public class Dez {
	
	public static Scanner valor;
	
	public static void main(String[] args) {
	
		valor = new Scanner(System.in);
		double piso = 13, m = 0.37, areaTotal, area, custo;
		
		System.out.print("Digite o valor da área em m²: ");
		areaTotal = valor.nextDouble();
		
		area = areaTotal / m;
		custo = area * piso;
		
		System.out.printf("O valor de custo será de: "+custo+" e a área total será de: "+area);
		
	}

}
