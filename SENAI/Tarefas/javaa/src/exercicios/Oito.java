package exercicios;

import java.util.Scanner;

public class Oito {

	public static Scanner entrada;
	
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		double a, b, result;
		
		System.out.print("Insira um n�mero: ");
		a = entrada.nextDouble();
		System.out.print("Insira outro n�mero: ");
		b = entrada.nextDouble();
		
		result = a % b;
		
		System.out.println("O valor do resto dessa divis�o ser�: "+result);

	}

}
