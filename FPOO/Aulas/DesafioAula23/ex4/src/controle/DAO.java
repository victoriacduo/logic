package controle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Planilha;

public class DAO {

	private BufferedReader br;
	private String path = "C:\\logic\\FPOO\\Aulas\\DesafioAula23\\ex4\\Dados\\usuarios.csv";
	
	public ArrayList<Planilha> abrir(){
		ArrayList<Planilha> lista = new ArrayList<>();
		Planilha p;
		
		try {
			br = new BufferedReader(new FileReader(path));
			String linha = br.readLine();
			
			while(linha != null) {
				p = new Planilha(linha);
				lista.add(p);
				linha = br.readLine();
			}
			br.close();
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return lista;
		
	}
}