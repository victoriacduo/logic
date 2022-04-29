package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Planilha;

public class DAO {

	private BufferedReader br;
	private BufferedWriter bw;
	private String entradas = "C:\\logic\\FPOO\\Aulas\\DesafioAula23\\ex2\\Dados\\entradas.csv";
	private String saida = "C:\\logic\\FPOO\\Aulas\\DesafioAula23\\ex2\\Dados\\saida.csv";
	
	public ArrayList<Planilha> abrir(){
		ArrayList<Planilha> linhas = new ArrayList<>();
		Planilha p;
		
		try {
			br = new BufferedReader(new FileReader(entradas));
			String linha = br.readLine();
			while(linha != null) {
				p = new Planilha(linha);
				linhas.add(p);
				linha = br.readLine();
			}
			br.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return linhas;
		
	}
	
	public void salvar(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.media()+"\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}