package exercicios;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1;
		
		System.out.print("Qual a sua idade? ");
		n1 = entrada.nextInt();
		
		if (n1 >= 18) {
			System.out.println("Voc� � maior de idade.");
		}else {
			System.out.println("Voc� � menor de idade.");
		}
					
	}
	
}
