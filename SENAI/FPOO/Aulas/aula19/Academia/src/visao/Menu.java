package visao;

import java.util.Scanner;

import modelo.Aparelho;

public class Menu {
	
	// atributos básicos
	private static Scanner input = new Scanner(System.in);
	private static Aparelho[] aparelhos =  new Aparelho[10];
	private static String itens[] = { "Cadastrar aparelho", "Listar aparelho", "Sair"};
	private static int indice = 0;
	
	// metodos
	public static void main(String[] args) {
		
		int menu = 0;
		while(menu != 3) {
			System.out.println("1. Cadastrar aparelho\t2.Listar aparelho\t3. Sair\nEscolha: ");
			menu = input.nextInt();
			switch(menu) {
			case 1:
				cadastrarAparelho();
				break;
			case 2:
				listarAparelho();
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

		private static void cadastrarAparelho() {
			System.out.println("Cadastro de Aparelhos");
			System.out.println("Nome\ttipoExercicio\tgrupoMuscular\tdataAquisição\tValor");
			aparelhos[indice] = new Aparelho(input.next(), input.next(), input.next(), input.next(), input.nextDouble());
				input.next();
			indice++;
			
		}
		
		private static void listarAparelho() {
			System.out.println("Nome\\ttipoExercicio\\tgrupoMuscular\\tdataAquisição\\tValor");
			for(int i = 0; i < indice; i++) {
				System.out.println(aparelhos[i].toString());
			}
	}

}