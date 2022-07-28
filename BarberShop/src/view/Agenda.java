package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

public class Agenda extends JFrame {

	private JPanel contentPane;
	private JTextField campoId;
	private JTextField campoServico;
	private JTextField campoValor;
	private JTextField campoHorario;
	private JTextField campoData;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Agenda() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Agenda.class.getResource("/icons/icons8-jacaré-48.png")));
		setTitle("Agendamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(88, 304, 734, 126);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Id", "Cliente", "Servi\u00E7o", "Valor", "Horario", "Data", "Observa\u00E7ao"
			}
		));
		scrollPane.setViewportView(table);
		
		campoData = new JTextField();
		campoData.setColumns(10);
		campoData.setBounds(159, 224, 190, 19);
		contentPane.add(campoData);
		
		JLabel lblData = new JLabel("Data");
		lblData.setForeground(Color.WHITE);
		lblData.setFont(new Font("Dialog", Font.BOLD, 14));
		lblData.setBounds(88, 228, 70, 15);
		contentPane.add(lblData);
		
		JButton btnAgendar = new JButton("Agendar");
		btnAgendar.setForeground(Color.BLACK);
		btnAgendar.setBackground(Color.GREEN);
		btnAgendar.setBounds(88, 255, 734, 37);
		contentPane.add(btnAgendar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(393, 93, 429, 122);
		contentPane.add(textArea);
		
		JLabel lblObservacao = new JLabel("Observaçao");
		lblObservacao.setForeground(Color.WHITE);
		lblObservacao.setFont(new Font("Dialog", Font.BOLD, 14));
		lblObservacao.setBounds(557, 58, 100, 15);
		contentPane.add(lblObservacao);
		
		campoHorario = new JTextField();
		campoHorario.setBounds(159, 196, 190, 19);
		contentPane.add(campoHorario);
		campoHorario.setColumns(10);
		
		campoValor = new JTextField();
		campoValor.setBounds(159, 161, 190, 19);
		contentPane.add(campoValor);
		campoValor.setColumns(10);
		
		campoServico = new JTextField();
		campoServico.setBounds(159, 126, 190, 19);
		contentPane.add(campoServico);
		campoServico.setColumns(10);
		
		JComboBox comboBoxCliente = new JComboBox();
		comboBoxCliente.setBounds(159, 88, 190, 24);
		contentPane.add(comboBoxCliente);
		
		JLabel lblHorario = new JLabel("Horario");
		lblHorario.setForeground(Color.WHITE);
		lblHorario.setFont(new Font("Dialog", Font.BOLD, 14));
		lblHorario.setBounds(88, 198, 70, 15);
		contentPane.add(lblHorario);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setForeground(Color.WHITE);
		lblValor.setFont(new Font("Dialog", Font.BOLD, 14));
		lblValor.setBounds(88, 163, 70, 15);
		contentPane.add(lblValor);
		
		JLabel lblServico = new JLabel("Serviço");
		lblServico.setForeground(Color.WHITE);
		lblServico.setFont(new Font("Dialog", Font.BOLD, 14));
		lblServico.setBounds(88, 128, 70, 15);
		contentPane.add(lblServico);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setForeground(Color.WHITE);
		lblCliente.setFont(new Font("Dialog", Font.BOLD, 14));
		lblCliente.setBounds(88, 93, 70, 15);
		contentPane.add(lblCliente);
		
		campoId = new JTextField();
		campoId.setBounds(159, 56, 190, 19);
		contentPane.add(campoId);
		campoId.setColumns(10);
		
		JLabel lblId = new JLabel("Id");
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Dialog", Font.BOLD, 14));
		lblId.setBounds(88, 58, 70, 15);
		contentPane.add(lblId);
		
		JLabel fundoPretoAgenda = new JLabel("");
		fundoPretoAgenda.setIcon(new ImageIcon(Agenda.class.getResource("/imagens/Agenda-PainelFundo.png")));
		fundoPretoAgenda.setBounds(0, 38, 881, 421);
		contentPane.add(fundoPretoAgenda);
		
		JLabel fundoAgenda = new JLabel("");
		fundoAgenda.setIcon(new ImageIcon(Agenda.class.getResource("/imagens/AgendaFundo.png")));
		fundoAgenda.setBounds(0, 0, 928, 498);
		contentPane.add(fundoAgenda);
	}
}
