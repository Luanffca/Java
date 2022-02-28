import javax.swing.JButton;
import javax.swing.JFrame;
public class botao extends JFrame{
    private JButton soma, subtracao, multiplicacao, dividir;
    private JButton ok;
    
    public botao(){
        super("    CALCULADORA     ");
   
        ok = new JButton("OK");
        soma = new JButton("SOMAR"); 
        subtracao = new JButton("SUBTRAIR");
        multiplicacao = new JButton("MULTIPLICAR");
        dividir = new JButton("DIVIDIR");
        
        add(ok);
        add(soma);
        add(subtracao);
        add(multiplicacao);
        add(dividir);
    }
   
   
}

/* Classe MIAN */

//botao botao1 = new botao();
  
		// botao1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// botao1.setSize(350,80);
		// botao1.setVisible(true);

/*

import javax.swing.JOptionPane;
import java.lang.Double;

public class App{
	public static void main(String args[]){
		Calculadora calc1 = new Calculadora();
		String opcao;
		
		JOptionPane.showMessageDialog(null, "Bem-Vindo à nossa aplicação!","CALCULADORA", JOptionPane.INFORMATION_MESSAGE);
		calc1.operador1=Double.valueOf(JOptionPane.showInputDialog("Digite o operando 1")); 
		
		opcao = JOptionPane.showInputDialog("Escolha a opção desejada para a operação: "
												+"\n 1 - Soma "
												+"\n 2 - Subtração "
												+"\n 3 - Multiplicação"
												+"\n 4 - Divisão" + "\n 5 + Raiz Quadrada" + "\n 6 - Pocentagem");
		int op = Integer.parseInt(opcao);
		switch(op){
			case 1:
				calc1.operador2=Double.valueOf(JOptionPane.showInputDialog("Digite o operando 2"));
				calc1.soma();
			break;
			case 2:
				calc1.operador2=Double.valueOf(JOptionPane.showInputDialog("Digite o operando 2"));
				calc1.subtrair();
			break;
			case 3:
				calc1.operador2=Double.valueOf(JOptionPane.showInputDialog("Digite o operando 2"));
				calc1.multiplicar();
			break;
			case 4:
				calc1.operador2=Double.valueOf(JOptionPane.showInputDialog("Digite o operando 2"));
				calc1.dividir();
			break;
			case 5:
				calc1.raiz();
			break;
			case 6:
				calc1.pocentagem();
			break;
		}  
		JOptionPane.showMessageDialog(null, Double.toString(calc1.resultado),"CALCULADORA", JOptionPane.INFORMATION_MESSAGE);
	}
MRC - retorna o valor na memoria de clicar duas vezes apaga
M- 
M+ Salva na memoria
 */

/*JTextField texto = new JTextField();
		texto.setLayout(null);
		texto.setBackground(Color.black);
		texto.setForeground(Color.white);
		texto.setBounds(50, 10, 280, 50);

sete.addActionListener(new java.awt.event.ActionListener(){
    public void actionPerformed(ActionEvent e){
        texto.setText(texto.getText() + "7");
    }
});



sete.setLayout(null);
sete.setBackground(Color.black);
sete.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.white));
sete.setBounds(50, 60, 70, 70);
sete.setForeground(Color.white);
sete.setFont(new Font("Arial", Font.PLAIN, 36));*/

