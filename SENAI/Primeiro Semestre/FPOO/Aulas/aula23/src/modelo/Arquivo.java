package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Arquivo {
	
	// 1 - Em um arquivo de texto, armazene o nome e o ano de nascimento das pessoas.
	// Ao ler esse arquivo o sistema ir? informar o nome e a idade.
	
	public void armazenar(String info, String fileName, boolean append) {
		
		try {
			FileWriter fw = new FileWriter(fileName + ".txt", append);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(info + "\t\n");
			
			bw.close();
			fw.close();
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public ArrayList<String> ler(String fileName) {
		ArrayList<String> lendo = new ArrayList<>();
		
		try {
			FileReader fr = new FileReader(fileName + ".txt");
			BufferedReader br = new BufferedReader(fr);
			
			String linha = "";
			
			while((linha = br.readLine()) != null) {
				lendo.add(linha);
				
			}
			
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return lendo;
		
	}

}