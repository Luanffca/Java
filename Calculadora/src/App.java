import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.Double;

public class App extends JFrame{
	private static JTextField operadorBox1 = new JTextField(25);
	private static JButton nameButton = new JButton("AC");
	private static JButton maisButton = new JButton("+");
	private static JButton menosButton = new JButton("-");
	private static JButton multiplicacaoButton = new JButton("x");
	private static JButton divideButton = new JButton("/");
	private static JButton igualButton = new JButton("=");
	private static JButton pontoButton = new JButton(".");
	private static JButton zeroButton = new JButton("0");
	private static JButton umButton = new JButton("1");
	private static JButton doisButton = new JButton("2");
	private static JButton tresButton = new JButton("3");
	private static JButton quatroButton = new JButton("4");
	private static JButton cincoButton = new JButton("5");
	private static JButton seisButton = new JButton("6");
	private static JButton seteButton = new JButton("7");
	private static JButton oitoButton = new JButton("8");
	private static JButton noveButton = new JButton("9");
	static int opcao = 0;
	static Calculadora calc1 = new Calculadora();
	public static void main(String args[]) throws Exception{

		// Caracteriscas dos Botões
		nameButton.setLayout(null);
		nameButton.setBackground(Color.white);
		nameButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		nameButton.setBounds(15, 52, 62, 50);
		nameButton.setForeground(Color.black);
		nameButton.setFont(new Font("Arial", Font.PLAIN, 20));

		maisButton.setLayout(null);
		maisButton.setBackground(Color.white);
		maisButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		maisButton.setBounds(210, 110, 62, 108);
		maisButton.setForeground(Color.black);
		maisButton.setFont(new Font("Arial", Font.PLAIN, 20));

		menosButton.setLayout(null);
		menosButton.setBackground(Color.white);
		menosButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		menosButton.setBounds(80,52, 62, 50);
		menosButton.setForeground(Color.black);
		menosButton.setFont(new Font("Arial", Font.PLAIN, 20));

		multiplicacaoButton.setLayout(null);
		multiplicacaoButton.setBackground(Color.white);
		multiplicacaoButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		multiplicacaoButton.setBounds(145, 52, 62, 50);
		multiplicacaoButton.setForeground(Color.black);
		multiplicacaoButton.setFont(new Font("Arial", Font.PLAIN, 20));

		divideButton.setLayout(null);
		divideButton.setBackground(Color.white);
		divideButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		divideButton.setBounds(210, 52, 62, 50);
		divideButton.setForeground(Color.black);
		divideButton.setFont(new Font("Arial", Font.PLAIN, 20));

		igualButton.setLayout(null);
		igualButton.setBackground(Color.white);
		igualButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		igualButton.setBounds(210, 226, 62, 108);
		igualButton.setForeground(Color.black);
		igualButton.setFont(new Font("Arial", Font.PLAIN, 20));

		pontoButton.setLayout(null);
		pontoButton.setBackground(Color.white);
		pontoButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		pontoButton.setBounds(145, 284, 62, 50);
		pontoButton.setForeground(Color.black);
		pontoButton.setFont(new Font("Arial", Font.PLAIN, 20));

		zeroButton.setLayout(null);
		zeroButton.setBackground(Color.white);
		zeroButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		zeroButton.setBounds(15, 284, 126, 50);
		zeroButton.setForeground(Color.black);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 20));

		umButton.setLayout(null);
		umButton.setBackground(Color.white);
		umButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		umButton.setBounds(15, 226, 62, 50);
		umButton.setForeground(Color.black);
		umButton.setFont(new Font("Arial", Font.PLAIN, 20));

		doisButton.setLayout(null);
		doisButton.setBackground(Color.white);
		doisButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		doisButton.setBounds(80, 226, 62, 50);
		doisButton.setForeground(Color.black);
		doisButton.setFont(new Font("Arial", Font.PLAIN, 20));

		tresButton.setLayout(null);
		tresButton.setBackground(Color.white);
		tresButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		tresButton.setBounds(145, 226, 62, 50);
		tresButton.setForeground(Color.black);
		tresButton.setFont(new Font("Arial", Font.PLAIN, 20));

		quatroButton.setLayout(null);
		quatroButton.setBackground(Color.white);
		quatroButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		quatroButton.setBounds(15, 168, 62, 50);
		quatroButton.setForeground(Color.black);
		quatroButton.setFont(new Font("Arial", Font.PLAIN, 20));

		cincoButton.setLayout(null);
		cincoButton.setBackground(Color.white);
		cincoButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		cincoButton.setBounds(80, 168, 62, 50);
		cincoButton.setForeground(Color.black);
		cincoButton.setFont(new Font("Arial", Font.PLAIN, 20));

		seisButton.setLayout(null);
		seisButton.setBackground(Color.white);
		seisButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		seisButton.setBounds(145, 168, 62, 50);
		seisButton.setForeground(Color.black);
		seisButton.setFont(new Font("Arial", Font.PLAIN, 20));

		seteButton.setLayout(null);
		seteButton.setBackground(Color.white);
		seteButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		seteButton.setBounds(15, 110, 62, 50);
		seteButton.setForeground(Color.black);
		seteButton.setFont(new Font("Arial", Font.PLAIN, 20));

		oitoButton.setLayout(null);
		oitoButton.setBackground(Color.white);
		oitoButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		oitoButton.setBounds(80, 110, 62, 50);
		oitoButton.setForeground(Color.black);
		oitoButton.setFont(new Font("Arial", Font.PLAIN, 20));

		noveButton.setLayout(null);
		noveButton.setBackground(Color.white);
		noveButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		noveButton.setBounds(145, 110, 62, 50);
		noveButton.setForeground(Color.black);
		noveButton.setFont(new Font("Arial", Font.PLAIN, 20));

		// Janela Grafica do Java
		App window = new App();
		window.setSize(300, 400);
		window.setVisible(true);
		window.setResizable(false);
		window.setTitle("Calculadora - LUAN");
		//window.setLayout(new FlowLayout());
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		// Caixa de Texto 
		operadorBox1.setLayout(null);
		//operadorBox1.setBackground(Color.black); // Cor da caixa de texta
		operadorBox1.setForeground(Color.black); // Cor das Letras
		operadorBox1.setBounds(15, 15, 257, 30); // Local onde coloca a caixa de texto com lagura e altura
		operadorBox1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black)); // Adicinando a Borda da Caixa de Texto
		operadorBox1.setFont(new Font("Arial", Font.PLAIN, 15));

		// Adicionando os Botões na janela 
		window.getContentPane().add(operadorBox1); // Adicionando caixa de texto
		window.getContentPane().add(nameButton);
		window.getContentPane().add(maisButton);
		window.getContentPane().add(menosButton);
		window.getContentPane().add(multiplicacaoButton);
		window.getContentPane().add(divideButton);
		window.getContentPane().add(igualButton);
		window.getContentPane().add(pontoButton);
		window.getContentPane().add(zeroButton);
		window.getContentPane().add(umButton);
		window.getContentPane().add(doisButton);
		window.getContentPane().add(tresButton);
		window.getContentPane().add(quatroButton);
		window.getContentPane().add(cincoButton);
		window.getContentPane().add(seisButton);
		window.getContentPane().add(seteButton);
		window.getContentPane().add(oitoButton);
		window.getContentPane().add(noveButton);


		nameButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				operadorBox1.setText("");
				calc1.operador1 = 0;
				calc1.operador2 = 0;
			}
		});

		maisButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc1.operador1 = Double.valueOf(operadorBox1.getText());
				operadorBox1.setText("");
				opcao = 1;
			}
		});

		menosButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc1.operador1 = Double.valueOf(operadorBox1.getText());
				operadorBox1.setText("");
				opcao = 2;
			}
		});

		multiplicacaoButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc1.operador1 = Double.valueOf(operadorBox1.getText());
				operadorBox1.setText("");
				opcao = 3;
			}
		});

		divideButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc1.operador1 = Double.valueOf(operadorBox1.getText());
				operadorBox1.setText("");
				opcao = 4;
			}
		});

		igualButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				calc1.operador2 = Double.valueOf(operadorBox1.getText());
				operadorBox1.setText("");
				switch (opcao){
					case 1:
						calc1.soma();
					break;
		
					case 2:
						calc1.subtrair();
					break;
		
					case 3:
						calc1.multiplicar();
					break;
		
					case 4:
						calc1.dividir();
					break;
				}
				String resposta = Double.toString(calc1.resultado);
				operadorBox1.setText(resposta);
			}
		});

		pontoButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				operadorBox1.setText(operadorBox1.getText() + ".");
			}
		});

		zeroButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				operadorBox1.setText(operadorBox1.getText() + "0");
			}
		});

		umButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				operadorBox1.setText(operadorBox1.getText() + "1");
			}
		});

		doisButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				operadorBox1.setText(operadorBox1.getText() + "2");
			}
		});

		tresButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				operadorBox1.setText(operadorBox1.getText() + "3");
			}
		});
		quatroButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				operadorBox1.setText(operadorBox1.getText() + "4");
			}
		});

		cincoButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				operadorBox1.setText(operadorBox1.getText() + "5");
			}
		});

		seisButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				operadorBox1.setText(operadorBox1.getText() + "6");
			}
		});

		seteButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				operadorBox1.setText(operadorBox1.getText() + "7");
			}
		});

		oitoButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				operadorBox1.setText(operadorBox1.getText() + "8");
			}
		});

		noveButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				operadorBox1.setText(operadorBox1.getText() + "9");
			}
		});
		

		//window.pack();
		

	}
}