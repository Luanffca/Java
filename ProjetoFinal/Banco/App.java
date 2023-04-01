import javax.swing.*;
import javax.swing.border.Border;

import org.w3c.dom.css.RGBColor;

import java.awt.*;

import java.awt.event.ActionEvent;

public class App {
    public static void main(String[] args) {
        Color corVerde = new Color(10,160,145);
        Color corAzul = new Color(30,144,255);
        Color corCinza = new Color(250, 250, 250);
        JFrame janela = new JFrame();
        janela.setTitle("CoinBag");
        janela.setSize(520, 720);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setLayout(null);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);

        JLabel logoE = new JLabel();
        logoE.setBounds(0, 0, 520, 110);
        logoE.setBackground(corAzul);
        logoE.setOpaque(true);

        JLabel logoC = new JLabel();
        logoC.setBounds(0, 0, 520, 110);
        logoC.setBackground(corVerde);
        logoC.setOpaque(true);

        JLabel login = new JLabel("Entrar");
        login.setBounds(0, 110, 300, 40);
        login.setHorizontalAlignment(SwingConstants.CENTER);
        login.setFont(new Font("Arial", Font.PLAIN, 30));
        login.setForeground(corAzul);

        JButton botaoLogin = new JButton("Entrar");
        botaoLogin.setBounds(0, 110, 210, 40);
        botaoLogin.setHorizontalAlignment(SwingConstants.CENTER);
        botaoLogin.setFont(new Font("Arial", Font.PLAIN, 25));
        botaoLogin.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, corAzul));
        botaoLogin.setBackground(corVerde);
        botaoLogin.setForeground(Color.white);

        JButton botaoRegister = new JButton("Cadastrar");
        botaoRegister.setBounds(300, 110, 210, 40);
        botaoRegister.setFont(new Font("Arial", Font.PLAIN, 25));
        botaoRegister.setBackground(corAzul);
        botaoRegister.setForeground(Color.white);
        botaoRegister.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, corVerde));
        //register.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);          
        botaoRegister.setHorizontalAlignment(SwingConstants.CENTER);                
        //register.setHorizontalTextPosition(SwingConstants.LEFT);

        JLabel register = new JLabel("Cadastrar");
        register.setBounds(210, 110, 300, 40);
        register.setFont(new Font("Arial", Font.PLAIN, 30));
        register.setForeground(corVerde);         
        register.setHorizontalAlignment(SwingConstants.CENTER);  

        JButton borderRegister = new JButton();
        borderRegister.setBackground(corAzul);
        borderRegister.setBounds(480, 140, 30, 680);
        borderRegister.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black));

        JButton borderLogin = new JButton();
        borderLogin.setBackground(corVerde);
        borderLogin.setBounds(0, 140, 30, 680);
        borderLogin.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black));

        JLabel user = new JLabel("Usuário");
        user.setBounds(100, 200, 300, 30);
        user.setFont(new Font("Arial", Font.PLAIN, 20));
        user.setForeground(corAzul);

        JLabel password = new JLabel("Senha");
        password.setBounds(100, 270, 300, 30);
        password.setFont(new Font("Arial", Font.PLAIN, 20));
        password.setForeground(corAzul);

        JTextField usuario = new JTextField();
        usuario.setBounds(100, 230, 300, 30);
        usuario.setBorder(BorderFactory.createMatteBorder(1, 2, 2, 1, corAzul));

        JTextField senha = new JTextField();
        senha.setBounds(100, 300, 300, 30);
        senha.setBorder(BorderFactory.createMatteBorder(1, 2, 2, 1, corAzul));

        JButton recuperar = new JButton("Esqueci a senha");
        recuperar.setBackground(Color.white);
        recuperar.setForeground(corAzul);
        recuperar.setBounds(100, 340, 300, 20);
        recuperar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black));

        JButton logar = new JButton("Entrar");
        logar.setBackground(corAzul);
        logar.setForeground(Color.white);
        logar.setBounds(100, 370, 300, 40);
        logar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black));
        logar.setFont(new Font("Arial", Font.PLAIN, 30));

        JButton registrar = new JButton("Cadastrar");
        registrar.setBackground(corVerde);
        registrar.setForeground(Color.white);
        registrar.setBounds(100, 610, 300, 40);
        registrar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black));
        registrar.setFont(new Font("Arial", Font.PLAIN, 30));

        JLabel name = new JLabel("Nome Completo");
        name.setBounds(100, 180, 300, 30);
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setForeground(corVerde);
        JLabel erroNome = new JLabel("*Nome invalido*");
        erroNome.setBounds(250, 180, 300, 30);
        erroNome.setFont(new Font("Arial", Font.PLAIN, 15));
        erroNome.setForeground(Color.red);
        erroNome.setVisible(false);

        JLabel address = new JLabel("Endereço");
        address.setBounds(100, 250, 300, 30);
        address.setFont(new Font("Arial", Font.PLAIN, 20));
        address.setForeground(corVerde);
        JLabel erroEndereco = new JLabel("*Endereço invalido*");
        erroEndereco.setBounds(250, 250, 300, 30);
        erroEndereco.setFont(new Font("Arial", Font.PLAIN, 15));
        erroEndereco.setForeground(Color.red);
        erroEndereco.setVisible(false);

        JLabel CPF = new JLabel("CPF");
        CPF.setBounds(100, 320, 300, 30);
        CPF.setFont(new Font("Arial", Font.PLAIN, 20));
        CPF.setForeground(corVerde);
        JLabel erroCPF = new JLabel("*CPF invalido*");
        erroCPF.setBounds(250, 320, 300, 30);
        erroCPF.setFont(new Font("Arial", Font.PLAIN, 15));
        erroCPF.setForeground(Color.red);
        erroCPF.setVisible(false);

        JLabel RG = new JLabel("RG");
        RG.setBounds(100, 390, 300, 30);
        RG.setFont(new Font("Arial", Font.PLAIN, 20));
        RG.setForeground(corVerde);
        JLabel erroRG = new JLabel("*RG invalido*");
        erroRG.setBounds(250, 390, 300, 30);
        erroRG.setFont(new Font("Arial", Font.PLAIN, 15));
        erroRG.setForeground(Color.red);
        erroRG.setVisible(false);

        JLabel Email = new JLabel("Email");
        Email.setBounds(100, 460, 300, 30);
        Email.setFont(new Font("Arial", Font.PLAIN, 20));
        Email.setForeground(corVerde);
        JLabel erroEmail = new JLabel("*Email invalido*");
        erroEmail.setBounds(250, 460, 300, 30);
        erroEmail.setFont(new Font("Arial", Font.PLAIN, 15));
        erroEmail.setForeground(Color.red);
        erroEmail.setVisible(false);

        JLabel setpassword = new JLabel("Senha");
        setpassword.setBounds(100, 530, 300, 30);
        setpassword.setFont(new Font("Arial", Font.PLAIN, 20));
        setpassword.setForeground(corVerde);
        JLabel erroSenha = new JLabel("*Senha invalida*");
        erroSenha.setBounds(250, 530, 300, 30);
        erroSenha.setFont(new Font("Arial", Font.PLAIN, 15));
        erroSenha.setForeground(Color.red);
        erroSenha.setVisible(false);

        JTextField getNome = new JTextField();
        getNome.setBounds(100, 210, 300, 30);
        getNome.setBorder(BorderFactory.createMatteBorder(1, 2, 2, 1, corVerde));
        JTextField getEndereco = new JTextField();
        getEndereco.setBounds(100, 280, 300, 30);
        getEndereco.setBorder(BorderFactory.createMatteBorder(1, 2, 2, 1, corVerde));
        JTextField getCPF = new JTextField();
        getCPF.setBounds(100, 350, 300, 30);
        getCPF.setBorder(BorderFactory.createMatteBorder(1, 2, 2, 1, corVerde));
        JTextField getRG = new JTextField();
        getRG.setBounds(100, 420, 300, 30);
        getRG.setBorder(BorderFactory.createMatteBorder(1, 2, 2, 1, corVerde));
        JTextField getEmail = new JTextField();
        getEmail.setBounds(100, 490, 300, 30);
        getEmail.setBorder(BorderFactory.createMatteBorder(1, 2, 2, 1, corVerde));
        JTextField getSenha = new JTextField();
        getSenha.setBounds(100, 560, 300, 30);
        getSenha.setBorder(BorderFactory.createMatteBorder(1, 2, 2, 1, corVerde));

        JButton voltar = new JButton("<");
        voltar.setFont(new Font("Arial", Font.PLAIN, 30));
        voltar.setBackground(corVerde);
        voltar.setForeground(Color.white);
        voltar.setBounds(0, 0, 50, 50);
        voltar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, Color.white));

        JLabel tituloConta = new JLabel(" Selecione o  tipo de conta");
        tituloConta.setBounds(50, 0, 470, 50);
        tituloConta.setFont(new Font("Arial", Font.PLAIN, 20));
        tituloConta.setForeground(Color.white);
        tituloConta.setBackground(corVerde);
        tituloConta.setOpaque(true);

        JRadioButton tituloCorrente = new JRadioButton("Conta Corrente");
        tituloCorrente.setBounds(50, 180, 400, 30);
        tituloCorrente.setFont(new Font("Arial", Font.PLAIN, 20));
        tituloCorrente.setBackground(corVerde);
        tituloCorrente.setForeground(Color.white);
        JTextArea descrCorrente = new JTextArea("Movimente seu dinheiro da forma como desejar, com direito a um cheque especial para utilizar quando quiser");
        descrCorrente.setBounds(50, 210, 400, 100);
        descrCorrente.setFont(new Font("Arial", Font.PLAIN, 20));
        descrCorrente.setMargin(new java.awt.Insets(5, 5, 5, 5));
        descrCorrente.setForeground(corVerde);
        descrCorrente.setBackground(corCinza);
        descrCorrente.setEditable(false);
        descrCorrente.setLineWrap(true);
        JRadioButton tituloPoupanca = new JRadioButton("Conta Poupança");
        tituloPoupanca.setBounds(50, 310, 400, 30);
        tituloPoupanca.setFont(new Font("Arial", Font.PLAIN, 20));
        tituloPoupanca.setForeground(Color.white);
        tituloPoupanca.setBackground(corVerde);
        JTextArea descrPoupanca = new JTextArea("Ideal para quem deseja guardar dinheiro, com rendimento de 6,17% ao ano");
        descrPoupanca.setBounds(50, 340, 400, 100);
        descrPoupanca.setMargin(new java.awt.Insets(5, 5, 5, 5));descrPoupanca.setFont(new Font("Arial", Font.PLAIN, 20));
        descrPoupanca.setForeground(corVerde);
        descrPoupanca.setBackground(corCinza);
        descrPoupanca.setEditable(false);
        descrPoupanca.setLineWrap(true);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(tituloPoupanca);
        grupo.add(tituloCorrente);

        JButton finalizar = new JButton("Finalizar");
        finalizar.setBackground(corVerde);
        finalizar.setForeground(Color.white);
        finalizar.setBounds(100, 500, 300, 40);
        finalizar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black));
        finalizar.setFont(new Font("Arial", Font.PLAIN, 30));

        JPanel Entrar = new JPanel();
        Entrar.setBackground(Color.white);
        Entrar.setLayout(null);
        Entrar.setSize(janela.getSize());
        Entrar.setVisible(true);
        Entrar.add(login);
        Entrar.add(botaoRegister);
        Entrar.add(usuario);
        Entrar.add(user);
        Entrar.add(senha);
        Entrar.add(password);
        Entrar.add(borderRegister);
        Entrar.add(logoE);
        Entrar.add(recuperar);
        Entrar.add(logar);

        JPanel Cadastrar = new JPanel();
        Cadastrar.setBackground(Color.white);
        Cadastrar.setLayout(null);
        Cadastrar.setSize(janela.getSize());
        Cadastrar.setVisible(false);
        Cadastrar.add(logoC);
        Cadastrar.add(register);
        Cadastrar.add(botaoLogin);
        Cadastrar.add(borderLogin);
        Cadastrar.add(name);
        Cadastrar.add(getNome);
        Cadastrar.add(address);
        Cadastrar.add(getEndereco);
        Cadastrar.add(CPF);
        Cadastrar.add(getCPF);
        Cadastrar.add(getRG);
        Cadastrar.add(RG);
        Cadastrar.add(getEmail);
        Cadastrar.add(Email);
        Cadastrar.add(getSenha);
        Cadastrar.add(setpassword);
        Cadastrar.add(registrar);
        Cadastrar.add(erroNome);
        Cadastrar.add(erroCPF);
        Cadastrar.add(erroEmail);
        Cadastrar.add(erroEndereco);
        Cadastrar.add(erroRG);
        Cadastrar.add(erroSenha);

        JPanel tpConta = new JPanel();
        tpConta.setBackground(Color.white);
        tpConta.setLayout(null);
        tpConta.setSize(janela.getSize());
        tpConta.setVisible(false);
        tpConta.add(voltar);
        tpConta.add(tituloCorrente);
        tpConta.add(tituloConta);
        tpConta.add(descrCorrente);
        tpConta.add(tituloPoupanca);
        tpConta.add(descrPoupanca);
        tpConta.add(finalizar);

        JPanel Inicio = new JPanel();
        Inicio.setBackground(Color.white);
        Inicio.setLayout(null);
        Inicio.setSize(janela.getSize());
        Inicio.setVisible(false);

        botaoRegister.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                Entrar.setVisible(false);
                Cadastrar.setVisible(true);
            }
        });
        borderRegister.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                Entrar.setVisible(false);
                Cadastrar.setVisible(true);
            }
        });

        botaoLogin.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                Cadastrar.setVisible(false);
                Entrar.setVisible(true);
            }
        });
        borderLogin.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                Cadastrar.setVisible(false);
                Entrar.setVisible(true);
            }
        });

        registrar.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(getNome.getText().isEmpty()){
                    erroNome.setVisible(true);
                }else erroNome.setVisible(false);
                if(getEndereco.getText().isEmpty()){
                    erroEndereco.setVisible(true);
                }else erroEndereco.setVisible(false);
                if(getRG.getText().isEmpty()){
                    erroRG.setVisible(true);
                }else erroRG.setVisible(false);
                if(getCPF.getText().isEmpty()){
                    erroCPF.setVisible(true);
                }else erroCPF.setVisible(false);
                if(getEmail.getText().isEmpty()){
                    erroEmail.setVisible(true);
                }else erroEmail.setVisible(false);
                if(getSenha.getText().isEmpty()){
                    erroSenha.setVisible(true);
                }else erroSenha.setVisible(false);
                if(getNome.getText().isEmpty() || getEndereco.getText().isEmpty() || getRG.getText().isEmpty() || getCPF.getText().isEmpty() || getEmail.getText().isEmpty() || getSenha.getText().isEmpty()){
                }else{
                    Cadastrar.setVisible(false);
                    tpConta.setVisible(true);
                }
                
                
                

            }
        });
        voltar.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                tpConta.setVisible(false);
                Cadastrar.setVisible(true);
            }
        });

        finalizar.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tituloCorrente.isSelected() || tituloPoupanca.isSelected()){
                    Cliente cl = new Cliente(getNome.getText(), getRG.getText(), getCPF.getText(), getEndereco.getText(), getEmail.getText(), getSenha.getText());
                    System.out.println(cl.toString());
                    if(tituloCorrente.isSelected()){
                        Corrente cc = cl.criaCc();
                    }else{
                        Poupanca cp = cl.criaCp();
                    } 

                    tpConta.setVisible(false);
                    Inicio.setVisible(true);
                }else System.out.println("Selecione");
            }
        });




        Container Pane = janela.getContentPane();
        Pane.add(Entrar);
        Pane.add(Cadastrar);
        Pane.add(tpConta);
        Pane.add(Inicio);
    }

    
}