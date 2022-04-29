package modelo;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static BufferedReader br;
	static BufferedWriter bw;
	static String entrada = "C:\\logic\\FPOO\\Aulas\\DesafioAula23\\ex3\\Dados\\entradas.csv";
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<String> longo = new ArrayList<>();
			
			try {
				br = new BufferedReader(new FileReader(entrada));
				
				String linha = br.readLine();
				while (linha != null) {
					longo.add(linha);
					linha = br.readLine();
				}
				
				br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			ArrayList<Integer> teste = new ArrayList<>();
			longo.forEach(x -> {
				teste.add(Integer.parseInt(x));
			});
			
			Collections.sort(teste);
			System.out.println(teste);
			
	}
}
