package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

import modelo.Nota;

public class Aluno {
	
		public int ra;
		public String name;
		public Date nascimento;

		public Nota[] notas = new Nota[4];
		
		public Aluno() {}
		
		public Aluno(int ra, String name, Date nascimento) {
			this.ra = ra;
			this.name =  name;
			this.nascimento = nascimento;

		@SuppressWarnings("deprecation")
		public int calcIdade() {
			
			Date now = new Date();
			
				if(now.getMonth() == nascimento.getMonth()) {
					
					if(now.getDay() >= nascimento.getDay()) {
						return now.getYear() - nascimento.getYear();
					} else {
						return now.getYear() - nascimento.getYear() - 1;
					}
					
				} else if(now.getMonth() > nascimento.getMonth()) {
						return now.getYear() - nascimento.getYear();
					} else {
						return now.getYear() - nascimento.getYear() - 1;
					}
				
				}
		
		public String obterConceito() {
			
			String s = null;
			
			boolean aprovado = true;
			
			for(int i = 0; i < notas.length; i++) {
				if (notas[i] != null) {
					if(notas[i].obterMedia() <= 50) {
						aprovado = false;
						break;
						
					}
				}
			}
			
			if(aprovado) {
				
				s = "Aluno aprovado.";
				
			} else {
				
				s = "Aluno reprovado.";
				
			}
			
			return s;
			
			}
			
		public String paraString() {
			String aluno = ra + "\t" + name + "\t" + new SimpleDateFormat("dd/MM/yyyy").format(nascimento);
			String notinhas = "";
			
			for (int i = 0; i < notas.length; i++) {
				if(notas[i] != null) {
					notinhas = notinhas + "\t" +  notas[i].obterMedia();
				}
				
			}
			
			return aluno + notinhas;
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
			for (int i = 0; i < notas.length; i++) {
				
				if(notas[i].obterMedia() <= 50) {
					aprovado = false;
					break;
				}
			}
			if (aprovado) {
				return "Aluno " + name + " foi aprovado!";
			} else {
				return "Aluno " + name + " foi reprovado!";
			}
		}
	
}
