package agenda;

public class Agenda03 {
	
	public static void main(String[] args) {
		
		Contato c1 = new Contato();
		
		c1.id = 30;
		c1.nome = "Jaqueline";
		c1.idade = 19;
		c1.telefone = "(19) 99999-9999";
		
		Contato c2 = new Contato();
		
		c2.id = 25;
		c2.nome = "Marcos";
		c2.idade = 21;
		c2.telefone = "(19) 77777-7777";
		
		System.out.println(c1.id + "\t" + c1.nome + "\t" + c1.idade + "\t" + c1.telefone);
		System.out.println(c2.id + "\t" + c2.nome + "\t" + c2.idade + "\t" + c2.telefone);

	}

}
