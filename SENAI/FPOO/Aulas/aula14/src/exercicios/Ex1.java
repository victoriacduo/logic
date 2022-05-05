package exercicios;

import java.util.Scanner;

public class Ex1 {

	static Scanner input;
	
	public static void main(String[] args) {
		
		// 1 - Utilizando apenas o for, imprima os números pares entre dois valores informados pelo usuário.
		
		input = new Scanner(System.in);
		int[] v =  new int[2];
		
		System.out.print("Insira dois valores: ");
		v[0] = input.nextInt();
		v[1] = input.nextInt();
		int x = v[0];
		
		if(x%2 != 0) {
			x++;
		
		for(int i = x; i <= v[1]; i = i + 2) {
				System.out.println(i);
			}		
		
		} else {
			for(int i = x; i <= v[1]; i = i + 2) {
				System.out.println(i);
			}
			
		}
		
	}

}