package controllers;

import java.util.ArrayList;

import dao.ManutencaoDAO;
import models.Manutencao;

public class ProcessaManutencao {

	public static ArrayList<Manutencao> manutencoes = new ArrayList<>();
	private static ManutencaoDAO md = new ManutencaoDAO();
	
	public static void abrir() {
		manutencoes = md.ler();
		if(manutencoes.size() == 0) {
			manutencoes.add(new Manutencao(1, "01/02/2021", "Esteira", 30.00, 1.0));
			manutencoes.add(new Manutencao(2, "14/05/2021", "Motor", 90.00, 3.0));
		}
	}
	
	public static void salvar() {
		md.escrever(manutencoes);
	}
	
}