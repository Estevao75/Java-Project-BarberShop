package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLogin.class.getResource("/icons/icons8-jacaré-48.png")));
		setTitle("BarberShop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setFont(new Font("Dyuthi", Font.BOLD, 28));
		btnIniciar.setBounds(196, 268, 388, 53);
		contentPane.add(btnIniciar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(317, 206, 267, 19);
		contentPane.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPassword.setBounds(181, 199, 121, 31);
		contentPane.add(lblPassword);
		
		campoNome = new JTextField();
		campoNome.setBackground(Color.WHITE);
		campoNome.setBounds(262, 143, 322, 19);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Login:");
		lblNome.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNome.setForeground(Color.WHITE);
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(181, 136, 76, 31);
		contentPane.add(lblNome);
		
		JLabel telaFundoCadastro = new JLabel("Barber");
		telaFundoCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		telaFundoCadastro.setForeground(Color.WHITE);
		telaFundoCadastro.setFont(new Font("Laksaman", Font.BOLD, 27));
		telaFundoCadastro.setBounds(281, 59, 149, 53);
		contentPane.add(telaFundoCadastro);
		
		JLabel fundoLogo = new JLabel("");
		fundoLogo.setIcon(new ImageIcon(TelaLogin.class.getResource("/imagens/painel-login.png")));
		fundoLogo.setBounds(108, 63, 438, 286);
		contentPane.add(fundoLogo);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(TelaLogin.class.getResource("/imagens/Logo.jpg")));
		logo.setBounds(-62, -22, 892, 583);
		contentPane.add(logo);
		setLocationRelativeTo(null);
	}
}
