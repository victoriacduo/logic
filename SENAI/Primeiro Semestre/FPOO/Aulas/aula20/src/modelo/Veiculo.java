package modelo;

public class Veiculo {
	
	private static String placa;
	private static String marca;
	private static String modelo;
	private static int anoModelo;
	private static int anoFabricacao;
	private static String cor;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String placa, String marca, String modelo, int anoModelo, int anoFabricacao, String cor) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anoModelo = anoModelo;
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "Veiculo:\n" + "Placa\tMarca\tmModelo\tAno do Modelo\tAno Fabricado\t Cor\n" + placa + "\t" + marca + "\t" + modelo + "\t" + anoModelo + "\t" + anoFabricacao + "\t" + cor;
	}

}