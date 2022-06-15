package modelo;

public class Planilha {

	private String login;
	private String senha;

	public Planilha(String login, String senha) {
		
		this.login = login;
		this.senha = senha;
	}

	public Planilha(String linha) {
		
		this.login = linha.split(";")[0];
		this.senha = linha.split(";")[1];
	}	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		
		return login + "\t" + "******";
	}
}