package agenda;

public class Contato {
	
	// atributos
	public int id;
	public String nome;
	public int idade;
	public String telefone;
	
	// metodo construtor vazio
	Contato() {}
	
	Contato(int id, String nome, int idade, String telefone) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	// metodo simples
	public String tabular() {
		return id+"\t"+nome+"\t"+idade+"\t"+telefone;
		
	}
}
