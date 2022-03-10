package correcao;

import java.util.Scanner;

public class Exer3 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 3 - Desenvolva um algoritmo que leia 10 valores e mostre o maior e o menor.
		
		int maior = 0, menor = 0, val;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe um valor qualquer: ");
			val = input.nextInt();
			
			if(i == 0) {
				maior = val;
				menor = val;
			} else {
				if(val > maior) maior = val;
				if(val < menor) menor = val;
					
			}
			
		}

		System.out.println(menor);
		System.out.println(maior);
		
	}

}
