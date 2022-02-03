package exercicios;

import java.util.Scanner;

public class Onze {

	public static Scanner IRRF;
	
	public static void main(String[] args) {
		IRRF = new Scanner(System.in);
		double salario, desconto;
		float porcentagem;
		
		System.out.print("Informe seu salário: ");
		salario = IRRF.nextDouble();
		
		if(salario < 1903.98) {
			porcentagem = 0f;
		}else if(salario < 2826.65) {
			porcentagem = 7.50f;
		}else if(salario < 3751.05) {
			porcentagem = 15f;
		}else if(salario < 4664.68) {
			porcentagem = 22.50f;
		}else {
			porcentagem = 27.50f;
		}
			
		if(porcentagem == 0f)
			desconto = 142.80;
		else
			desconto = salario * porcentagem / 100;
			
		System.out.printf("A aliquota aplicada é %.2f%% \n",porcentagem);
		System.out.printf("O IRRF será de %.2f\n",desconto);
		System.out.printf("Você irá receber %.2f\n", salario - desconto);

	}

}
