package modelo;

public class Planilha {

	private String v1;
	private int v2;
	
	public Planilha(String entrada) {
		v1 = entrada.split(";")[0];
		v2 = Integer.parseInt(entrada.split(";")[1]);
		
	}
		
		public String idade() {
			
			int idade = 2022 - v2;
			
			return v1 + "\t" + idade;
	}
	
}