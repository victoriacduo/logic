package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Manutencao {

	private int id;
	private Date data;
	private String equipa;
	private double custoHora;
	private double tempoHora;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Manutencao(int id, String data, String equipa, double custoHora, double tempoHora) {
		this.id = id;
		try {
			this.data = sdf.parse(data);
		} catch(ParseException e) {
			System.out.println(e);
		}
		this.equipa = equipa;
		this.custoHora = custoHora;
		this.tempoHora = tempoHora;
	}
	
	public Manutencao(String linha) {
		
		try {
			this.id = Integer.parseInt(linha.split(";")[0]);
			this.data = sdf.parse(linha.split(";")[1]);
			this.custoHora = Double.parseDouble(linha.split(";")[3]);
			this.tempoHora = Double.parseDouble(linha.split(";")[4]);
		} catch (ParseException e) {
			System.out.println(e);
		}
		this.equipa = linha.split(";")[2];
	}
	
	public Manutencao(int id2) {
	}
	
	public double getTotal() {
		return custoHora * tempoHora;
	}
	
	public String getId() {
		return String.valueOf(id);
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return sdf.format(data);
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

	public String getCustoHora() {
		return String.format("%.2f", custoHora);
	}


	public void setCustoHora(double custoHora) {
		this.custoHora = custoHora;
	}

	public String getTempoHora() {
		return String.format("%.2f", tempoHora);
	}

	public void setTempoHora(double tempoHora) {
		this.tempoHora = tempoHora;
	}

	@Override
	public int hashCode() {
		return Objects.hash(custoHora, data, equipa, id, tempoHora);
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
				&& Double.doubleToLongBits(tempoHora) == Double.doubleToLongBits(other.tempoHora);
	}

	@Override
	public String toString() {
		return id + "\t" + sdf.format(data) + "\t" + equipa + "\t=" + custoHora + "\t" + tempoHora + getTotal();
	}
	
	public String toCSV() {
		return id + ";" + sdf.format(data) + ";" + equipa + ";" + custoHora + ";" + tempoHora + "\n";
	}
	
}