package exercicios;

import java.time.Year;
import java.util.Scanner;

public class Classificaidade {

		public static void main(String[] args) {
			
			Scanner read = new Scanner(System.in);
			int ano, idade;
			int anoAtual = Year.now().getValue();
			
			System.out.print("Digite o ano em que voc� nasceu: ");
			ano = read.nextInt();
			
			idade = anoAtual - ano;
			
			if(idade < 10) {
				System.out.println("Voc� � uma crian�a.");
			}else if(idade < 18) {
				System.out.println("Voc� � um adolescente.");
			}else if(idade < 50) {
				System.out.println("Voc� � um adulto.");
			}else if(idade < 100) {
				System.out.println("Voc� � um idoso.");
			}else {
				System.out.println("Voc� passou da hora.");
			}
	}
}
