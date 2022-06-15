package correcao;

import java.util.Scanner;

public class Exer5 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// 5 - Leia do usuário o valor do xerex e mostre uma tabela em que o número apareça 
		// multiplicado até 200, sendo 10 em cada linha. Esta tabela é útil para deixar afixada em lojas de Xerox, por exemplo.

		System.out.println("Informe o valor do xerox: ");
		float val = input.nextFloat();
		
		int cont = 0;
		
		for(int i = 1; i <= 200; i++) {
			System.out.printf("%d = %.2f\t", i, (val * i));
			
			cont ++;
			if(cont == 10) {
				cont = 0;
				System.out.println();
			}
			
		}
		
	}

}