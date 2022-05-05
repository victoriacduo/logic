package exercicios;

import java.time.Year;
import java.util.Scanner;

public class Idade2 {

	public static void main(String[] args) {
	
			Scanner entrada = new Scanner(System.in);
			int n1, n2;
			int anoAtual = Year.now().getValue();
			
			System.out.println("Coloque seu ano de nascimento: ");
			n1 = entrada.nextInt();
			n2 = anoAtual-n1;
			System.out.println("Sua idade é "+ n2);
			
			if(n2 >= 18){
				System.out.println("Você é maior de idade");
			}else {
				System.out.println("Você é menor de idade");
			}
	}
}
