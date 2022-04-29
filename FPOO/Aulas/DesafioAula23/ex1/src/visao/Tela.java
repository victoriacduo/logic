package visao;

import java.util.Scanner;

import controle.ProcessaPlanilha;

public class Tela {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ProcessaPlanilha.carregar();
		System.out.println("Idades calculadas com sucesso");
		ProcessaPlanilha.saida();
		
	}
}