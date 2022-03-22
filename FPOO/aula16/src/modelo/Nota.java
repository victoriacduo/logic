package modelo;

public class Nota {
	
	public String materia;
	public float[] notas =  new float[3];
	
<<<<<<< HEAD
	public Nota() {
		
	}
=======
	public Nota() {}
>>>>>>> 679ff73f9396a784f3617e50bac77f7803045ae9
	
	public Nota(String materia, float[] notas) {
		
		this.materia = materia;
		this.notas = notas;
		
	}
	
	public float obterMedia() {
		
		float soma = 0;
		
		for(int i  = 0; i < notas.length; i ++) {
			soma += notas[i];
			
		}
		
		return soma / notas.length;
	}
	
}