package visao;

import java.util.Scanner;

import modelo.Prato;

public class Menu {
	
	private static Scanner input = new Scanner(System.in);
	private static Prato[] pratos =  new Prato[10];
	private static String itens[] = { "Cadastrar Prato", "Listar Pratos", "Sair"};
	private static int indice = 0;

	public static void main(String[] args) {
	
		int menu = 0;
		while(menu != 3) {
			System.out.println("1. Cadastrar Prato\t2.Listar Pratos\t3. Sair\nEscolha: ");
			menu = input.nextInt();
			switch(menu) {
			case 1:
				cadastrarPrato();
				break;
			case 2:
				listarPratos();
				break;
			case 3:
				System.out.println("Até mais");
				input.close();
				break;
			default:
				System.out.println("Opção Inválida");
			
			}
		}
	}

		private static void cadastrarPrato() {
			System.out.println("Cadastro de Pratos");
			System.out.println("CodigoPrato\tTipo\tNome\tDescrição\tPreço");
			pratos[indice] = new Prato(input.nextInt(), input.next(), input.next(), input.next(), input.nextFloat());
				input.next();
			indice++;
			
		}

		private static void listarPratos() {
			System.out.println("CodigoPrato\tTipo\tNome\tDescrição\tPreço");
			for(int i = 0; i < indice; i++) {
				System.out.println(pratos[i].toString());
			}
	}

}