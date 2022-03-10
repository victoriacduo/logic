package exercicios;

import java.util.Scanner;

public class Ex4 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Ler um vetor com 10 nomes de pessoas, após pedir que o usuário digite um
		// nome qualquer de pessoa. Escrever a mensagem “ACHEI”, se o nome estiver armazenado no vetor C ou “NÃO ACHEI” caso contrário

		String name[];
		name = new String[10];
		String x;
		
		System.out.println("Digite 10 nomes: ");
		
		for(int i = 0; i < 10; i++) {
			name[i] = input.next();
		}
		
		System.out.println("Peça um nome: ");
		x = input.next();
		
		for(int i = 0; i < 10; i++) {
			if(name[i].equalsIgnoreCase(x)) {
				
				System.out.println("ACHEI");
				
			} else {
				System.out.println("NÃO ACHEI");
			}
		}
		
	}

}