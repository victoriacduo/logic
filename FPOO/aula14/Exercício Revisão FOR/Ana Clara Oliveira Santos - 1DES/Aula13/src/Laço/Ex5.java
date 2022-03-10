package Laço;

import java.util.Scanner;

public class Ex5 {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		
		System.out.println("Digite o valor do xerox: ");
		double xerox = entrada.nextDouble();
	
		double [][] tabela = new double[20][10];
		
		double k = 0;
			for(int i = 0; i < tabela.length; i++) {
				for ( int j = 0; j < 10; j++) {
					k = k + xerox;
					tabela[i][j] = k;
					
				}
			}
			int p = 0;
			for(int i = 0; i < tabela.length; i++) {
				for ( int j = 0; j < 10; j++) {
					p++;
					System.out.printf("0%d Cópias %.2f \t",p , tabela[i][j]);
					
				}
				System.out.println();
			}
			
		}
		
	}


