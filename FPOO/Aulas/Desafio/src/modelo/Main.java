package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Arquivo arq = new Arquivo();

		Scanner input = new Scanner(System.in);

		int opcao = 0;

		do {
			System.out.println("1. Cadastrar");
			System.out.println("2. Listar");
			System.out.println("0. Sair");
			opcao = input.nextInt();
			input.nextLine();

			switch (opcao) {
			case 1:
				String vetorzinho[] = new String[5];

				System.out.println("Informe o seu nome: ");
				vetorzinho[0] = input.nextLine();

				System.out.println("Informe a sua idade: ");
				vetorzinho[1] = input.nextLine();

				System.out.println("Informe a sua cidade: ");
				vetorzinho[2] = input.nextLine();

				System.out.println("Informe seu estado civil: ");
				vetorzinho[3] = input.nextLine();

				System.out.println("Informe o número de pets que você tem: ");
				vetorzinho[4] = input.next();

				String data = "<ul>";
				for (int i = 0; i < vetorzinho.length; i++) {
					data += "<li>" + vetorzinho[i] + "</li>";
				}
				data += "</ul>";

				arq.armazenar(data, "Desafio", true);
				break;
			case 2:
				ArrayList<String> infoFile = arq.ler("Desafio");

				System.out.println("Informe o nome: ");

				for (String linha : infoFile) {
					System.out.println(linha);
				}
				break;
			case 0:
				System.out.println("Tchau");
				break;
			}
		} while (opcao != 0);
	}
}