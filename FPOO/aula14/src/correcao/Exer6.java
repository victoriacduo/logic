package correcao;

import java.util.Scanner;

public class Exer6 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 6 - Receba dois valores do usu�rio e mostre a soma dos pares e �mpares entre esse intervalo.

		System.out.println("Informe o in�cio da sequ�ncia: ");
		int inicio = input.nextInt();
		
		System.out.println("Informe o fim da sequ�ncia: ");
		int fim = input.nextInt();
		
		int somapar = 0, somaimpar = 0;
		
		for(int i = inicio; i <= fim; i++) {
			if(i%2 == 0) {
				somapar = somapar + i;
				//somapar += i;
			} else {
				somaimpar = somaimpar + i;
				//somaimar += i;
			}
		}
		
		System.out.println(somapar);
		System.out.println(somaimpar);
		
	}

}
