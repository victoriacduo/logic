package exercicios;

import java.util.Scanner;

public class Menu {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int menu = 0;
		
		System.out.println("Escolha uma op��o: ");
		System.out.println("1. Engatinhar");
		System.out.println("2. Andar");
		System.out.println("3. Correr");
		System.out.println("4. Pedalar");
		System.out.println("5. Dirigir");
		System.out.println("6. Pilotar");
		
		menu = entrada.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("Vem, nen�m.");
			break;
		case 2:
			System.out.println("Anda, nen�m");
			break;
		case 3:
			System.out.println("Corre, nen�m");
			break;
		case 4:
			System.out.println("Pedala, nen�m");
			break;
		case 5:
			System.out.println("Dirige, nen�m");
			break;
		case 6: 
			System.out.println("Pilota, nen�m");
			break;
		default:
			System.out.println("Op��o inv�lida, tente novamente");
			break;
		
		}

	}

}
