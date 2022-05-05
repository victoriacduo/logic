package modelo;

public class Cao extends Animal {

	private int qtdMotoqueiros;

	public Cao(String especie, String nome, float peso, String raca, int qtdMotoqueiros) {
		super(especie, nome, peso, raca);
		this.qtdMotoqueiros = qtdMotoqueiros;
	}

	@Override
	public String toString() {
		return super.toString() + qtdMotoqueiros;
	}
	
	

}