package correcao;

import java.util.Scanner;

public class Exer1 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 1 - Utilizando apenas o for, imprima os númentre dois valores informados pelo usuário.
		
		
		System.out.println("Informe o início do intervalo: ");
		int inicio = input.nextInt();
		
		System.out.println("Informe o fim do intervalo: ");
		int fim = input.nextInt();
		
		// % 2 --- começando em 0, de dois em dois, é um par
		// começando em 1, de dois em dois, é um impar; 
		// o que define é o início, onde tá o contador inicial
		// o % pega o resto da divisão, \ pega o resultado
		
		if(inicio % 2 != 0) inicio++;
		
		for(int i = inicio; i <= fim; i += 2) {
			System.out.println(i);
		}

	}

}
