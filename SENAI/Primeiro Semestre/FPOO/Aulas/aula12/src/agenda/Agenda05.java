package agenda;

public class Agenda05 {
	
	public static void main(String[] args) {
		
		Contato c1 = new Contato(30, "Jaqueline", 19, ("(19) 99999-9999"));
		Contato c2 = new Contato(21, "Marcos", 15, ("(19) 77777-7777"));
		
		System.out.println(c1.tabular());
		System.out.println(c2.tabular());

	}

}
