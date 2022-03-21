package modelo;

import java.util.Date;

public class Aparelho {

	public String nome;
	public String tipoExercicio;
	public String grupoMuscular;
	public Date dataAquisicao;
	public Double valorAquisicao;
	
	public Aparelho() {}
	
	public Aparelho(String nome, String tipoExercicio, String grupoMuscular, Date dataAquisicao, Double valorAquisicao) {
		this.nome = nome;
		this.tipoExercicio = tipoExercicio;
		this.grupoMuscular = grupoMuscular;
		this.dataAquisicao = dataAquisicao;
		this.valorAquisicao = valorAquisicao;
		
	}
	
	public int tempoUso() {
		return 0;
		
	}
	
	public 

}