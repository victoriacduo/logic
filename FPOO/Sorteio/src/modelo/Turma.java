package modelo;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Turma {
	
	private String nomes[];
	private String nomesEmbaralhados[];
	private int usados[];
	private int contador = 0;
	private Random rand = new Random();
	private Scanner input = new Scanner(System.in);
	
	public void preencherVetor(int qtdade) {
		nomes = new String[qtdade];
		nomesEmbaralhados = new String[qtdade];
		usados = new int[qtdade];
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = input.nextLine();
		}
		for (int i = 0; i < nomes.length; i++) {
			
		}
	}
	
	public void listarTodos() {
		for (String a : nomes) {
			System.out.println(a);
		}
	}
}