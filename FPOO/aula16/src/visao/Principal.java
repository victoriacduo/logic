package visao;

import java.util.Scanner;

public class Principal {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String alunos[];
		alunos = new String[10];
		
		System.out.print("1. Cadastrar Aluno\t2. Cadastrar nota\t3. Listar alunos\n");
		System.out.print("4. Listar notas\t5. Obter aluno por RA\t6. Obter aluno por nome\n");
		System.out.print("7. Listar Aprovados\t8. Listar reprovados\t9. Sair");
		int opcao = input.nextInt();
		
		while(opcao != 9) {
		switch(opcao) {
		
		case 1:
		cadastrarAluno();
			break;
		case 2:
		cadastrarNota();
			break;
		case 3:
		listarAlunos();
			break;
		case 4:
		listarNotas();
			break;
		case 5:
		obterAluno();
			break;
		case 6:
		obterAluno();
			break;
		case 7:
		listarAprovados();
			break;
		case 8:
		listarReprovados();
			break;
		case 9: 
		sair();
			input.close();
			break;
		default:
			System.out.println("Opção inválida.");
		
		}
	}

	}
	
	private static void cadastrarAluno() {
		// TODO Auto-generated method stub
		
	}
	
	private static void cadastrarNota() {
		// TODO Auto-generated method stub
		
	}
	
	private static void listarAlunos() {
		// TODO Auto-generated method stub
		
	}
	
	private static void listarNotas() {
		// TODO Auto-generated method stub
		
	}
	
	private static void obterAluno() {
		// TODO Auto-generated method stub
		
	}
	
	private static void obterAluno() {
		// TODO Auto-generated method stub
		
	}
	
	private static void listarAprovados() {
		// TODO Auto-generated method stub
		
	}
	
	private static void listarReprovados() {
		// TODO Auto-generated method stub
		
	}
	
	private static void sair() {
		System.out.println("Até mais!");
		
	}

}