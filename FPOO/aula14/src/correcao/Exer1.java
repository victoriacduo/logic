package correcao;

import java.util.Scanner;

public class Exer1 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 1 - Utilizando apenas o for, imprima os n�mentre dois valores informados pelo usu�rio.
		
		
		System.out.println("Informe o in�cio do intervalo: ");
		int inicio = input.nextInt();
		
		System.out.println("Informe o fim do intervalo: ");
		int fim = input.nextInt();
		
		// % 2 --- come�ando em 0, de dois em dois, � um par
		// come�ando em 1, de dois em dois, � um impar; 
		// o que define � o in�cio, onde t� o contador inicial
		// o % pega o resto da divis�o, \ pega o resultado
		
		if(inicio % 2 != 0) inicio++;
		
		for(int i = inicio; i <= fim; i += 2) {
			System.out.println(i);
		}

	}

}
