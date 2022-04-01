package visao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Cao;
import modelo.Gato;

public class Principal {

	static Scanner input = new Scanner(System.in);

	private static ArrayList<Cao> caes = new ArrayList<>();
	private static ArrayList<Gato> gatos = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("Bem-vindo ao nosso servi�o de cadastro!\n");
		
		int menu = 0;
		while (menu != 5) {
			System.out.println("Escolha: \n 1. Cadastrar C�o\t2. Cadastrar Gato\t3. Listar C�es\t4. Listar Gatos\t5. Sair");
			menu = input.nextInt();

			switch (menu) {
			case 1:
				cadastrarCao();
				break;
			case 2:
				cadastrarGato();
				break;
			case 3:
				listarCaes();
				break;
			case 4:
				listarGatos();
				break;
			case 5:
				System.out.println("Obrigado por utilizar nosso sistema, at� mais.");
				input.close();
			default:
				System.out.println("Op��o Inv�lida.");
			}

		}

	}

	private static void cadastrarCao() {
		System.out.println("----------------------[[[Cadastro de C�es]]]----------------------");
		System.out.println("Especie\tNome\tPeso\tRa�a\tQuantidade de Motoqueiros Atacados");
		Cao cao = new Cao(input.next(), input.next(), input.nextFloat(), input.next(), input.nextInt());
		caes.add(cao);

	}

	private static void cadastrarGato() {
		System.out.println("--------------[[[Cadastro de Gatos]]]--------------");
		System.out.println("Especie\tNome\tPeso\tRa�a\tQuantidade de Vidas");
		Gato gato = new Gato(input.next(), input.next(), input.nextFloat(), input.next(), input.nextInt());
		gatos.add(gato);

	}
	
	private static void listarCaes() {
		for(Cao c: caes) {
			System.out.println(c.toString());
		}

	}

	private static void listarGatos() {
		for(Gato g: gatos) {
			System.out.println(g.toString());
		}
	}

}