package modelo4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 4 - Crie um sistema de login utilizando arquivos.
				
		Arquivo arq = new Arquivo();
		
		Scanner input = new Scanner(System.in);

		int opcao = 0;
		
		do {
			System.out.println("1. Cadastrar nova conta");
			System.out.println("2. Acessar conta");
			System.out.println("0. Sair");
			opcao = input.nextInt();
			input.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("Insira o nome de usuário: ");
				String user = input.nextLine();
				
				System.out.println("Defina sua senha: ");
				String senha = input.next();
				
				String lendo = user + "\t" + senha;
				
				arq.armazenar(lendo, "Login", true);
				break;
			case 2:
				ArrayList<String> infoFile = arq.ler("Login");
				
				System.out.println("Insira seu usuário ou senha: ");
				String busca = input.nextLine();
				
				for(String linha : infoFile) {
					String[] temp = linha.split("\t");
					
					if((temp[0].toLowerCase().contains(busca.toLowerCase())) && (temp[1].toLowerCase().contains(busca.toLowerCase()))) {
						System.out.println("Bem-vindo " + temp[0]);
						System.out.println("Senha: " + temp[1]);
					}
			
				}
				break;
			case 0:
				System.out.println("Tchau");
				break;
			}	
		} while(opcao != 0);
	}
}