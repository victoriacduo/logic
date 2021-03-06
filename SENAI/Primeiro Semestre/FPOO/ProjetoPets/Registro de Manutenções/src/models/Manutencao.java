package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Manutencao {

	private int id;
	private Date data;
	private String equipa;
	private double custoHora;
	private double tempoHora;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Manutencao(String equipa) {
		this.id = id;
		this.data = data;
		this.equipa = equipa;
		this.custoHora = custoHora;
		this.tempoHora = tempoHora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getEquipa() {
		return equipa;
	}

	public void setEquipa(String equipa) {
		this.equipa = equipa;
	}

	public double getCustoHora() {
		return custoHora;
	}

	public void setCustoHora(double custoHora) {
		this.custoHora = custoHora;
	}

	public double getTempoHora() {
		return tempoHora;
	}

	public void setTempoHora(double tempoHora) {
		this.tempoHora = tempoHora;
	}

	@Override
	public int hashCode() {
		return Objects.hash(custoHora, data, equipa, id, sdf, tempoHora);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manutencao other = (Manutencao) obj;
		return Double.doubleToLongBits(custoHora) == Double.doubleToLongBits(other.custoHora)
				&& Objects.equals(data, other.data) && Objects.equals(equipa, other.equipa) && id == other.id
				&& Objects.equals(sdf, other.sdf)
				&& Double.doubleToLongBits(tempoHora) == Double.doubleToLongBits(other.tempoHora);
	}

	@Override
	public String toString() {
		return id + "\t" + data + "\t" + equipa + "\t=" + custoHora + "\t" + tempoHora + "\n";
	}
	
	public String toCSV() {
		return id + ";" + data + ";" + equipa + ";" + custoHora + ";" + tempoHora + "\n";
	}
	
}