package visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaDeVdd extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel rotulo1, rotulo2, rotulo3, rotulo4;
	private JTextField nome, n1, n2, n3;
	private JButton cadastrar;
	
	TelaDeVdd() {
		setTitle("Tela de Login");
		setBounds(600, 300, 600, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		rotulo1 = new JLabel ("Nome:");
		rotulo1.setBounds(120, 50, 200, 20);
		
		nome = new JTextField();
		nome.setBounds(190, 50, 200, 25);
		
		rotulo2 = new JLabel ("Nota 1:");
		rotulo2.setBounds(120, 90, 200, 20);
		
		n1 = new JTextField();
		n1.setBounds(190, 90, 200, 25);
		
		rotulo3 = new JLabel ("Nota 2:");
		rotulo3.setBounds(120, 130, 200, 20);
		
		n2 = new JTextField();
		n2.setBounds(190, 130, 200, 25);
		
		rotulo4 = new JLabel ("Nota 3:");
		rotulo4.setBounds(120, 170, 200, 20);
		
		n3 = new JTextField();
		n3.setBounds(190, 170, 200, 25);
		
		cadastrar = new JButton("Enviar");
		cadastrar.setBounds(190, 205, 200, 20);
						/* x y x y */
		painel.add(rotulo1);
		painel.add(rotulo2);
		painel.add(rotulo3);
		painel.add(rotulo4);
		painel.add(nome);
		painel.add(n1);
		painel.add(n2);
		painel.add(n3);
		painel.add(cadastrar);
		
	}

	public static void main(String[] args) {
		
		TelaDeVdd tela = new TelaDeVdd();
		tela.setVisible(true);
		
	}
}