/*import javax.swing.*;
//import javafx.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
//import java.awt.event.*;
import java.lang.Double;
import javax.swing.text.AttributeSet.ColorAttribute;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame{
	private static JLabel directionsLibel1 = new JLabel("Operador 1: ");
	private static JLabel directionsLibel2 = new JLabel("Operador 2: ");
	private static JLabel outputLabel1 = new JLabel();
	//private static JLabel outputLabel2 = new JLabel();
	private static JTextField operadorBox1 = new JTextField(25);
	private static JTextField operadorBox2 = new JTextField(25);
	private static JButton nameButton = new JButton("AC");
	private static JButton maisButton = new JButton("+");
	private static JButton menosButton = new JButton("-");
	private static JButton multiplicacaoButton = new JButton("x");
	private static JButton divideButton = new JButton("/");
	private static JButton igualButton = new JButton("=");
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
		nameButton.setBounds(15, 50, 50, 50);
		nameButton.setForeground(Color.black);
		nameButton.setFont(new Font("Arial", Font.PLAIN, 20));

		maisButton.setLayout(null);
		maisButton.setBackground(Color.white);
		maisButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		maisButton.setBounds(65, 50, 50, 50);
		maisButton.setForeground(Color.black);
		maisButton.setFont(new Font("Arial", Font.PLAIN, 20));

		menosButton.setLayout(null);
		menosButton.setBackground(Color.white);
		menosButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		menosButton.setBounds(115,50, 50, 50);
		menosButton.setForeground(Color.black);
		menosButton.setFont(new Font("Arial", Font.PLAIN, 20));

		multiplicacaoButton.setLayout(null);
		multiplicacaoButton.setBackground(Color.white);
		multiplicacaoButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		multiplicacaoButton.setBounds(165, 50, 50, 50);
		multiplicacaoButton.setForeground(Color.black);
		multiplicacaoButton.setFont(new Font("Arial", Font.PLAIN, 20));

		divideButton.setLayout(null);
		divideButton.setBackground(Color.white);
		divideButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		divideButton.setBounds(215, 50, 50, 50);
		divideButton.setForeground(Color.black);
		divideButton.setFont(new Font("Arial", Font.PLAIN, 20));

		igualButton.setLayout(null);
		igualButton.setBackground(Color.white);
		igualButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		igualButton.setBounds(15, 200, 50, 50);
		igualButton.setForeground(Color.black);
		igualButton.setFont(new Font("Arial", Font.PLAIN, 20));



		zeroButton.setLayout(null);
		zeroButton.setBackground(Color.white);
		zeroButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		zeroButton.setBounds(15, 100, 50, 50);
		zeroButton.setForeground(Color.black);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 20));

		umButton.setLayout(null);
		umButton.setBackground(Color.white);
		umButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		umButton.setBounds(65, 100, 50, 50);
		umButton.setForeground(Color.black);
		umButton.setFont(new Font("Arial", Font.PLAIN, 20));

		doisButton.setLayout(null);
		doisButton.setBackground(Color.white);
		doisButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		doisButton.setBounds(115, 100, 50, 50);
		doisButton.setForeground(Color.black);
		doisButton.setFont(new Font("Arial", Font.PLAIN, 20));

		tresButton.setLayout(null);
		tresButton.setBackground(Color.white);
		tresButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		tresButton.setBounds(165, 100, 50, 50);
		tresButton.setForeground(Color.black);
		tresButton.setFont(new Font("Arial", Font.PLAIN, 20));

		quatroButton.setLayout(null);
		quatroButton.setBackground(Color.white);
		quatroButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		quatroButton.setBounds(215, 100, 50, 50);
		quatroButton.setForeground(Color.black);
		quatroButton.setFont(new Font("Arial", Font.PLAIN, 20));

		cincoButton.setLayout(null);
		cincoButton.setBackground(Color.white);
		cincoButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		cincoButton.setBounds(15, 150, 50, 50);
		cincoButton.setForeground(Color.black);
		cincoButton.setFont(new Font("Arial", Font.PLAIN, 20));

		seisButton.setLayout(null);
		seisButton.setBackground(Color.white);
		seisButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		seisButton.setBounds(65, 150, 50, 50);
		seisButton.setForeground(Color.black);
		seisButton.setFont(new Font("Arial", Font.PLAIN, 20));

		seteButton.setLayout(null);
		seteButton.setBackground(Color.white);
		seteButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		seteButton.setBounds(115, 150, 50, 50);
		seteButton.setForeground(Color.black);
		seteButton.setFont(new Font("Arial", Font.PLAIN, 20));

		oitoButton.setLayout(null);
		oitoButton.setBackground(Color.white);
		oitoButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		oitoButton.setBounds(165, 150, 50, 50);
		oitoButton.setForeground(Color.black);
		oitoButton.setFont(new Font("Arial", Font.PLAIN, 20));

		noveButton.setLayout(null);
		noveButton.setBackground(Color.white);
		noveButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		noveButton.setBounds(215, 150, 50, 50);
		noveButton.setForeground(Color.black);
		noveButton.setFont(new Font("Arial", Font.PLAIN, 20));

		App window = new App();
		window.setSize(300, 500);
		window.setVisible(true);
		window.setResizable(false);
		window.setTitle("Calculadora - LUAN");

		//window.setLayout(new FlowLayout());
		window.setLayout(null);

		window.getContentPane().add(directionsLibel1); // Adicionando discrição para caixa de texto
		operadorBox1.setLayout(null);
		//operadorBox1.setBackground(Color.black);
		operadorBox1.setForeground(Color.black);
		operadorBox1.setBounds(15, 15, 250, 30);
		window.getContentPane().add(operadorBox1); // Adicionando caixa de texto
		
		

		window.getContentPane().add(directionsLibel2); // Adicionando discrição para caixa de texto
		window.getContentPane().add(operadorBox2); // Adicionando caixa de texto

		// Botões das Operações 
		window.getContentPane().add(nameButton);
		window.getContentPane().add(maisButton);
		window.getContentPane().add(menosButton);
		window.getContentPane().add(multiplicacaoButton);
		window.getContentPane().add(divideButton);
		window.getContentPane().add(igualButton);
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
		

		/*window.getContentPane().add(outputLabel2);
		window.getContentPane().add(outputLabel1);*/

		
		/*nameButton.addActionListener(e -> buttonClink(e));
		maisButton.addActionListener(e -> buttonMais(e));
		menosButton.addActionListener(e -> buttonMenos(e));
		multiplicacaoButton.addActionListener(e -> buttonMultiplicacao(e));
		divideButton.addActionListener(e -> buttonDivide(e));*/
