package visao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;

import modelo.Aluno;
import modelo.Nota;

		public class Principal {
	
			public static Scanner input = new Scanner(System.in);
			public static int opcao = 0;
			public static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			public static String opcoes[] = { "Cadastrar Aluno", "Cadastrar Nota  ", "Listar alunos",
					"Listar notas       ", "Obter aluno por RA", "Obter aluno por nome", 
					"Listar aprovados", "Listar reprovados", "Sair                " };
			public static Aluno[] aluno = new Aluno[10];
			public static Nota[] materia = new Nota[4];
			public static float[] nota = new float[3];
			public static int ra = 0;
			public static int contAlunos = 0; 
			public static int contNotas = 0; 
	
			public static void main(String[] args) throws IOException, ParseException {
				boolean sucesso = false;
				
				while (opcao != 9) {
					System.out.print("Opção: ");
					opcao = menu(opcoes);
			
				switch(opcao) {
				
				case 1:
					sucesso = cadastrarAluno();
					if (sucesso) {
						System.out.println("Aluno cadastrado com sucesso.");
						contAlunos++;
					} else
						System.out.println("Erro ao cadastrar aluno.");
				break;
				
				case 2:
					sucesso = cadastrarNota();
					if (sucesso) {
						System.out.println("Nota registrada com sucesso.");
						contNotas++;
					} else
						System.out.println("Erro ao registrar nota.");
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
					obterAluno(args);
				break;
				
				case 7:
					listarAprovados();
				break;
				
				case 8:
					listarReprovados();
				break;
				
				case 9:
					System.out.println("Até logo.");
				break;
				
				default:
					System.out.println("Opção inválida.");
					
				}

				}

		}
	
		private static int menu(String[] options) {
			System.out.println("\t._______________________.");
			
			for (int i = 0; i < options.length; i++) {
				System.out.println("\t|" + (i + 1) + "." + options[i] + "\t|");
			}
			
			System.out.println("\t:___Escolha uma opção___:");
			return input.nextInt();
		}

		private static boolean cadastrarAluno() throws ParseException {
			ra++; // serve pro ra começar em 1, não em 0
			System.out.println("Nome do Aluno\tNascimento");
			aluno[contAlunos] = new Aluno(ra, input.next(), df.parse(input.next()));
			return true;
		}
	
		@SuppressWarnings("unused")
		private static boolean cadastrarNota() {
			System.out.println("Digite o RA do aluno: ");
			int ra = input.nextInt();
		
				for(int i = 0; i < 10; i++) {
					if(aluno[i] != null) {
						if(aluno[i].ra == ra) {
							for (int j = 0; j < aluno[i].notas.length; j++) {
								System.out.println("Digite o nome da matéria: ");
								String materia = input.next();
									for (int k = 0; k < 3; k++) {
										System.out.println("Digite as notas: ");
										nota[k] = input.nextFloat();
						}
						
								aluno[i].notas[j] = new Nota(materia, nota);
								break;
							}
						} else if (i == 9) {
							System.out.println("Aluno não encontrado.");
						}
					}
					
				}
		
				return true;
		}
	
		private static void listarAlunos() {
			System.out.println("RA\tNome\tNascimento\tIdade");
				for (int i = 0; i < aluno.length; i++) {
					if (aluno[i] != null) {
						System.out.println(aluno[i].ra + "\t" + aluno[i].name + "\t" + new SimpleDateFormat("dd/MM/yyyy").format(aluno[i].nascimento) + "\t" + aluno[i].calcIdade());
			}
			
				}
		
		}
	
		private static void listarNotas() {
			for (int i = 0; i < aluno.length; i++) {
				if (aluno[i] != null) {
					System.out.println(aluno[i].name);
				
					System.out.println("\tMatéria.\tNota 1\tNota 2\tNota 3\tMédia\n");
					
					for (int j = 0; j < aluno[i].notas.length; j++) {
						
						if (aluno[i].notas[j] != null) {
							System.out.print("\t" + aluno[i].notas[j].materia);
							for (int j2 = 0; j2 < aluno[i].notas[j].notas.length; j2++) {
								System.out.print("\t" + aluno[i].notas[j].notas[j2]);
							}
					
						if(aluno[i].notas[j].obterMedia() <= 50) {
								System.out.printf("\t|%.2f|", aluno[i].notas[j].obterMedia());
								System.out.println("\n");
						} else {
								System.out.printf("\t%.2f", aluno[i].notas[j].obterMedia());
								System.out.println("\n");
						}
						}
							
					
					
				}
					System.out.println(aluno[i].obterConceito());
					System.out.println("\n");
				}
			}
		
		}
	
		private static void obterAluno() {
			// obter aluno por ra
			System.out.println("Digite o RA do aluno: ");
			int ra = input.nextInt();
		
			for(int i = 0; i < 10; i++) {
				if(aluno[i] != null) {
					if(aluno[i].ra == ra) {
						System.out.print(aluno[i].paraString());
						System.out.println("\n");
					}
				}
				
			}
		
		}
	
		private static void obterAluno(String[] args) {
			// obter aluno por nome
			System.out.println("Digite o nome do aluno: ");
			String nome = input.next();
		
			for(int i = 0; i < 10; i++) {
				if(aluno[i] != null) {
					if(aluno[i].name.equalsIgnoreCase(nome)) {
						System.out.println(aluno[i].paraString());
						System.out.println("\n");
					}
				}
				
			}
		
		
		}
	
		private static void listarAprovados() {
			System.out.println("Alunos aprovados: ");
		
			for (int i = 0; i < aluno.length; i++) {
				if (aluno[i] != null && aluno[i].obterConceito().equals("Aluno aprovado.")) {
				
					System.out.println(aluno[i].name);
					System.out.println("\tMatéria.\tNota 1\tNota 2\tNota 3\tMédia\n");
					
					for (int j = 0; j < aluno[i].notas.length; j++) {
						if (aluno[i].notas[j] != null) {
							System.out.print("\t" + aluno[i].notas[j].materia);
							
							for (int j2 = 0; j2 < aluno[i].notas[j].notas.length; j2++) {
								System.out.print("\t" + aluno[i].notas[j].notas[j2]);
							}
						
							System.out.printf("\t%.2f", aluno[i].notas[j].obterMedia());
							System.out.println("\n");
						}
						
					
					}
					
				System.out.println(aluno[i].obterConceito());
				System.out.println("\n");
				
				}
			}
		
		}


		private static void listarReprovados() {
			System.out.println("Alunos reprovados: ");
		
			for (int i = 0; i < aluno.length; i++) {
				if (aluno[i] != null && aluno[i].obterConceito().equals("Aluno reprovado.")) {
				
				System.out.println(aluno[i].name);
				System.out.println("\tMatéria.\tNota 1\tNota 2\tNota 3\tMédia\n");
				
				for (int j = 0; j < aluno[i].notas.length; j++) {
					if (aluno[i].notas[j] != null) {
						System.out.print("\t" + aluno[i].notas[j].materia);
						
						for (int j2 = 0; j2 < aluno[i].notas[j].notas.length; j2++) {
							System.out.print("\t" + aluno[i].notas[j].notas[j2]);
						}
							if(aluno[i].notas[j].obterMedia() <= 50) {
								System.out.printf("\t|%.2f|", aluno[i].notas[j].obterMedia());
								System.out.println("\n");
							} else {
								System.out.printf("\t%.2f", aluno[i].notas[j].obterMedia());
								System.out.println("\n");
							}
					}
					
					
				}
				
				System.out.println(aluno[i].obterConceito());
				System.out.println("\n");
			}
		}
		
	}

}