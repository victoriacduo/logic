package carros;

import java.util.ArrayList;
import java.util.Scanner;

public class Modelo {

	public static void main(String[] args) {
		
		Atividade atv = new Atividade();
		
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		
		do {
			System.out.println("1. Cadastrar");
			System.out.println("2. Listar;");
			System.out.println("0. Sair;");
			opcao = input.nextInt();
			input.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("Informe a marca: ");
				String marca = input.nextLine();
				
				System.out.println("Informe o modelo: ");
				String modelo = input.next();
				
				System.out.println("Informe a placa: ");
				String placa = input.next();
				
				System.out.println("Informe a cor: ");
				String cor = input.next();
				 
				String data = marca + ";" + modelo + ";" + placa + ";" + cor;
				
				atv.veiculo(data, "Carros", true);
				break;
			case 2:
				ArrayList<String> infoFile = atv.ler("Carros");
				
				System.out.println("Informe o nome que deseja localizar: ");
				String busca = input.nextLine();
				
				for(String linha : infoFile) {
					String[] temp = linha.split(";");
					
					if((temp[1].toLowerCase().contains(busca.toLowerCase())) || (temp[2].toLowerCase().contains(busca.toLowerCase()))) {
						System.out.println("Marca: " + temp[0]);
						System.out.println("Modelo: " + temp[1]);
						System.out.println("Placa: " + temp[2]);
						System.out.println("Cor: " + temp[3]);
					}
				}
				break;
			case 0:
				System.out.println("Até");
				break;
			}
		} while(opcao != 0);
	}
}