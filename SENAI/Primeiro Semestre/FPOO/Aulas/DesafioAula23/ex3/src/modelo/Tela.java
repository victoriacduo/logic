package modelo;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel rotulo1, rotulo2;
	private JTextField email, senha;
	private JButton login;
	
	Tela() {
		setTitle("Tela de Login");
		setBounds(600, 300, 600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		rotulo1 = new JLabel ("Email:");
		rotulo1.setBounds(120, 50, 100, 20);
		
		email = new JTextField();
		email.setBounds(190, 50, 200, 25);
		
		rotulo2 = new JLabel ("Senha:");
		rotulo2.setBounds(120, 90, 200, 20);
		
		senha = new JTextField();
		senha.setBounds(190, 90, 200, 25);
		
		login = new JButton("Login");
		login.setBounds(150, 150, 200, 20);
		login.addActionListener(this);
						/* x y x y */
		painel.add(rotulo1);
		painel.add(rotulo2);
		painel.add(email);
		painel.add(senha);
		painel.add(login);
		
	}

	public static void main(String[] args) {
		
		Tela tela = new Tela();
		tela.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login) {
			JOptionPane.showMessageDialog(this, "Oi, você clicou em Login");
		}
	}
}