package exercicios;

import java.util.Scanner;

public class Prova {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		double salario, desconto, porcentagem = 0, INSS = 0, IRRF = 0, FGTS = 0;
		int opcao = 0;

		System.out.print("Digite o nome do funcionário: ");
		String nome = entrada.nextLine();
		System.out.print("Informe seu salário: ");
		salario = entrada.nextDouble();
		
		while (opcao !=4) {
		System.out.println("1. INSS\n2. IRRF\n3. FGTS\n4. Sair");
		opcao = entrada.nextInt();
		switch (opcao) {
		
		case 1:
			if(salario <= 1751.81) {
				porcentagem = 0.08;
			}else if(salario < 2919.72) {
				porcentagem = 0.09;
			}else if(salario < 5839) {
				porcentagem = 0.11;
			}else if(salario > 1903.99) {
				porcentagem = 0.20;
			}
				
			if(porcentagem == 0f) {
				desconto = 142.80;
			} else {
				desconto = salario * porcentagem;
			}
			
			INSS = salario - desconto;
			System.out.println("Nome: "+nome);
			System.out.println("Salário: "+salario);
			System.out.println("INSS: "+INSS);
			
			break;
			
		case 2:
			if(INSS > 4664.68) {
				porcentagem = 0.0;
			}else if(INSS > 3751.06) {
				porcentagem = 27.50;
			}else if(INSS > 2826.66) {
				porcentagem = 15;
			}else if(INSS > 1903.99) {
				porcentagem = 7.5;
			}else {
				System.out.println("Isento.");
			}
	
			if(porcentagem == 0) {
				desconto = 869.36;
			} else {
				desconto = INSS * porcentagem;
			}
			
			IRRF = INSS - desconto;
			System.out.println("Nome: "+nome);
			System.out.println("Salário: "+salario);
			System.out.println("IRRF: "+IRRF);
			
			break;
		case 3:
			FGTS = salario * 0.08;
			System.out.println("Nome: "+nome);
			System.out.println("Salário: "+salario);
			System.out.println("FGTS: "+FGTS);
			
			break;
		case 4:
			System.out.println("Nome: "+nome);
			System.out.println("Salário: "+salario);
			System.out.println("Salário com desconto do INSS: "+INSS);
			System.out.println("Salário com desconto do IRRS: "+IRRF);
			System.out.println("Salário com desconto do FGTS: "+FGTS);
			
	}

}
}
}
