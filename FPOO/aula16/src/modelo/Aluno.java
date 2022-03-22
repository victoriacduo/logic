package modelo;

import java.util.Date;

import modelo.Nota;

public class Aluno {
	
		public int ra;
		public String name;
		public Date nascimento;
		public Notas[] notas = new Notas[4];
		
		public Aluno() {}
		
		public Aluno(int ra, String name, Date nascimento) {
			this.ra = ra;
			this.name =  name;
			this.nascimento = nascimento;
			
		}
		
		public String tabular() {
			return ra+"\t"+name+"\t"+nascimento+"\t"+notas;
		}
		
		public int calcIdade() {
			java.util.Date hoje = new java.util.Date();  

			if (hoje.getMonth() == nascimento.getMonth()) {
				if (hoje.getDay() >= nascimento.getDay()) {
					return hoje.getYear() - nascimento.getYear();
				} else {
					return hoje.getYear() - nascimento.getYear() - 1;
				}
			} else if(hoje.getMonth() > nascimento.getMonth()) {
				return hoje.getYear() - nascimento.getYear();
			} else {
				return hoje.getYear() - nascimento.getYear() - 1;
			}
		}
		
		public String obterConceito() {
			boolean aprovado = true;
			for (int i = 0; i < nota.length; i++) {
				
				if(notas[i].obterMedia() <= 50) {
					aprovado = false;
					break;
				}
			}
			if (aprovado) {
				return "Aluno(a) " + nome + " foi APROVADO!";
			} else {
				return "Aluno(a) " + nome + " foi REPROVADO!";
			}
		}
	
}