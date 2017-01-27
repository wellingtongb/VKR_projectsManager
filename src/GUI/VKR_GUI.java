package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VKR_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VKR_GUI frame = new VKR_GUI();
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
	public VKR_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmImprimir = new JMenuItem("Imprimir");
		mnMenu.add(mntmImprimir);
		
		JMenuItem mntmExportar = new JMenuItem("Exportar");
		mnMenu.add(mntmExportar);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnMenu.add(mntmSair);
		
		JMenu mnProjetos = new JMenu("Projetos");
		menuBar.add(mnProjetos);
		
		JMenuItem mntmNovoProjeto = new JMenuItem("Novo Projeto");
		mnProjetos.add(mntmNovoProjeto);
		
		JMenuItem mntmBuscarProjeto = new JMenuItem("Buscar Projeto");
		mnProjetos.add(mntmBuscarProjeto);
		
		JMenuItem mntmBuscarOramento = new JMenuItem("Buscar Or\u00E7amento");
		mnProjetos.add(mntmBuscarOramento);
		
		JMenuItem mntmEditarProjeto = new JMenuItem("Editar Projeto");
		mnProjetos.add(mntmEditarProjeto);
		
		JMenuItem mntmAdicionarProjetoExecutivo = new JMenuItem("Adicionar Projeto Executivo");
		mnProjetos.add(mntmAdicionarProjetoExecutivo);
		
		JMenu mnGerenciar = new JMenu("Gerenciar");
		menuBar.add(mnGerenciar);
		
		JMenuItem mntmNovoVendedor = new JMenuItem("Novo Vendedor");
		mnGerenciar.add(mntmNovoVendedor);
		
		JMenuItem mntmNovoProjetista = new JMenuItem("Novo Projetista");
		mnGerenciar.add(mntmNovoProjetista);
		
		JMenuItem mntmEditarVendedor = new JMenuItem("Editar Vendedor");
		mnGerenciar.add(mntmEditarVendedor);
		
		JMenuItem mntmEditarProjetista = new JMenuItem("Editar Projetista");
		mnGerenciar.add(mntmEditarProjetista);
		
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
