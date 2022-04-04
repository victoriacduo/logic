package visao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Carro;
import modelo.Moto;

public class Principal {
	
	static Scanner input = new Scanner(System.in);
	
	private static ArrayList<Carro> carros = new ArrayList<>();
	private static ArrayList<Moto> motos = new ArrayList<>();
	
	public static void main(String[] args) throws ParseException {
		
		System.out.println("Bem-vindo ao nosso serviço de cadastro!\n");
		
		int menu = 0;
		while (menu != 5) {
			System.out.println("Escolha: \n 1. Cadastrar Carro\t2. Cadastrar Moto\t3. Listar Carros\t4. Listar Motos\t5. Sair");
			menu = input.nextInt();

			switch (menu) {
			case 1:
				cadastrarCarro();
				break;
			case 2:
				cadastrarMoto();
				break;
			case 3:
				listarCarros();
				break;
			case 4:
				listarMotos();
				break;
			case 5:
				System.out.println("Obrigado por utilizar nosso sistema, até mais.");
				input.close();
			default:
				System.out.println("Opção Inválida.");
			}

		}

	}

	private static void cadastrarCarro() throws ParseException {
		System.out.println("----------------------[[[Cadastro de Carros]]]----------------------");
		System.out.println("Placa\tAno do Modelo\tAno de Fabricação\tModelo\tMarca\tValor");
		Carro carro = new Carro(input.next(), input.nextInt(), input.nextInt(), input.next(), input.next(), input.nextDouble(), input.next(), input.nextInt());
		carros.add(carro);
		
	}

	private static void cadastrarMoto() throws ParseException {
		System.out.println("----------------------[[[Cadastro de Motos]]]----------------------");
		System.out.println("Placa\tAno do Modelo\tAno de Fabricação\tModelo\tMarca\tValor");
		Moto moto = new Moto(input.next(), input.nextInt(), input.nextInt(), input.next(), input.next(), input.nextDouble(), input.nextInt());
		motos.add(moto);
		
	}

	private static void listarCarros() {
		for(Carro c: carros) {
			System.out.println(c.toString());
		}
		
	}

	private static void listarMotos() {
		for(Moto m: motos) {
			System.out.println(m.toString());
		}
		
	}
}