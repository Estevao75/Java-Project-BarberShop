package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/icons/icons8-jacaré-48.png")));
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.CYAN);
		menuBar.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.setBounds(0, 0, 694, 21);
		contentPane.add(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		mnCadastro.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(mnCadastro);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cliente");
		mntmNewMenuItem.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icons/cliente-icon.png")));
		mnCadastro.add(mntmNewMenuItem);
		
		JMenuItem mntmUsuario = new JMenuItem("Serviços");
		mntmUsuario.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icons/tesoura-icon.png")));
		mnCadastro.add(mntmUsuario);
		
		JMenu mnUsuarios = new JMenu("Usuarios");
		mnUsuarios.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(mnUsuarios);
		
		JMenuItem mntmNomes = new JMenuItem("Nomes");
		mntmNomes.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icons/cliente-icon.png")));
		mnUsuarios.add(mntmNomes);
		
		JMenu mnNewMenu = new JMenu("Operaçoes");
		mnNewMenu.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmHorarios = new JMenuItem("Horarios");
		mntmHorarios.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icons/relatorioTrabalho-icon.png")));
		mnNewMenu.add(mntmHorarios);
		
		JLabel fundoMenu = new JLabel("");
		fundoMenu.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagens/fundo-MenuPrincipal.jpg")));
		fundoMenu.setBounds(0, 0, 694, 452);
		contentPane.add(fundoMenu);
		
		
	}
}
