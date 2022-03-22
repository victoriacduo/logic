package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import modelo.Aluno;
import modelo.Nota;

public class Principal {

	static Scanner input = new Scanner(System.in);
	static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {

		System.out.print("1. Cadastrar Aluno\t2. Cadastrar nota\t3. Listar alunos\n");
		System.out.print("4. Listar notas\t5. Obter aluno por RA\t6. Obter aluno por nome\n");
		System.out.print("7. Listar Aprovados\t8. Listar reprovados\t9. Sair");
		int opcao = input.nextInt();

		while (opcao != 9) {
			switch (opcao) {

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

	public static void cadastrarAluno() throws ParseException {
		
		System.out.println("Digite quantos alunos deseja cadastrar: ");
		int qtd = input.nextInt();
		Aluno[] alunos = new Aluno[qtd];
		
		System.out.println("ID\tNome\tNascimento\tNotas");
		for(int i = 0; i < 10; i++) {
			alunos[i] = new Aluno();
			alunos[i].ra = input.nextInt();
			alunos[i].name = input.next();
			alunos[i].nascimento = df.parse(input.next());
		}
		
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