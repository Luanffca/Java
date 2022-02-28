import javax.swing.*;
//import javafx.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import java.lang.Double;

public class AppCalculadora extends JFrame{
	private static JLabel directionsLibel1 = new JLabel("Operador 1: ");
	private static JLabel directionsLibel2 = new JLabel("Operador 2: ");
	private static JLabel outputLabel1 = new JLabel();
	private static JLabel outputLabel2 = new JLabel();
	private static JTextField operadorBox1 = new JTextField(25);
	private static JTextField operadorBox2 = new JTextField(25);
	private static JButton nameButton = new JButton("AC");
	private static JButton maisButton = new JButton("+");
	private static JButton menosButton = new JButton("-");
	private static JButton multiplicacaoButton = new JButton("x");
	private static JButton divideButton = new JButton("/");
	public static void main(String args[]) throws Exception{

		App window = new App();
		window.setSize(300, 500);
		window.setVisible(true);
		window.setTitle("Calculadora - LUAN");

		window.setLayout(new FlowLayout());
		
		window.getContentPane().add(directionsLibel1);
		window.getContentPane().add(operadorBox1);
		window.getContentPane().add(outputLabel2);
		window.getContentPane().add(directionsLibel2);
		window.getContentPane().add(operadorBox2);
		window.getContentPane().add(nameButton);
		window.getContentPane().add(maisButton);
		window.getContentPane().add(menosButton);
		window.getContentPane().add(multiplicacaoButton);
		window.getContentPane().add(divideButton);
		window.getContentPane().add(outputLabel1);
		
		
		
		// add an action listener
		nameButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				operadorBox1.setText("");
                operadorBox2.setText("");
			}
		});

		//nameButton.addActionListener(e -> buttonClink(e));
		maisButton.addActionListener(e -> buttonMais(e));
		menosButton.addActionListener(e -> buttonMenos(e));
		multiplicacaoButton.addActionListener(e -> buttonMultiplicacao(e));
		divideButton.addActionListener(e -> buttonDivide(e));

		//window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// fim do main

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

	/*public static void buttonClink(java.awt.event.ActionEvent e){
		// put code in here to respond to the button
		//JOptionPane.showMessageDialog(null, "Button Works", "HI!", JOptionPane.INFORMATION_MESSAGE);
		Calculadora calc1 = new Calculadora();
		calc1.operador1 = Double.valueOf(operadorBox1.getText());
		calc1.operador2 = Double.valueOf(operadorBox2.getText());
		String outputMessage = "\n Resposta " + calc1.operador1;
		outputLabel1.setText(outputMessage);
	}*/
}