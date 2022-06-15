package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controle.PetProcess;
import modelo.Pet;

public class PetForms extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel id, especie, nomePet, raca, peso, nascimento, nomeDono, telefone, rotulos, imagem;
	private JTextField tfId, tfNomePet, tfRaca, tfPeso, tfNascimento, tfNomeDono, tfTelefone;
	private JComboBox<String> especieLabel;
	private JTextArea verResultados;
	private JButton cadastrar, buscar, alterar, excluir;
	private String imgIco = "C:\\logic\\FPOO\\ProjetoPets\\Projeto\\src\\assets\\gatinho.png";
	private String[] imagens = { "C:\\logic\\FPOO\\ProjetoPets\\Projeto\\src\\assets\\gato.png",
			"C:\\logic\\FPOO\\ProjetoPets\\Projeto\\src\\assets\\dog.png",
			"C:\\logic\\FPOO\\ProjetoPets\\Projeto\\src\\assets\\lontra.png",
			"C:\\logic\\FPOO\\ProjetoPets\\Projeto\\src\\assets\\axolot.jpg" };
	private ImageIcon icon;
	private int autoId = PetProcess.pets.size() + 1;
	private String texto = "";
	private JScrollPane rolagem;

	private final Locale BRASIL = new Locale("pt", "BR");
	private DecimalFormat df = new DecimalFormat("$.00");

	PetForms() {
		setTitle("Formulário de Pets");
		setBounds(200, 300, 500, 500);
		setIconImage(new ImageIcon(imgIco).getImage());
		painel = new JPanel();
		painel.setBackground(new Color(133, 174, 209));
		setContentPane(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		id = new JLabel("Id:");
		id.setBounds(20, 20, 120, 20);
		painel.add(id);
		especie = new JLabel("Especie:");
		especie.setBounds(20, 50, 120, 20);
		painel.add(especie);
		nomePet = new JLabel("Nome pet:");
		nomePet.setBounds(20, 80, 120, 20);
		painel.add(nomePet);
		raca = new JLabel("Raça:");
		raca.setBounds(20, 110, 120, 20);
		painel.add(raca);
		peso = new JLabel("Peso:");
		peso.setBounds(20, 140, 120, 20);
		painel.add(peso);
		nascimento = new JLabel("Nascimento:");
		nascimento.setBounds(20, 170, 120, 20);
		painel.add(nascimento);
		nomeDono = new JLabel("Nome dono:");
		nomeDono.setBounds(20, 200, 120, 20);
		painel.add(nomeDono);
		telefone = new JLabel("Telefone:");
		telefone.setBounds(20, 230, 120, 20);
		painel.add(telefone);
		rotulos = new JLabel(
				"Id:... Espécie:....... Pet:................ Peso:.... Idade:... Dono:............. Telefone:.......");
		rotulos.setBounds(20, 260, 400, 20);
		painel.add(rotulos);

		tfId = new JTextField(String.format("%d", autoId));
		tfId.setEditable(false);
		tfId.setBounds(140, 20, 160, 20);
		painel.add(tfId);
		especieLabel = new JComboBox<String>(new String[] { "Gato", "Cachorro", "Lontra", "Outro" });
		especieLabel.setBounds(140, 50, 160, 20);
		painel.add(especieLabel);
		tfNomePet = new JTextField();
		tfNomePet.setBounds(140, 80, 160, 20);
		painel.add(tfNomePet);
		tfRaca = new JTextField();
		tfRaca.setBounds(140, 110, 160, 20);
		painel.add(tfRaca);
		tfPeso = new JTextField();
		tfPeso.setBounds(140, 140, 160, 20);
		painel.add(tfPeso);
		tfNascimento = new JTextField();
		tfNascimento.setBounds(140, 170, 160, 20);
		painel.add(tfNascimento);
		tfNomeDono = new JTextField();
		tfNomeDono.setBounds(140, 200, 160, 20);
		painel.add(tfNomeDono);
		tfTelefone = new JTextField();
		tfTelefone.setBounds(140, 230, 160, 20);
		painel.add(tfTelefone);
		verResultados = new JTextArea();
		verResultados.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		preencherArea();
		rolagem = new JScrollPane(verResultados);
		rolagem.setBounds(20, 290, 445, 150);
		painel.add(rolagem);
		
		imagem = new JLabel();
		imagem.setBounds(310, 140, 150, 110);
		imagem.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		mostrarImagem(0);
		painel.add(imagem);

		cadastrar = new JButton("Cadastrar");
		buscar = new JButton("Buscar");
		alterar = new JButton("Atualizar");
		excluir = new JButton("Excluir");
		cadastrar.setBounds(310, 20, 150, 20);
		buscar.setBounds(310, 50, 150, 20);
		alterar.setBounds(310, 80, 150, 20);
		excluir.setBounds(310, 110, 150, 20);
		alterar.setEnabled(false);
		excluir.setEnabled(false);
		painel.add(cadastrar);
		painel.add(buscar);
		painel.add(alterar);
		painel.add(excluir);

		especieLabel.addActionListener(this);
		cadastrar.addActionListener(this);
		buscar.addActionListener(this);
		alterar.addActionListener(this);
		excluir.addActionListener(this);

	}

	private void mostrarImagem(int indice) {
		icon = new ImageIcon(new ImageIcon(imagens[indice]).getImage().getScaledInstance(150, 115, 100));
		imagem.setIcon(icon);
	}

	private void cadastrar() {
		if (tfNomePet.getText().length() != 0 && tfRaca.getText().length() != 0 && tfPeso.getText().length() != 0
				&& tfNascimento.getText().length() != 0 && tfNomeDono.getText().length() != 0
				&& tfTelefone.getText().length() != 0) {
			
			df.setCurrency(Currency.getInstance(BRASIL));
			float p;
			try {
				p = Float.parseFloat(df.parse(peso.getText()).toString());
			} catch (ParseException e) {
				System.out.println(e);
				p = 0;
			}
			
			PetProcess.pets.add(new Pet(autoId, especieLabel.getSelectedItem().toString(), tfNomePet.getText(),
					tfRaca.getText(), p, tfNascimento.getText(), tfNomeDono.getText(),
					tfTelefone.getText()));
			autoId++;
			preencherArea();
			limparCampos();
		} else {
			JOptionPane.showMessageDialog(this, "Favor preencher todos os campos.");
		}
		cadastrar.setEnabled(true);
		alterar.setEnabled(false);
		excluir.setEnabled(false);
		tfId.setText(String.format("%d", autoId));
	}

	private void limparCampos() {
		tfNomePet.setText(null);
		tfRaca.setText(null);
		tfPeso.setText(null);
		tfNascimento.setText(null);
		tfNomeDono.setText(null);
		tfTelefone.setText(null);
	}

	private void preencherArea() {
		texto = ""; // Limpar a área de texto antes de preenher
		for (Pet p : PetProcess.pets) {
			texto += p.toString();
		}
		verResultados.setText(texto);
	}

	// retornar indice da especie

	int indiceEspecie(String especie) {
		switch (especie) {
		case "Gato":
			return 0;
		case "Cachorro":
			return 1;
		case "Lontra":
			return 2;
		case "Outro":
			return 3;
		default:
			return -1;
		}
	}

	private void buscar() {
		String entrada = JOptionPane.showInputDialog("Digite o Id do animal:");
		int id = Integer.parseInt(entrada);
		Pet pet = new Pet(id);
		if (PetProcess.pets.contains(pet)) {
			int indice = PetProcess.pets.indexOf(pet);
			tfId.setText(PetProcess.pets.get(indice).getId("s"));

			especieLabel.setSelectedIndex(indiceEspecie(PetProcess.pets.get(indice).getEspecie()));
			tfNomePet.setText(PetProcess.pets.get(indice).getNomePet());
			tfRaca.setText(PetProcess.pets.get(indice).getRaca());
			tfPeso.setText(PetProcess.pets.get(indice).getPeso("s"));
			tfNascimento.setText(PetProcess.pets.get(indice).getNascimento("s"));
			tfNomeDono.setText(PetProcess.pets.get(indice).getNomeDono());
			tfTelefone.setText(PetProcess.pets.get(indice).getTelefone());
			cadastrar.setEnabled(false);
			alterar.setEnabled(true);
			excluir.setEnabled(true);
		} else {
			JOptionPane.showMessageDialog(this, "Pet não encontrado");
		}

	}

	private void excluir() {
		int ID = Integer.parseInt(tfId.getText());
		PetProcess.pets.remove(Integer.parseInt(tfId.getText()));
		Pet pet = new Pet(ID);
		int indice = PetProcess.pets.indexOf(pet);
		PetProcess.pets.remove(indice);
		preencherArea();
		limparCampos();
		excluir.setEnabled(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == especieLabel) {
			mostrarImagem(especieLabel.getSelectedIndex());
		}
		if (e.getSource() == cadastrar) {
			cadastrar();
		}
		if (e.getSource() == buscar) {
			buscar();
		}
		if (e.getSource() == alterar) {

		}
		if (e.getSource() == excluir) {

		}
	}

	public static void main(String[] agrs) throws ParseException {
		/* PetProcess.carregarTestes(); */
		new PetForms().setVisible(true);
	}

}