package viewers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Locale;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controllers.ProcessaManutencao;

public class FormManutencao extends JFrame implements ActionListener {               
	
	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel id, data, equipa, custoHora, tempoGasto, total;
	private JTextField tfId, tfData, tfCustoHora, tfTempoGasto, tfTotal;
	private JComboBox<String> cbEquipa;
	private JTable table;
	private DefaultTableModel tableModel;
	private JButton create, read, update, delete;
	
	private String imgIco = "./assets/icon.png";
	private ImageIcon icon;
	private int autoId = ProcessaManutencao.manutencoes.get(ProcessaManutencao.manutencoes.size()-1).getId() + 1;
	
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
		
		total = new JLabel("Total:");
		total.setBounds(15, 165, 100, 20);
		painel.add(total);
		tfTotal = new JTextField();
		tfTotal.setBounds(120, 165, 100, 20);
		painel.add(tfTotal);
		
		table = new JTable();
		tableModel = new DefaultTableModel();
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main (String[] args) throws ParseException {
		
		ProcessaManutencao.abrir();
		new FormManutencao().setVisible(true);
		
	}

}