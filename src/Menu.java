import java.awt.Component;
import java.awt.Font;
import javax.swing.*;


public class Menu {
	HistoricoPacientes historico;
	Fila fila;
	
	JFrame janela;
	
	// Menu Inicial
	JPanel  menuInicial;
	JComboBox<Medico> listaMedicos;
	JButton botaoInserirPaciente;
	JButton andarFila;
	JButton mostrarFila;
	JButton adicionarMedico;
	JButton mostrarHistorico;

	//Menu inserir pacientes
	   JPanel menuinserirPacientes;
	JCheckBox pergunta1;
	JCheckBox pergunta2;
	JCheckBox pergunta3;
	JCheckBox pergunta4;
	JTextField fieldNome;
	  JButton enviar;
	  JButton voltar;
	  
	//Menu Mostrar Pacientes
	  JPanel menuMostrarPacientes;
	  JTextArea listaPacientes;
	  JButton voltarLista;
	  
	//Menu Adicionar Medico
	  JPanel menuAdicionarMedico;
	  JTextField fieldNomeMedico;
	  JButton enviarMedico;
	  JButton voltarMedico;
	  
	//Menu Mostrar Histórico
	  JPanel menuMostrarHistorico;
	  JTextArea listaHistorico;
	  JButton voltarHisorico;
	 
	public static void main(String [] args) {	
		Menu menu = new Menu();
		menu.fila = new Fila();
		menu.historico = new HistoricoPacientes();
		menu.criaJanela();
	}
	
