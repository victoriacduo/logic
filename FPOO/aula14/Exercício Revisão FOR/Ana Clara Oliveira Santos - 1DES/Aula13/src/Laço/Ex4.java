package Laço;

import java.util.Scanner;

public class Ex4 {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		  int numero = 0;
		  
		  System.out.printf("Digite um número: \n");
		  numero = entrada.nextInt();
	      System.out.println( "O fatorial de " + numero + " é: " + fatorial( numero ) );      
	   }
	 
	   public static int fatorial( int numero ) {
	      int fat = 1;
	      for( int i = 1; i <= numero; i++ ) {
	         fat *= i;
	      }
	 
	      return fat;

	}

}
