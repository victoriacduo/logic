package modelo;

import java.util.Date;

public class Aluno {
	
		public int ra;
		public String name;
		public Date nascimento;
		public int notas;
		
		public Aluno() {}
		
		public Aluno(int ra, String name, Date nascimento, int notas) {
			this.ra = ra;
			this.name =  name;
			this.nascimento = nascimento;
			this.notas = notas;
		}
		
		public String tabular() {
			return ra+"\t"+name+"\t"+nascimento+"\t"+notas;
		}
	
}