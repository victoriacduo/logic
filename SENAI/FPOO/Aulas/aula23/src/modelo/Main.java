package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public static Date nascimento;
	public static SimpleDateFormat df = new SimpleDateFormat("yyyy");
	public static void main(String[] args) throws ParseException {
		
		Arquivo arq = new Arquivo();
		
		Scanner input = new Scanner(System.in);

		int opcao = 0;
		
		do {
			System.out.println("1. Cadastrar");
			System.out.println("2. Listar");
			System.out.println("0. Sair");
			opcao = input.nextInt();
			input.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("Informe o seu nome: ");
				String nome = input.nextLine();
				
				System.out.println("Informe o ano que você nasceu: ");
				nascimento = df.parse(input.next());
				
				String lendo = nome + "\t" + calcIdade();
				
				arq.armazenar(lendo, "Nomes", true);
				break;
			case 2:
				ArrayList<String> infoFile = arq.ler("Nomes");
				
				System.out.println("Informe o nome: ");
				
				for(String linha : infoFile) {
					System.out.println(linha);
				}
				break;
			case 0:
				System.out.println("Tchau");
				break;
			}	
		} while(opcao != 0);
	}
	
	public static int calcIdade() {
		Date hoje = new Date();
		@SuppressWarnings("deprecation")
		int anoDif = hoje.getYear() - nascimento.getYear();		
		return anoDif;
	}

}