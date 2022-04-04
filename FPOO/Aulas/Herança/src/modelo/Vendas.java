package modelo;

import java.util.Date;

public class Vendas extends Pessoa {
	
	private String codCliente;
	private String codFunci;
	private double valor;
	
	public Vendas(String nome, String telefone, Date nascimento, String codCliente, String codFunci, double valor) {
		super(nome, telefone, nascimento);
		this.codCliente = codCliente;
		this.codFunci = codFunci;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}