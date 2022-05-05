package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Funcionario;
import modelo.Cliente;
import modelo.Vendas;

public class Principal {
	
	static Scanner input = new Scanner(System.in);
	
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private static ArrayList<Vendas> vendas = new ArrayList<>();
	private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) throws ParseException {
		
		System.out.println("Bem-vindo ao nosso servi�o de cadastro!\n");
		
		int menu = 0;
		while (menu != 7) {
			System.out.println("Escolha: \n 1. Cadastrar Cliente\t2. Cadastrar Funcion�rio\t3. Cadastrar Venda\t4. Listar Clientes\t5. Listar Funcion�rios\t6. Listar Vendas\t7. Sair");
			menu = input.nextInt();

			switch (menu) {
			case 1:
				cadastrarCliente();
				break;
			case 2:
				cadastrarFuncionario();
				break;
			case 3:
				cadastrarVenda();
			case 4:
				listarClientes();
				break;
			case 5:
				listarFuncionarios();
				break;
			case 6:
				listarVendas();
			case 7:
				System.out.println("Obrigado por utilizar nosso sistema, at� mais.");
				input.close();
				break;
			default:
				System.out.println("Op��o Inv�lida.");
			}

		}

	}

	private static void cadastrarVenda() {
//		System.out.println("----------------------[[[Cadastro de Vendas]]]----------------------");
//		System.out.println("Nome do cliente\tNome do funcion�rio\tValor do ve�culo\tLimite de cr�dito\tComiss�o");
//		Vendas vendas1 = new Vendas(input.next(), input.next(), input.nextInt(), input.nextDouble());
//		vendas.add(vendas1);
		
	}
	
	private static void listarVendas() {
		
	}

	private static void cadastrarCliente() throws ParseException {
		System.out.println("----------------------[[[Cadastro de Clientes]]]----------------------");
		System.out.println("Nome\tTelefone\tNascimento\tID\tLimite de Cr�dito");
		Cliente cliente = new Cliente(input.next(), input.next(), df.parse(input.next()), input.nextInt(), input.nextDouble());
		clientes.add(cliente);
		
	}

	private static void cadastrarFuncionario() throws ParseException {
		System.out.println("----------------------[[[Cadastro de Funci�rios]]]----------------------");
		System.out.println("Nome\tTelefone\tNascimento\tMatr�cula\tComiss�o");
		Funcionario funcio = new Funcionario(input.next(), input.next(), df.parse(input.next()), input.nextInt(), input.nextDouble());
		funcionarios.add(funcio);
		
	}

	private static void listarClientes() {
		for(Cliente c: clientes) {
			System.out.println(c.toString());
		}
		
	}

	private static void listarFuncionarios() {
		for(Funcionario f: funcionarios) {
			System.out.println(f.toString());
		}
		
	}
}