/*
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
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	/*
	public static void buttonMais(java.awt.event.ActionEvent e){
		Calculadora calc1 = new Calculadora();
		calc1.operador1 = Double.valueOf(operadorBox1.getText());
		calc1.operador2 = Double.valueOf(operadorBox2.getText());
		calc1.soma();
		String outputMessage = "\n Resposta " + Double.toString(calc1.resultado);
		outputLabel1.setText(outputMessage);
	}

	public static void buttonMenos(java.awt.event.ActionEvent e){
		Calculadora calc1 = new Calculadora();
		calc1.operador1 = Double.valueOf(operadorBox1.getText());
		calc1.operador2 = Double.valueOf(operadorBox2.getText());
		calc1.subtrair();
		String outputMessage = "\n Resposta " + Double.toString(calc1.resultado);
		outputLabel1.setText(outputMessage);
	}

	public static void buttonMultiplicacao(java.awt.event.ActionEvent e){
		Calculadora calc1 = new Calculadora();
		calc1.operador1 = Double.valueOf(operadorBox1.getText());
		calc1.operador2 = Double.valueOf(operadorBox2.getText());
		calc1.multiplicar();
		String outputMessage = "\n Resposta " + Double.toString(calc1.resultado);
		outputLabel1.setText(outputMessage);
	}

	public static void buttonDivide(java.awt.event.ActionEvent e){
		Calculadora calc1 = new Calculadora();
		calc1.operador1 = Double.valueOf(operadorBox1.getText());
		calc1.operador2 = Double.valueOf(operadorBox2.getText());
		calc1.dividir();
		String outputMessage = "\n Resposta " + Double.toString(calc1.resultado);
		outputLabel1.setText(outputMessage);
	}

	public static void buttonClink(java.awt.event.ActionEvent e){
		//JOptionPane.showMessageDialog(null, "Button Works", "HI!", JOptionPane.INFORMATION_MESSAGE);
		Calculadora calc1 = new Calculadora();
		calc1.operador1 = Double.valueOf(operadorBox1.getText());
		calc1.operador2 = Double.valueOf(operadorBox2.getText());
		String outputMessage = "\n Resposta " + calc1.operador1;
		outputLabel1.setText(outputMessage);
	}
	*/
	
