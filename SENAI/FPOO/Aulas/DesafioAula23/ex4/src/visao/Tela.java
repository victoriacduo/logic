package visao;

import java.util.Scanner;

import controle.ProcessaPlanilha;

public class Tela {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ProcessaPlanilha.carregar();
		
		System.out.println("Digite seu login:");
		
		int indice = ProcessaPlanilha.checarUsuario(input.next());
		
		if (indice != -1) {
			System.out.println("Digite sua senha:");
			String senha = input.next();
				if(ProcessaPlanilha.checarSenha(indice, senha)) {
					System.out.println("Acesso permitido");
				} else {
					System.out.println("Acesso negado");
				}
		} else {
			System.out.println("Usuário não encontrado");
		}
	}
}