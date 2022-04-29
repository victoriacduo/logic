package visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaDeVdd extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel rotulo1, rotulo2;
	private JTextField nome, ano;
	private JButton enviar;
	
	TelaDeVdd() {
		setTitle("Tela de Login");
		setBounds(600, 300, 500, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		rotulo1 = new JLabel ("Nome:");
		rotulo1.setBounds(120, 50, 100, 20);
		
		nome = new JTextField();
		nome.setBounds(190, 50, 200, 25);
		
		rotulo2 = new JLabel ("Ano de Nascimento:");
		rotulo2.setBounds(45, 90, 200, 20);
		
		ano = new JTextField();
		ano.setBounds(190, 90, 200, 25);
		
		enviar = new JButton("Enviar");
		enviar.setBounds(150, 150, 200, 20);
						/* x y x y */
		painel.add(rotulo1);
		painel.add(rotulo2);
		painel.add(nome);
		painel.add(ano);
		painel.add(enviar);
		
	}

	public static void main(String[] args) {
		
		TelaDeVdd tela = new TelaDeVdd();
		tela.setVisible(true);
		
	}
}