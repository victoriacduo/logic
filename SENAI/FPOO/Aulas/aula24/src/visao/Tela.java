package visao;

import java.util.Scanner;

import controle.ProcessaPlanilha;

public class Tela {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		ProcessaPlanilha.carregar();

		int menu = 0;
		while (menu != 5) {
			System.out.println("1. Adi��o\t2. Subtra��o\t3. Multiplica��o\t4. Divis�o\t5.Sair");
			menu = input.nextInt();
			ProcessaPlanilha.saida(menu);
		}
	}
}