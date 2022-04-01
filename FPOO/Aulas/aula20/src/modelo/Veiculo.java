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
		super(placa, marca, modelo, anoModelo, anoFabricacao, cor);
	}
	
	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", anoModelo=" + anoModelo
				+ ", anoFabricacao=" + anoFabricacao + ", cor=" + cor + "]";
	}

}