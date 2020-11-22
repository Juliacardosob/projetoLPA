import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class EntregadorForm extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private  JLabel lbCabecalho;
	private  JTextField tfId, tfNome, tfTelefone, tfHabilitacao, tfVeiculo, tfValorKM;
	private JTable table;
	private JScrollPane scroll;
	private DefaultTableModel tableModel;
	private JButton jbAdd, jbDel, jbCancelar, jbSalvar;
	
	
	EntregadorForm(){
		// Definições da Janela
		setTitle("Cadastro do Entregador");
		setBounds(250,160,597,410);
		panel = new JPanel();
		setContentPane(panel);
		setLayout(null);
					
		// Criando o label
		lbCabecalho = new JLabel("ID           Nome                         Telefone              Habilitacao          Veiculo               ValorKM");
		lbCabecalho.setBounds(10,10,580,20);
		panel.add(lbCabecalho);
		
		// Criando TextField
		tfId = new JTextField();
		tfId.setBounds(10,30,40,25);
		panel.add(tfId);
		
		tfNome = new JTextField();
		tfNome.setBounds(50,30,110,25);
		panel.add(tfNome);
		
		tfTelefone = new JTextField();
		tfTelefone.setBounds(160,30,90,25);
		panel.add(tfTelefone);
		
		tfHabilitacao = new JTextField();
		tfHabilitacao.setBounds(250,30,90,25);
		panel.add(tfHabilitacao);
		
		tfVeiculo = new JTextField();
		tfVeiculo.setBounds(340,30,90,25);
		panel.add(tfVeiculo);
		
		tfValorKM = new JTextField();
		tfValorKM.setBounds(430,30,70,25);
		panel.add(tfValorKM);
		
		// Criando Tabela
		tableModel = new DefaultTableModel();
		tableModel.addColumn("Id");
		tableModel.addColumn("Nome");
		tableModel.addColumn("Telefone");
		tableModel.addColumn("Habilitacao");
		tableModel.addColumn("Veiculo");
		tableModel.addColumn("ValorKM");
		
		table = new JTable(tableModel);
		scroll = new JScrollPane(table);
		scroll.setBounds(10,55,559,275);
		panel.add(scroll);
		
		// Criar os botões
		jbAdd = new JButton("Add");
		jbAdd.setBounds(500,30,68,25);
		jbAdd.addActionListener(this);
		panel.add(jbAdd);
		
		
		jbDel = new JButton("Del");
		jbDel.setBounds(278,330,59,30);
		jbDel.addActionListener(this);
		panel.add(jbDel);
		
		jbCancelar = new JButton("Cancelar");
		jbCancelar.setBounds(328,330,120,30);
		jbCancelar.addActionListener(this);
		panel.add(jbCancelar);
		
		jbSalvar = new JButton("Salvar");
		jbSalvar.setBounds(448,330,120,30);
		jbSalvar.addActionListener(this);
		panel.add(jbSalvar);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbAdd) {
			System.out.println("Add");
		} else if (e.getSource() == jbDel) {
			System.out.println("Del");
		} else if (e.getSource() == jbCancelar) {
			System.out.println("Cancelar");
		} else if (e.getSource() == jbSalvar) {
			System.out.println("Salvar");
		}
	}

}