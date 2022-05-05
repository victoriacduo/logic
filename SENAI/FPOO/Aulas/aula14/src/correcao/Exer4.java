package correcao;

import java.util.Scanner;

public class Exer4 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// 4 - Leia um valor do usuário e calcule seu fatorial.
		
		System.out.println("Informe o valor a ser calculado: ");
		int val = input.nextInt();
		
		int fat = 1;
		
		for(int i = val; i >= 1; i--) {
			fat = fat * i;
			
		}
		
		System.out.print(fat);

	}

}
