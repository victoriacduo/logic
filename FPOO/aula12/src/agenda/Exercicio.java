package agenda;

import java.util.Scanner;

public class Exercicio {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Digite quantos contatos deseja cadastrar: ");
		int opcao = 0;
		int qtd = scan.nextInt();
		Contato[] contatos = new Contato[qtd];
		
		System.out.println("id\tNome\tIdade\tTelefone");
		for(int i = 0; i < qtd; i++) {
			contatos[i] = new Contato();
			contatos[i].id = scan.nextInt();
			contatos[i].nome = scan.next();
			contatos[i].idade = scan.nextInt();
			contatos[i].telefone = scan.next();
		
		}
		
		Scanner menu = new Scanner(System.in);
		
		while(opcao != 5) {
			
			System.out.print("1. Mostrar todos\n2. Buscar por Id\n3. Buscar por Nome\n4. Buscar por Telefone\n5. Sair");
			System.out.println("Digite uma das opções: ");
			
			opcao = menu.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("id\tNome\tIdade\tTelefone");
				for(int i = 0; i < qtd; i++) {
				
				}
				break;
				
			case 2:
				System.out.println("id\tNome\tIdade\tTelefone");
				for(int i = 0; i < qtd; i++) {
				
				}
				break;
				
			case 3:
				System.out.println("id\tNome\tIdade\tTelefone");
				for(int i = 0; i < qtd; i++) {
				
				}
				break;
				
			case 4:
				System.out.println("id\tNome\tIdade\tTelefone");
				for(int i = 0; i < qtd; i++) {
				
				}
				break;
			
			case 5:
				System.out.print("\nAté logo!");
				menu.close();
			default:
				System.out.println("Opção Inválida");
			}
		}
		
	}
}
