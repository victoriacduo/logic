package modelo3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static int nota1;
	public static int nota2;
	public static int nota3;
	
	public static void main(String[] args) {
		// 3 - Armezene o nome dos alunos e os valores de 3 notas. Ao ler o conteúdo do
		// arquivo mostre o nome do aluno e sua média.
		
		Arquivo arq = new Arquivo();
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int opcao = 0;
		
		do {
			System.out.println("1. Cadastrar aluno");
			System.out.println("2. Listar alunos e médias");
			System.out.println("0. Sair");
			opcao = input.nextInt();
			input.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("Insira o nome do aluno: ");
				String nome = input.nextLine();
				
				System.out.println("Insira a 1º nota: ");
				nota1 = input.nextInt();
				
				System.out.println("Insira a 2º nota: ");
				nota2 = input.nextInt();
				
				System.out.println("Insira a 3º nota: ");
				nota3 = input.nextInt();
				
				String lendo = nome + "\t" + media();
				
				arq.armazenar(lendo, "Alunos", true);
				break;
			case 2:
				ArrayList<String> infoFile = arq.ler("Alunos");
				
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

	private static double media() {
		int media = (nota1 + nota2 + nota3) / 3;
		return media;
	}

}