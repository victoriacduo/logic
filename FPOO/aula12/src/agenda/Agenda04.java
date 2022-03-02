package agenda;

public class Agenda04 {
	
	public static void main(String[] args) {
		
		Contato c1 = new Contato();
		Contato c2 = new Contato();
		
		c1.id = 30;
		c1.nome = "Jaqueline";
		c1.idade = 19;
		c1.telefone = "(19) 99999-9999";
		
		
		c2.id = 25;
		c2.nome = "Marcos";
		c2.idade = 21;
		c2.telefone = "(19) 77777-7777";
		
		System.out.println(c1.tabular());
		System.out.println(c2.tabular());

	}

}
