package modelo;

public class Aparelho {

	public String nome;
	public String tipoExercicio;
	public String grupoMuscular;
	public String dataAquisicao;
	public Double valorAquisicao;
	
	public Aparelho() {}
	
	public Aparelho(String nome, String tipoExercicio, String grupoMuscular, String dataAquisicao, Double valorAquisicao) {
		this.nome = nome;
		this.tipoExercicio = tipoExercicio;
		this.grupoMuscular = grupoMuscular;
		this.dataAquisicao = dataAquisicao;
		this.valorAquisicao = valorAquisicao;
		
	}
	
	public int tempoUso() {
		return 0;
		
	}
	
	public double depreciacao() {
		return 0;
	}
	
	public double valorDepreciacao() {
		return 0;
		
	}

	@Override
	public String toString() {
		return "Aparelho [nome=" + nome + ", tipoExercicio=" + tipoExercicio + ", grupoMuscular=" + grupoMuscular
				+ ", dataAquisicao=" + dataAquisicao + ", valorAquisicao=" + valorAquisicao + "]";
	}

}