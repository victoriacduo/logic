package exercicios;

import java.util.Scanner;

public class Ex4 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		System.out.print("Insira um valor: ");
		int val = input.nextInt();
		
		int f = 1;
		
		for(int i = val; i > 0; i--) {
			f = f * i;
			
			System.out.println(i + " ");
			
		}
		
		System.out.printf("%d", f);
		
	}

}