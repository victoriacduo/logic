package modelo;

public class Nota {
	
	public String materia;
	public float[] notas =  new float[3];
	
	public Nota() {
	}
	
	public Nota(String materia, float[] notas) {
		this.materia = materia;
		this.notas = notas;
	}
	
	public float obterMedia() {
		
	}
	
}