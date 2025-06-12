package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Group;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Cliente;
import model.ClienteTableModel;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldEmail;
	private JTextField textFieldTelefone;
	private JTextField textFieldBuscar;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1040, 692);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		
		mnArquivo.add(mntmAbrir);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mnArquivo.add(mntmSalvar);
		
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnArquivo.add(mntmSair);
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnAjuda.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Clientes");
		lblNewLabel.setFont(new Font("LM Sans 10", Font.BOLD, 28));
		lblNewLabel.setBounds(349, 58, 438, 66);
		contentPane.add(lblNewLabel);
		
		ImageIcon originalIcon = new ImageIcon(TelaCadastro.class.getResource("/img/customer-service.png"));

		// Redimensionar a imagem para 115x84
		Image image = originalIcon.getImage();
		Image resizedImage = image.getScaledInstance(115, 84, Image.SCALE_SMOOTH);
		ImageIcon resizedIcon = new ImageIcon(resizedImage);

		// Usar o ícone redimensionado no JLabel
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(resizedIcon);
		lblNewLabel_1.setBounds(172, 43, 115, 84);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 136, 979, 184);
		contentPane.add(panel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 12, 84, 17);
		lblNome.setFont(new Font("Dialog", Font.BOLD, 20));
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(12, 41, 536, 42);
		textFieldNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(12, 104, 114, 17);
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 20));
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(12, 130, 536, 42);
		textFieldEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(586, 12, 175, 17);
		lblTelefone.setFont(new Font("Dialog", Font.BOLD, 20));
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setBounds(586, 41, 381, 42);
		textFieldTelefone.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(584, 133, 383, 39);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setSelected(true);
		rdbtnMasculino.setFont(new Font("Dialog", Font.BOLD, 20));
		rdbtnMasculino.setBackground(new Color(255, 255, 255));
		rdbtnMasculino.setBounds(8, 0, 151, 42);
		panel_1.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setFont(new Font("Dialog", Font.BOLD, 20));
		rdbtnFeminino.setBackground(new Color(255, 255, 255));
		rdbtnFeminino.setBounds(211, 0, 164, 42);
		panel_1.add(rdbtnFeminino);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnFeminino);
		buttonGroup.add(rdbtnMasculino);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(586, 104, 60, 17);
		lblSexo.setFont(new Font("Dialog", Font.BOLD, 20));
		panel.setLayout(null);
		panel.add(lblNome);
		panel.add(lblTelefone);
		panel.add(textFieldNome);
		panel.add(textFieldTelefone);
		panel.add(lblEmail);
		panel.add(lblSexo);
		panel.add(textFieldEmail);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(30, 332, 979, 66);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButtonSalvar = new JButton("Salvar");		
		
		btnNewButtonSalvar.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButtonSalvar.setBounds(12, 12, 105, 42);
		panel_2.add(btnNewButtonSalvar);
		
		JButton btnNewButtonExcluir = new JButton("Excluir");
		
		btnNewButtonExcluir.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButtonExcluir.setBounds(157, 12, 105, 42);
		panel_2.add(btnNewButtonExcluir);
		
		JButton btnNewButtonBuscar = new JButton("Buscar");
		
		btnNewButtonBuscar.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButtonBuscar.setBounds(297, 12, 105, 42);
		panel_2.add(btnNewButtonBuscar);
		
		textFieldBuscar = new JTextField();
		textFieldBuscar.setBounds(427, 12, 540, 42);
		panel_2.add(textFieldBuscar);
		textFieldBuscar.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(30, 410, 979, 237);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 12, 955, 213);
		panel_3.add(scrollPane);
		
		ArrayList<Cliente> clientes = new ArrayList<>();		
		ClienteTableModel modelo = new ClienteTableModel(clientes);
		modelo.addCliente(new Cliente("Maria", "1234-5689", "maria@unir.br", "Feminino"));
		modelo.addCliente(new Cliente("João", "2234-5678", "joao@unir.br", "Masculino"));
		modelo.addCliente(new Cliente("Ana", "3234-5678", "ana@unir.br", "Feminino"));
		modelo.addCliente(new Cliente("Carlos", "4234-5678", "carlos@unir.br", "Masculino"));
		modelo.addCliente(new Cliente("Fernanda", "5234-5678", "fernanda@unir.br", "Feminino"));
		modelo.addCliente(new Cliente("Lucas", "6234-5678", "lucas@unir.br", "Masculino"));
		modelo.addCliente(new Cliente("Juliana", "7234-5678", "juliana@unir.br", "Feminino"));
		modelo.addCliente(new Cliente("Bruno", "8234-5678", "bruno@unir.br", "Masculino"));
		modelo.addCliente(new Cliente("Patrícia", "9234-5678", "patricia@unir.br", "Feminino"));
		modelo.addCliente(new Cliente("Rafael", "1334-5678", "rafael@unir.br", "Masculino"));
		modelo.addCliente(new Cliente("Camila", "2334-5678", "camila@unir.br", "Feminino"));
		modelo.addCliente(new Cliente("Eduardo", "3334-5678", "eduardo@unir.br", "Masculino"));
		modelo.addCliente(new Cliente("Beatriz", "4334-5678", "beatriz@unir.br", "Feminino"));
		modelo.addCliente(new Cliente("Gabriel", "5334-5678", "gabriel@unir.br", "Masculino"));
		modelo.addCliente(new Cliente("Larissa", "6334-5678", "larissa@unir.br", "Feminino"));
		modelo.addCliente(new Cliente("Felipe", "7334-5678", "felipe@unir.br", "Masculino"));
		modelo.addCliente(new Cliente("Aline", "8334-5678", "aline@unir.br", "Feminino"));
		modelo.addCliente(new Cliente("Vinícius", "9334-5678", "vinicius@unir.br", "Masculino"));
		modelo.addCliente(new Cliente("Sabrina", "1434-5678", "sabrina@unir.br", "Feminino"));
		modelo.addCliente(new Cliente("Gustavo", "2434-5678", "gustavo@unir.br", "Masculino"));

		
		
		table = new JTable();
		table.setFont(new Font("Dialog", Font.PLAIN, 12));
		table.setModel(modelo);
		scrollPane.setViewportView(table);
		
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				int retorno = fileChooser.showOpenDialog(TelaCadastro.this);
				if (retorno == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					try {
						carregarDados(file, modelo);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		mntmSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				int retorno = fileChooser.showSaveDialog(TelaCadastro.this);
				if (retorno == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					salvarDados(file, modelo);
				}
			}
		});
		
		btnNewButtonSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Coletando os dados informados pelo usuario na interface
				String nome = textFieldNome.getText().toString();
				String telefone = textFieldTelefone.getText().toString();
				String email = textFieldEmail.getText().toString();
				String sexo = rdbtnFeminino.isSelected() ? "Feminino" : "Masculino";
				if (nome.isEmpty() || email.isEmpty() || sexo.isEmpty()) {
					JOptionPane.showMessageDialog(TelaCadastro.this, "Preencha todos os campos",
							"Mensagem de Alerta!", JOptionPane.WARNING_MESSAGE);
				}else {
					Cliente cliente = new Cliente(nome, email, sexo, telefone);
					modelo.addCliente(cliente);
					JOptionPane.showMessageDialog(TelaCadastro.this, "Cliente salvo com sucesso!",
							"Salvar Cliente", JOptionPane.INFORMATION_MESSAGE);
					textFieldNome.setText("");
					textFieldTelefone.setText("");
					textFieldEmail.setText("");
					buttonGroup.clearSelection();
					
				}
				
			}
		});
		
		btnNewButtonExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int linha = table.getSelectedRow();				
				modelo.removerCliente(linha);

			}
		});
		
		
		btnNewButtonBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = textFieldBuscar.getText().toString();
				if (!nome.isEmpty()) {
					int indice = modelo.buscarCliente(nome);
					table.setRowSelectionInterval(indice, indice);
				}
			}
		});		
		
	}
	
	private static void carregarDados(File file, ClienteTableModel modelo) throws IOException {
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			bufferedReader.readLine(); //Lê e ignora o cabeçalho do arquivo!
			modelo.limparDados();
			String linha;
			while((linha =  bufferedReader.readLine()) != null ) {
				String campos[] = linha.split(",");
				if (campos.length == 4) {
					Cliente cliente = new Cliente(campos[0], 
							campos[1], campos[2], campos[3]);
					modelo.addCliente(cliente);
				}
			}
			fileReader.close();
			bufferedReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void salvarDados(File file, ClienteTableModel modelo) {
	
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("Nome, Telefone, e-mail, Sexo");
			bufferedWriter.newLine();
			
			for (int i=0; i < modelo.getRowCount(); i++) {
				String nome = modelo.getValueAt(i, 0).toString();
				String telefone = modelo.getValueAt(i, 1).toString();
				String email = modelo.getValueAt(i, 2).toString();
				String sexo = modelo.getValueAt(i, 3).toString();
				bufferedWriter.write(nome+","+telefone+","+email+","+sexo);
				System.out.println(nome+","+telefone+","+email+","+sexo);
				bufferedWriter.newLine();
			}	
			JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!",
                    "Salvar dados", JOptionPane.INFORMATION_MESSAGE);
			bufferedWriter.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
