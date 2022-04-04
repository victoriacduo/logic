package modelo;

import java.util.Date;

public class Funcionario extends Pessoa {

	private int matricula;
	private double comissao;

	public Funcionario(String nome, String telefone, Date nascimento, int matricula, double comissao) {
		super(nome, telefone, nascimento);
		this.matricula = matricula;
		this.comissao = comissao;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return super.toString() + matricula + comissao;
	}

}