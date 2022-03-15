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
			
			return ra+"\t"+name+"\t"+nascimento;
			
		}
		
		public int caclIdade() {
			
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
			
			boolean aprovado = true;
			
			for(int i = 0; i < notas.length; i++) {
				
				
					
				}
			}
			
			
			
	}


// se o mes atual for maior que o mes de nascimento 
// retorna o mes atual - o mes de nascimento

// se n, retorna ano atual - ano de nascimento - 1 ????

// n da pra fazer conta com string
// ent precisa converter pra uma variavel do tipo Date 
// essa variavel tem algumas funções 
// por ex: getMonth retorna o numero do mes
// a variavel data tem o valor 14/03/2022 
// entao se colocar int mes = data(variavel).getMonth(função)
// o mes vai ter valor 3, q é o numero do mes 
// isso vale pra ano também 
// ele retorna o numero pra poder calcular