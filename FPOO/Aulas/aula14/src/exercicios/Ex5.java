package exercicios;

import java.util.Scanner;

public class Ex5 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 5 - Leia do usu�rio o valor do xerex e mostre uma tabela em que o n�mero apare�a 
		// multiplicado at� 200, sendo 10 em cada linha. Esta tabela � �til para deixar afixada em lojas de Xerox, por exemplo.

		System.out.print("Insira o valor do xerox: ");
		float val = input.nextFloat();
		
		for(int i = 0; i <= 200; i++) {
			
			System.out.printf("%d = %.2f\n", i, (val * i));
		}
		
	}

}
