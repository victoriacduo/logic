package exercicios;

import java.time.Year;
import java.util.Scanner;

public class Classificaidade {

		public static void main(String[] args) {
			
			Scanner read = new Scanner(System.in);
			int ano, idade;
			int anoAtual = Year.now().getValue();
			
			System.out.print("Digite o ano em que você nasceu: ");
			ano = read.nextInt();
			
			idade = anoAtual - ano;
			
			if(idade < 10) {
				System.out.println("Você é uma criança.");
			}else if(idade < 18) {
				System.out.println("Você é um adolescente.");
			}else if(idade < 50) {
				System.out.println("Você é um adulto.");
			}else if(idade < 100) {
				System.out.println("Você é um idoso.");
			}else {
				System.out.println("Você passou da hora.");
			}
	}
}
