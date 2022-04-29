package controle;

import java.util.ArrayList;

import modelo.Planilha;

public class ProcessaPlanilha {
	
	public static ArrayList<Planilha> linhas = new ArrayList<>();
	private static DAO dao = new DAO();
	

	public static void carregar() {
		linhas = dao.abrir();
	}
	
	public static int checarUsuario(String login) {
		int retorno = -1;
		for(int i = 0; i < linhas.size(); i++) {
			if(linhas.get(i).getLogin().equals(login)) {
				retorno = i;
			}
		}
		
		return retorno;
	}

	public static boolean checarSenha(int indice, String senha) {
		return linhas.get(indice).getSenha().equals(senha);
		
	}
}