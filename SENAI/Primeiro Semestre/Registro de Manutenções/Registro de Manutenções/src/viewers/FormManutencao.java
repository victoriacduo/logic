package viewers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Locale;
import java.awt.Color;
import java.util.Currency;
import javax.swing.JDialog;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controllers.ProcessaManutencao;
import models.Manutencao;

public class FormManutencao extends JDialog implements ActionListener {               
	
	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel id, data, equipa, custoHora, tempoGasto;
	private JTextField tfId, tfData, tfCustoHora, tfTempoGasto;
	private JComboBox<String> cbEquipa;
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane rolagem;
	private JButton create, read, update, delete;
	private String imgIco = "./assets/icon.png";
	private int autoId = Integer.parseInt(ProcessaManutencao.manutencoes.get(ProcessaManutencao.manutencoes.size() - 1).getId()) + 1;
	
	private final Locale BRASIL = new Locale("pt", "BR");
	private DecimalFormat df = new DecimalFormat("#.00");
	
	public FormManutencao() {
		
		setTitle("Cadastro de Manutenções");
		setBounds(150, 170, 450, 400);
		setIconImage(new ImageIcon(imgIco).getImage());
		painel = new JPanel();
		painel.setBackground(new Color(160, 160, 160));
		setContentPane(painel);
		setLayout(null);
		
		id = new JLabel("ID:");
		id.setBounds(15, 15, 50, 20);
		painel.add(id);
		tfId = new JTextField(String.format("%d", autoId));
		tfId.setEditable(false);
		tfId.setBounds(120, 15, 100, 20);
		painel.add(tfId);
		
		data = new JLabel("Data:");
		data.setBounds(15, 45, 50, 20);
		painel.add(data);
		tfData = new JTextField();
		tfData.setBounds(120, 45, 100, 20);
		painel.add(tfData);
		
		equipa = new JLabel("Equipamento:");
		equipa.setBounds(15, 75, 100, 20);
		painel.add(equipa);
		cbEquipa = new JComboBox<String>(new String[] { "Motor", "Esteira", "Braço Hidraulico", "Macaco Hidraulico" });
		cbEquipa.setBounds(120, 75, 100, 20);
		painel.add(cbEquipa);
		
		custoHora = new JLabel("Custo por hora:");
		custoHora.setBounds(15, 105, 100, 20);
		painel.add(custoHora);
		tfCustoHora = new JTextField();
		tfCustoHora.setBounds(120, 105, 100, 20);
		painel.add(tfCustoHora);
		
		tempoGasto = new JLabel("Tempo gasto:");
		tempoGasto.setBounds(15, 135, 100, 20);
		painel.add(tempoGasto);
		tfTempoGasto = new JTextField();
		tfTempoGasto.setBounds(120, 135, 100, 20);
		painel.add(tfTempoGasto);
		
		table = new JTable();
		tableModel = new DefaultTableModel();
		tableModel.addColumn("ID");
		tableModel.addColumn("Data");
		tableModel.addColumn("Equipamento");
		tableModel.addColumn("Custo");
		tableModel.addColumn("Tempo Gasto");
		tableModel.addColumn("Total");
		if(ProcessaManutencao.manutencoes.size() != 0) {
			preencherTabela();
		}
		table = new JTable(tableModel);
		table.setEnabled(false);
		rolagem = new JScrollPane(table);
		rolagem.setBounds(15, 205, 400, 180);
		painel.add(rolagem);
		
		create = new JButton("Cadastrar");
		read = new JButton("Buscar");
		update = new JButton("Atualizar");
		delete = new JButton("Excluir");
		create.setBounds(275, 15, 100, 20);
		read.setBounds(275, 40, 100, 20);
		update.setBounds(275, 65, 100, 20);
		delete.setBounds(275, 90, 100, 20);
		update.setEnabled(false);
		delete.setEnabled(false);
		painel.add(create);
		painel.add(read);
		painel.add(update);
		painel.add(delete);
		
		delete.setEnabled(false);
		update.setEnabled(false);
		
		cbEquipa.addActionListener(this);
		create.addActionListener(this);
		read.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);
		
	}
	
	private void preencherTabela() {
		int totLinhas = tableModel.getRowCount();
		if(tableModel.getRowCount() > 0) {
			for (int i = 0; i < totLinhas; i++) {
				tableModel.removeRow(0);
			}
		}
		for (Manutencao m : ProcessaManutencao.manutencoes) {
			tableModel.addRow(new String[] {m.getId(), m.getData(), m.getEquipa(), m.getCustoHora(), m.getTempoHora(), String.format("%.2f", m.getTotal())});
		}
	}
	
	private void cadastrar() {
		if(tfId.getText().length() != 0 && tfData.getText().length() != 0 && tfCustoHora.getText().length() != 0 
				&& tfTempoGasto.getText().length() != 0) {
			
			df.setCurrency(Currency.getInstance(BRASIL));
			double custoHora = 0, tempoGasto = 0;
			int id = 0;
			try {
				custoHora = Double.parseDouble(df.parse(tfCustoHora.getText()).toString());
				tempoGasto = Double.parseDouble(df.parse(tfTempoGasto.getText()).toString());
				id = Integer.parseInt(tfId.getText().toString());
			}catch(ParseException e) {
				System.out.println(e);
			}
			ProcessaManutencao.manutencoes.add(new Manutencao(id, tfData.getText(), cbEquipa.getSelectedItem().toString(), custoHora, tempoGasto));
			ProcessaManutencao.salvar();
			preencherTabela();
			limparCampos();
		}else {
			JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
		}
	}
	
	private void limparCampos() {
		tfData.setText(null);
		tfCustoHora.setText(null);
		tfTempoGasto.setText(null);
	}
	
	int obterIndiceEquipa(String equipa) {
		switch (equipa) {
		case "Motor":
			return 0;
		case "Esteira":
			return 1;
		case "Braço Hidráulico":
			return 2;
		case "Macaco Hidráulico":
			return 3;
		default:
			return -1;
		}
	}
	
	private void alterar() {
		int id = Integer.parseInt(tfId.getText());
		int indice = -1;
		for (Manutencao manutencao : ProcessaManutencao.manutencoes) {
			if(Integer.parseInt(manutencao.getId()) == id) {
				indice = ProcessaManutencao.manutencoes.indexOf(manutencao);
			}
		}
		if (tfId.getText().length() != 0 && tfData.getText().length() != 0 && tfCustoHora.getText().length() != 0 
				&& tfTempoGasto.getText().length() != 0) {
			
			df.setCurrency(Currency.getInstance(BRASIL));
			double custoHora = 0, tempoGasto = 0;
			try {
				custoHora = Double.parseDouble(df.parse(tfCustoHora.getText()).toString());
				tempoGasto = Double.parseDouble(df.parse(tfTempoGasto.getText()).toString());
				id = Integer.parseInt(tfId.getText().toString());
			}catch(ParseException e) {
				System.out.println(e);
			}

			ProcessaManutencao.manutencoes.set(indice, new Manutencao(id, tfData.getText(), cbEquipa.getSelectedItem().toString(), custoHora, tempoGasto));
			
			limparCampos();
		} else {
			JOptionPane.showMessageDialog(this, "Favor preencher todos os campos.");
		}
		create.setEnabled(true);
		update.setEnabled(false);
		delete.setEnabled(false);
		tfId.setText(String.format("%d", Integer.parseInt(ProcessaManutencao.manutencoes.get(ProcessaManutencao.manutencoes.size() - 1).getId()) + 1));
		ProcessaManutencao.salvar();
	}
	
	private void buscar() {
String entrada = JOptionPane.showInputDialog(this, "Digite o ID do equipamento:");
		
		boolean isNumeric = true;
		if(entrada != null && !entrada.equals("")) {
			for (int i = 0; i < entrada.length(); i++) {
				if(!Character.isDigit(entrada.charAt(i))) {
					isNumeric = false;
				}
			}
		}else {
			isNumeric = false;
		}
		
		if(isNumeric) {
			int id = Integer.parseInt(entrada);
			for (Manutencao m : ProcessaManutencao.manutencoes) {
                if (id == Integer.parseInt(m.getId())) {
                    tfId.setText("" + id);
                    tfData.setText(m.getData());
                    cbEquipa.setSelectedIndex(obterIndiceEquipa(m.getEquipa()));
                    tfCustoHora.setText(m.getCustoHora());
                    tfTempoGasto.setText(m.getTempoHora());

                    create.setEnabled(false);
                    update.setEnabled(true);
                    delete.setEnabled(true);
                }
            }
		}
		
	}
	
	private void excluir() {
		int id = Integer.parseInt(tfId.getText());
		int indice = -1;
		for (Manutencao manutencao : ProcessaManutencao.manutencoes) {
			if(Integer.parseInt(manutencao.getId()) == id) {
				indice = ProcessaManutencao.manutencoes.indexOf(manutencao);
			}
		}
		ProcessaManutencao.manutencoes.remove(indice);
		preencherTabela();
		limparCampos();
		create.setEnabled(true);
		update.setEnabled(false);
		delete.setEnabled(false);
		tfId.setText(String.format("%d", Integer.parseInt(ProcessaManutencao.manutencoes.get(ProcessaManutencao.manutencoes.size() - 1).getId()) + 1));
		ProcessaManutencao.salvar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == create) {
			cadastrar();
		}
		if (e.getSource() == read) {
			buscar();
		}
		if (e.getSource() == update) {
			alterar();
		}
		if (e.getSource() == delete) {
			excluir();
		}
	}
	
	public static void main (String[] args) throws ParseException {
		
		ProcessaManutencao.abrir();
		FormManutencao tela = new FormManutencao();
		tela.setVisible(true);
		
	}

}