package agenda;

public class Agenda02 {
	
	public static void main(String[] args) {
		
		// criando um objeto da classe contato
		
		Contato c1 = new Contato();
		// preenche os atributos
		
		c1.id = 30;
		c1.nome = "Jaqueline";
		c1.idade = 19;
		// mostra na tela
		
		System.out.println(c1.id + "\t" + c1.nome + "\t" + c1.idade);
		// limpa o objeto ou renova ele
		
		c1 = new Contato();
		// mostra na tela
		
		c1.id = 25;
		c1.nome = "Marcos";
		c1.idade = 21;
		// preenche novamente com os dados
		
		System.out.println(c1.id + "\t" + c1.nome + "\t" + c1.idade);
		// mostra na tela de novo

	}

}
