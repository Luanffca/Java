import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.Double;

public class App  extends JFrame{
    private static JButton mesa1 = new JButton("MESA 1");
	private static JButton mesa2 = new JButton("MESA 2");
	private static JButton mesa3 = new JButton("MESA 3");
	private static JButton mesa4 = new JButton("MESA 4");
	private static JButton mesa5 = new JButton("MESA 5");
    private static JButton mesa6 = new JButton("MESA 6");
    private static JTextField kgrefeicaoBox1 = new JTextField(20);
    private static JTextField sobremesaBox1 = new JTextField(20);
    private static JButton salva = new JButton("Salva");
    private static JButton historico = new JButton("Historico");
    private static JButton refri2litros = new JButton("Ref. 2L");
    private static JButton refri6ml = new JButton("Ref. 600mL");
    private static JButton refrilata = new JButton("Ref. Lata");
    private static JButton cervejaButton = new JButton("Cerveja");
    public static void main(String args[]) throws Exception{

        // Janela Grafica do Java
		App window = new App();
		window.setSize(350, 300);
		window.setVisible(true);
		window.setResizable(false);
		window.setTitle("Restarante - Luan");
		//window.setLayout(new FlowLayout());
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        // Caracteristicas dos Botões
        mesa1.setLayout(null);
        mesa1.setBackground(Color.white);
        mesa1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        mesa1.setBounds(15, 52, 100, 100);
        mesa1.setForeground(Color.black);
        mesa1.setFont(new Font("Arial", Font.PLAIN, 20));

        mesa2.setLayout(null);
        mesa2.setBackground(Color.white);
        mesa2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        mesa2.setBounds(120, 52, 100, 100);
        mesa2.setForeground(Color.black);
        mesa2.setFont(new Font("Arial", Font.PLAIN, 20));

        mesa3.setLayout(null);
        mesa3.setBackground(Color.white);
        mesa3.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        mesa3.setBounds(225, 52, 100, 100);
        mesa3.setForeground(Color.black);
        mesa3.setFont(new Font("Arial", Font.PLAIN, 20));

        mesa4.setLayout(null);
        mesa4.setBackground(Color.white);
        mesa4.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        mesa4.setBounds(15, 160, 100, 100);
        mesa4.setForeground(Color.black);
        mesa4.setFont(new Font("Arial", Font.PLAIN, 20));

        mesa5.setLayout(null);
        mesa5.setBackground(Color.white);
        mesa5.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        mesa5.setBounds(120, 160, 100, 100);
        mesa5.setForeground(Color.black);
        mesa5.setFont(new Font("Arial", Font.PLAIN, 20));

        mesa6.setLayout(null);
        mesa6.setBackground(Color.white);
        mesa6.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        mesa6.setBounds(225, 160, 100, 100);
        mesa6.setForeground(Color.black);
        mesa6.setFont(new Font("Arial", Font.PLAIN, 20));

        // Adicionando os Botões 
        window.getContentPane().add(mesa1);
        window.getContentPane().add(mesa2);
        window.getContentPane().add(mesa3);
        window.getContentPane().add(mesa4);
        window.getContentPane().add(mesa5);
        window.getContentPane().add(mesa6);

        mesa1.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				App interface_mesa1 = new App();
                Restaurante rest1 = new Restaurante();
                kgrefeicaoBox1.setLayout(null);
                //operadorBox1.setBackground(Color.black); // Cor da caixa de texta
                kgrefeicaoBox1.setForeground(Color.black); // Cor das Letras
                kgrefeicaoBox1.setBounds(120, 15, 200, 30); // Local onde coloca a caixa de texto com lagura e altura
                kgrefeicaoBox1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black)); // Adicinando a Borda da Caixa de Texto
                kgrefeicaoBox1.setFont(new Font("Arial", Font.PLAIN, 15));

                sobremesaBox1.setLayout(null);
                sobremesaBox1.setForeground(Color.black); 
                sobremesaBox1.setBounds(120, 50, 200, 30); 
                sobremesaBox1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                sobremesaBox1.setFont(new Font("Arial", Font.PLAIN, 15));

                refri2litros.setLayout(null);
                refri2litros.setBackground(Color.white);
                refri2litros.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                refri2litros.setBounds(225, 100, 100, 50);
                refri2litros.setForeground(Color.black);
                refri2litros.setFont(new Font("Arial", Font.PLAIN, 20));

                refri6ml.setLayout(null);
                refri6ml.setBackground(Color.white);
                refri6ml.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                refri6ml.setBounds(15, 160, 100, 50);
                refri6ml.setForeground(Color.black);
                refri6ml.setFont(new Font("Arial", Font.PLAIN, 20));

                refrilata.setLayout(null);
                refrilata.setBackground(Color.white);
                refrilata.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                refrilata.setBounds(120, 160, 100, 50);
                refrilata.setForeground(Color.black);
                refrilata.setFont(new Font("Arial", Font.PLAIN, 20));

                cervejaButton.setLayout(null);
                cervejaButton.setBackground(Color.white);
                cervejaButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                cervejaButton.setBounds(225, 160, 100, 50);
                cervejaButton.setForeground(Color.black);
                cervejaButton.setFont(new Font("Arial", Font.PLAIN, 20));

                salva.setLayout(null);
                salva.setBackground(Color.white);
                salva.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                salva.setBounds(15, 100, 200, 50);
                salva.setForeground(Color.black);
                salva.setFont(new Font("Arial", Font.PLAIN, 20));

                historico.setLayout(null);
                historico.setBackground(Color.white);
                historico.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                historico.setBounds(15, 220, 300, 50);
                historico.setForeground(Color.black);
                historico.setFont(new Font("Arial", Font.PLAIN, 20));

                // Interface
		        interface_mesa1.setSize(350, 300);
                interface_mesa1.setVisible(true);
                interface_mesa1.setResizable(false);
                interface_mesa1.setTitle("Restarante - Mesa 1");
                interface_mesa1.setLayout(null);
                //interface_mesa1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Adicionando na Interface
                interface_mesa1.getContentPane().add(kgrefeicaoBox1);
                interface_mesa1.getContentPane().add(sobremesaBox1);
                interface_mesa1.getContentPane().add(refri2litros);
                interface_mesa1.getContentPane().add(refri6ml);	
                interface_mesa1.getContentPane().add(refrilata);
                interface_mesa1.getContentPane().add(cervejaButton);
                interface_mesa1.getContentPane().add(historico);
                interface_mesa1.getContentPane().add(salva);

                salva.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rest1.kgrefeicao[0] += Double.valueOf(kgrefeicaoBox1.getText());
                        rest1.sobremesa[0] = sobremesaBox1.getText();
                        kgrefeicaoBox1.setText("");
                    }
                });
                
                refri2litros.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rest1.refrigdoisl[0] += 1;
                    }
                });

                refri6ml.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rest1.refrigseis[0] += 1;
                    }
                });
                
                refrilata.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rest1.refriglata[0] += 1;
                    }
                });

                cervejaButton.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rest1.cerveja[0] += 1;
                    }
                });

                historico.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String menu;
                        menu = "Kg Refeição: " + rest1.kgrefeicao[0];
                        menu += "\nSobremesa: " + rest1.sobremesa[0];
                        menu += "\nQuantos Ref.2L: " + rest1.refrigdoisl[0];
                        menu += "\nQuantos Ref.600mL: " + rest1.refrigseis[0];
                        menu += "\nQuantos Ref.Lata: " + rest1.refriglata[0];
                        menu += "\nQuantas Cervejas: " + rest1.cerveja[0];
                        JOptionPane.showInputDialog(menu);
                    }
                });

            }
		});

        mesa2.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(ActionEvent e){
				App interface_mesa2 = new App();
                Restaurante rest2 = new Restaurante();
                kgrefeicaoBox1.setLayout(null);
                //operadorBox1.setBackground(Color.black); // Cor da caixa de texta
                kgrefeicaoBox1.setForeground(Color.black); // Cor das Letras
                kgrefeicaoBox1.setBounds(120, 15, 200, 30); // Local onde coloca a caixa de texto com lagura e altura
                kgrefeicaoBox1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black)); // Adicinando a Borda da Caixa de Texto
                kgrefeicaoBox1.setFont(new Font("Arial", Font.PLAIN, 15));

                sobremesaBox1.setLayout(null);
                sobremesaBox1.setForeground(Color.black); 
                sobremesaBox1.setBounds(120, 50, 200, 30); 
                sobremesaBox1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                sobremesaBox1.setFont(new Font("Arial", Font.PLAIN, 15));

                refri2litros.setLayout(null);
                refri2litros.setBackground(Color.white);
                refri2litros.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                refri2litros.setBounds(225, 100, 100, 50);
                refri2litros.setForeground(Color.black);
                refri2litros.setFont(new Font("Arial", Font.PLAIN, 20));

                refri6ml.setLayout(null);
                refri6ml.setBackground(Color.white);
                refri6ml.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                refri6ml.setBounds(15, 160, 100, 50);
                refri6ml.setForeground(Color.black);
                refri6ml.setFont(new Font("Arial", Font.PLAIN, 20));

                refrilata.setLayout(null);
                refrilata.setBackground(Color.white);
                refrilata.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                refrilata.setBounds(120, 160, 100, 50);
                refrilata.setForeground(Color.black);
                refrilata.setFont(new Font("Arial", Font.PLAIN, 20));

                cervejaButton.setLayout(null);
                cervejaButton.setBackground(Color.white);
                cervejaButton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                cervejaButton.setBounds(225, 160, 100, 50);
                cervejaButton.setForeground(Color.black);
                cervejaButton.setFont(new Font("Arial", Font.PLAIN, 20));

                salva.setLayout(null);
                salva.setBackground(Color.white);
                salva.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                salva.setBounds(15, 100, 200, 50);
                salva.setForeground(Color.black);
                salva.setFont(new Font("Arial", Font.PLAIN, 20));

                historico.setLayout(null);
                historico.setBackground(Color.white);
                historico.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
                historico.setBounds(15, 220, 300, 50);
                historico.setForeground(Color.black);
                historico.setFont(new Font("Arial", Font.PLAIN, 20));

                // Interface
		        interface_mesa2.setSize(350, 300);
                interface_mesa2.setVisible(true);
                interface_mesa2.setResizable(false);
                interface_mesa2.setTitle("Restarante - Mesa 2");
                interface_mesa2.setLayout(null);
                //interface_mesa2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Adicionando na Interface
                interface_mesa2.getContentPane().add(kgrefeicaoBox1);
                interface_mesa2.getContentPane().add(sobremesaBox1);
                interface_mesa2.getContentPane().add(refri2litros);
                interface_mesa2.getContentPane().add(refri6ml);	
                interface_mesa2.getContentPane().add(refrilata);
                interface_mesa2.getContentPane().add(cervejaButton);
                interface_mesa2.getContentPane().add(historico);
                interface_mesa2.getContentPane().add(salva);

                salva.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rest2.kgrefeicao[1] += Double.valueOf(kgrefeicaoBox1.getText());
                        rest2.sobremesa[1] = sobremesaBox1.getText();
                        kgrefeicaoBox1.setText("");
                    }
                });
                
                refri2litros.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rest2.refrigdoisl[1] += 1;
                    }
                });

                refri6ml.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rest2.refrigseis[1] += 1;
                    }
                });
                
                refrilata.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rest2.refriglata[1] += 1;
                    }
                });

                cervejaButton.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rest2.cerveja[1] += 1;
                    }
                });

                historico.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String menu;
                        menu = "Kg Refeição: " + rest2.kgrefeicao[1];
                        menu += "\nSobremesa: " + rest2.sobremesa[1];
                        menu += "\nQuantos Ref.2L: " + rest2.refrigdoisl[1];
                        menu += "\nQuantos Ref.600mL: " + rest2.refrigseis[1];
                        menu += "\nQuantos Ref.Lata: " + rest2.refriglata[1];
                        menu += "\nQuantas Cervejas: " + rest2.cerveja[1];
                        JOptionPane.showInputDialog(menu);
                    }
                });

            }
		});
    }
    
}