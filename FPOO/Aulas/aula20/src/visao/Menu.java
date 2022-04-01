package visao;

import java.util.Scanner;

import modelo.Veiculo;

public class Menu {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		private static Veiculo[] veiculos =  new Veiculo[10];
		private static String itens[] = { "Cadastrar veículo", "Listar Veiculo", "Sair"};
		private static int indice = 0;
			
			int menu = 0;
			while(menu != 3) {
				System.out.println("1. Cadastrar Veículos\t2.Listar Veículos\t3. Sair\nEscolha: ");
				menu = input.nextInt();
				switch(menu) {
				case 1:
					cadastrarVeiculo();
					break;
				case 2:
					listarVeiculos();
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

			private static void cadastrarVeiculo() {
				System.out.println("Cadastro de Veículos");
				System.out.println("Placa\tMarca\tModelo\tAnoModelo\tAnoFabricacao\tCor");
				veiculos[indice] = new Veiculo(input.next(), input.next(), input.next(), input.nextInt(), input.nextInt(), input.next());
					input.next();
				indice++;
				
			}
			
			private static void listarVeiculos() {
				System.out.println("Placa\tMarca\tModelo\tAnoModelo\tAnoFabricacao\tCor");
				for(int i = 0; i < indice; i++) {
					System.out.println(veiculos[i].toString());
				}
		}

	}