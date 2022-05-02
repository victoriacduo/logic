package visao;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingUtilities;


public class PetForm extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel id, especie, raca, nome, peso, nasci, dono, tel;
	private JTextField idLabel, racaLabel, nomeLabel, pesoLabel, nasciLabel, donoLabel, telLabel;
	private JButton cadastrar, buscar, alterar, excluir;
	private JComboBox especieLabel;
	private JTextArea area, rotulo;
	private String path = "";
	private imageIcon icon;
	
	PetForm() {
		
		String[] especieL = {"Gato", "Cachorro", "Pássaro", "Hamster"};
		
		setTitle("Formulário de Pets");
		setBounds(600, 700, 550, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		painel.setBackground(new Color(133, 174, 209));
		setLayout(null);
		
		id = new JLabel ("ID:");
		id.setBounds(20, 20, 100, 20);
		
		idLabel = new JTextField();
		idLabel.setBounds(110, 20, 170, 20);
		
		especie = new JLabel ("Especie:");
		especie.setBounds(20, 50, 200, 20);
		
		especieLabel = new JComboBox(especieL);
		especieLabel.setBounds(110, 50, 170, 20);
		
		raca = new JLabel ("Raça:");
		raca.setBounds(20, 80, 200, 20);
		
		racaLabel = new JTextField();
		racaLabel.setBounds(110, 80, 170, 20);
		
		nome = new JLabel ("Nome:");
		nome.setBounds(20, 110, 200, 20);
		
		nomeLabel = new JTextField();
		nomeLabel.setBounds(110, 110, 170, 20);
		
		peso = new JLabel ("Peso:");
		peso.setBounds(20, 140, 200, 20);
		
		pesoLabel = new JTextField();
		pesoLabel.setBounds(110, 140, 170, 20);
		
		nasci = new JLabel ("Nascimento:");
		nasci.setBounds(20, 170, 200, 20);
		
		nasciLabel = new JTextField();
		nasciLabel.setBounds(110, 170, 170, 20);
		
		dono = new JLabel ("Dono:");
		dono.setBounds(20, 200, 200, 20);
		
		donoLabel = new JTextField();
		donoLabel.setBounds(110, 200, 170, 20);
		
		tel = new JLabel ("Telefone:");
		tel.setBounds(20, 230, 200, 20);
		
		telLabel = new JTextField();
		telLabel.setBounds(110, 230, 170, 20);
		
		cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(300, 20, 200, 20);
		cadastrar.addActionListener(this);
		
		buscar = new JButton("Buscar");
		buscar.setBounds(300, 50, 200, 20);
		buscar.addActionListener(this);
		
		alterar = new JButton("Alterar");
		alterar.setBounds(300, 80, 200, 20);
		alterar.addActionListener(this);
		
		excluir = new JButton("Excluir");
		excluir.setBounds(300, 110, 200, 20);
		excluir.addActionListener(this);
		
		area = new JTextArea();
		area.setBounds(300, 140, 200, 110);
		
		rotulo = new JTextArea();
		rotulo.setBounds(20, 280, 490, 110);
		
						/* x y x y */
		painel.add(id);
		painel.add(idLabel);
		painel.add(especie);
		painel.add(especieLabel);
		painel.add(raca);
		painel.add(racaLabel);
		painel.add(nome);
		painel.add(nomeLabel);
		painel.add(peso);
		painel.add(pesoLabel);
		painel.add(nasci);
		painel.add(nasciLabel);
		painel.add(dono);
		painel.add(donoLabel);
		painel.add(tel);
		painel.add(telLabel);
		painel.add(area);
		painel.add(rotulo);

		painel.add(cadastrar);
		painel.add(buscar);
		painel.add(alterar);
		painel.add(excluir);
		
	}

	public static void main(String[] args) {
		
		PetForm tela = new PetForm();
		tela.setVisible(true);
		
	   }
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cadastrar) {
			JOptionPane.showMessageDialog(this, "Pet cadastrado com sucesso");
		} if(e.getSource() == alterar) {
			JOptionPane.showMessageDialog(this, "Tem certeza que deseja alterar?");
		} if(e.getSource() == excluir) {
			JOptionPane.showMessageDialog(this, "Tem certeza que deseja excluir?");
		}
		
	}
}