	public void criaJanela() {
		janela = new JFrame("Gerenciador de Pacientes");
		janela.setSize(500,500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.setLayout(null);		
		setMenus();
		janela.setVisible(true);	
	}
	
	private void setMenus(){
		//Menu Inicial
		menuInicial = new JPanel();
		menuInicial.setBounds(0, 0, 500, 500);
		menuInicial.setLayout(null);
		
		listaMedicos = new JComboBox<Medico>();
		listaMedicos.setBounds(40,120, 60, 15);
		listaMedicos.setFont(new Font("Arial", Font.PLAIN, 10));
		
		botaoInserirPaciente = new JButton("Inserir Paciente");
		botaoInserirPaciente.setBounds(150, 20, 200, 50);
		
		andarFila = new JButton("Andar Fila");
		andarFila.setBounds(150, 100, 200, 50);
		
		mostrarFila = new JButton("Mostrar Fila");
		mostrarFila.setBounds(150, 180, 200, 50);

		adicionarMedico = new JButton("Adicionar Medico");
		adicionarMedico.setBounds(150, 260, 200, 50);

		mostrarHistorico = new JButton("Mostrar Historico");
		mostrarHistorico.setBounds(150, 340, 200, 50);

		menuInicial.add(listaMedicos);
		menuInicial.add(mostrarHistorico);
		menuInicial.add(adicionarMedico);
		menuInicial.add(mostrarFila);
		menuInicial.add(andarFila);
		menuInicial.add(botaoInserirPaciente);
		janela.add(menuInicial);
		
		menuInserirPacientes();
		menuMostrarPacientes();
		menuAdicionarMedico();
		menuMostrarHistorico();
		menuAcoesBotao();
	}
	
	private void menuInserirPacientes() {
		menuinserirPacientes = new JPanel();
		menuinserirPacientes.setBounds(0, 0, 500, 500);
		menuinserirPacientes.setLayout(null);
		menuinserirPacientes.setVisible(false);
		
		pergunta1 = new JCheckBox("O paciente esta com dificuldade para respirar ou está com muita falta de ar?");
		pergunta1.setBounds(0, 20, 500, 50);
		pergunta1.setFont(new Font("Arial", Font.PLAIN,10));
		pergunta2 = new JCheckBox("O paciente esta com uma dor muito forte ou com algum sangramento que não para?");
		pergunta2.setBounds(0, 100, 500, 50);
		pergunta2.setFont(new Font("Arial", Font.PLAIN,10));
		pergunta3 = new JCheckBox("O paciente esta com sintomas leves, como dor de cabeça, tosse ou febre baixa?");
		pergunta3.setBounds(0, 180, 500, 50);
		pergunta3.setFont(new Font("Arial", Font.PLAIN,10));
		pergunta4 = new JCheckBox("O paciente veio apenas para renovar receita, pegar resultado de exame ou fazer um check-up?");
		pergunta4.setBounds(0, 260, 500, 50);
		pergunta4.setFont(new Font("Arial", Font.PLAIN,10));
		fieldNome = new JTextField();
		fieldNome.setBounds(50, 330, 400, 20);
		fieldNome.setText("Insira o nome");
		
		enviar = new JButton("Enviar");
		enviar.setBounds(250, 370, 180, 50);
		
		voltar = new JButton("Voltar");
		voltar.setBounds(50, 370, 180, 50);
		
		menuinserirPacientes.add(fieldNome);
		menuinserirPacientes.add(voltar);
		menuinserirPacientes.add(enviar);
		menuinserirPacientes.add(pergunta1);
		menuinserirPacientes.add(pergunta2);
		menuinserirPacientes.add(pergunta3);
		menuinserirPacientes.add(pergunta4);
		janela.add(menuinserirPacientes);
	}
	
	private void menuMostrarPacientes() {
		menuMostrarPacientes = new JPanel();
		menuMostrarPacientes.setBounds(0, 0, 500, 500);
		menuMostrarPacientes.setLayout(null);
		menuMostrarPacientes.setVisible(false);
		
		listaPacientes = new JTextArea();
		listaPacientes.setBounds(0, 0, 499, 400);
		listaPacientes.setEditable(false);
		listaPacientes.setFont(new Font("Arial", Font.PLAIN, 9));
		listaPacientes.setLineWrap(true); // quebra linha automática
		listaPacientes.setWrapStyleWord(true); // quebra em palavras inteiras
		
		voltarLista = new JButton("Voltar");
		voltarLista.setBounds(150, 420, 200, 30);
		
		menuMostrarPacientes.add(voltarLista);
		menuMostrarPacientes.add(listaPacientes);
		janela.add(menuMostrarPacientes);
	}
	
	private void menuAdicionarMedico() {
		menuAdicionarMedico = new JPanel();
		menuAdicionarMedico.setBounds(0, 0, 500, 500);
		menuAdicionarMedico.setLayout(null);
		menuAdicionarMedico.setVisible(false);
		
		fieldNomeMedico = new JTextField();
		fieldNomeMedico.setBounds(50, 190, 400, 20);
		fieldNomeMedico.setText("Insira o nome");
		
		enviarMedico = new JButton("Enviar");
		enviarMedico.setBounds(250, 370, 180, 50);
		
		voltarMedico = new JButton("Voltar");
		voltarMedico.setBounds(50, 370, 180, 50);

		menuAdicionarMedico.add(fieldNomeMedico);
		menuAdicionarMedico.add(enviarMedico);
		menuAdicionarMedico.add(voltarMedico);
		janela.add(menuAdicionarMedico);
	}
	
	private void menuMostrarHistorico() {
		menuMostrarHistorico = new JPanel();
		menuMostrarHistorico.setBounds(0, 0, 500, 500);
		menuMostrarHistorico.setLayout(null);
		menuMostrarHistorico.setVisible(false);
		
		listaHistorico = new JTextArea();
		listaHistorico.setBounds(0, 0, 499, 400);
		listaHistorico.setEditable(false);
		listaHistorico.setFont(new Font("Arial", Font.PLAIN, 9));
		listaHistorico.setLineWrap(true); // quebra linha automática
		listaHistorico.setWrapStyleWord(true); // quebra em palavras inteiras
		
		voltarHisorico = new JButton("Voltar");
		voltarHisorico.setBounds(150, 420, 200, 30);
		
		menuMostrarHistorico.add(voltarHisorico);
		menuMostrarHistorico.add(listaHistorico);
		janela.add(menuMostrarHistorico);
	}
	
	private void menuAcoesBotao() {
		//menu Inicial
		botaoInserirPaciente.addActionListener(e -> {
			menuInicial.setVisible(false);
			menuinserirPacientes.setVisible(true);
		});
		andarFila.addActionListener(e -> {
			try {
				Paciente paci = fila.andarFila();
				Atendimento atend =  new Atendimento(paci, (Medico) listaMedicos.getSelectedItem());
				historico.adicionar(atend);
				JOptionPane.showMessageDialog(null, paci.getNome());
			}catch(Exception p){
				JOptionPane.showMessageDialog(null, "Sem pacientes na fila");	
			}
		});
		mostrarFila.addActionListener(e -> {
			System.out.print(fila.exibirFila());
			menuInicial.setVisible(false);
			menuMostrarPacientes.setVisible(true);
			listaPacientes.setText(fila.exibirFila());
		});
		adicionarMedico.addActionListener(e -> {
			menuInicial.setVisible(false);
			menuAdicionarMedico.setVisible(true);
		});
		mostrarHistorico.addActionListener(e -> {
			System.out.print(historico.exibirFila());
			menuInicial.setVisible(false);
			menuMostrarHistorico.setVisible(true);
			listaHistorico.setText(historico.exibirFila());
		});
		
		//Menu adicionar Paciente -------
		enviar.addActionListener(e -> {
			//adiciona paciente a fila
			Paciente.cor classificacao;
			if (pergunta1.isSelected()) {
				classificacao = Paciente.cor.Vermelho;
			}
			else if (pergunta2.isSelected()) {
				classificacao = Paciente.cor.Amarelo;
			}
			else if (pergunta3.isSelected()) {
				classificacao = Paciente.cor.Verde;
			}
			else
				classificacao = Paciente.cor.Azul;
			
			Paciente paci = new Paciente(fieldNome.getText(),classificacao);
			fila.adicionar(paci);
			//reseta campos
			pergunta1.setSelected(false);
			pergunta2.setSelected(false);
			pergunta3.setSelected(false);
			pergunta4.setSelected(false);
			fieldNome.setText("Insira o nome");
			//volta pro menu inicial
			menuInicial.setVisible(true);
			menuinserirPacientes.setVisible(false);
		});
		voltar.addActionListener(e -> {
			//reseta campos
			pergunta1.setSelected(false);
			pergunta2.setSelected(false);
			pergunta3.setSelected(false);
			pergunta4.setSelected(false);
			fieldNome.setText("Insira o nome");
			//voltar menu inicial
			menuInicial.setVisible(true);
			menuinserirPacientes.setVisible(false);
		});
		
		//menu mostrar pacientes ------
		voltarLista.addActionListener(e -> {
			//voltar menu inicial
			menuInicial.setVisible(true);
			menuMostrarPacientes.setVisible(false);
		});
		
		//menu adicionar medico --------
		enviarMedico.addActionListener(e -> {
			//Cria Medico
			Medico medico = new Medico(fieldNomeMedico.getText());
			listaMedicos.addItem(medico);
			//voltar menu inicial
			menuInicial.setVisible(true);
			menuAdicionarMedico.setVisible(false);
		});
		voltarMedico.addActionListener(e -> {
			//voltar menu inicial
			menuInicial.setVisible(true);
			menuAdicionarMedico.setVisible(false);
		});
		
		//menu ver historico -------------
		voltarHisorico.addActionListener(e -> {
			//voltar menu inicial
			menuInicial.setVisible(true);
			menuMostrarHistorico.setVisible(false);
		});
	}
	
	private void inicializaPacientes() {
		// a fazer
	}
	private void inicializaMedicos() {
		// a fazer
	}
}