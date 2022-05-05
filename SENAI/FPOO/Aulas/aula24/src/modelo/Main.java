package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static FileReader fr;
	static BufferedReader br;
	static BufferedWriter bw;
	static Scanner input = new Scanner(System.in);
	static String entrada = "C:\\logic\\FPOO\\Aulas\\aula24\\arq\\entrada";
	static String saida = "C:\\logic\\FPOO\\Aulas\\aula24\\arq\\saida";
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	public static void main(String[] args) {

		int opcao = 0;
		while (opcao != 5) {
			System.out.println("Escolha: \n 1. Adição\t2. Multiplicação\t3. Subtração\t4. Divisão");
			opcao = input.nextInt();

			if (opcao < 1 || opcao > 4) {
				System.out.println("Opção inválida");
			}

			try {
				br = new BufferedReader(new FileReader(entrada));
				bw = new BufferedWriter(new FileWriter(saida, false));

				String linha = br.readLine();

				while (linha != null) {
					String[] vetor = linha.split(";");
					int v1 = Integer.parseInt(vetor[0]);
					int v2 = Integer.parseInt(vetor[1]);
					int v3 = Integer.parseInt(vetor[2]);
					float result = 0;
					if (opcao == 1) {
						result = v1 + v2 + v3;
					} else if (opcao == 2) {
						result = v1 - v2 - v3;
					} else if (opcao == 3) {
						result = v1 * v2 * v3;
					} else {
						result = v1 / v2 / v3;
					}

					System.out.println(result);
					bw.write(result + "\n");
					linha = br.readLine();
				}

				br.close();
				bw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}