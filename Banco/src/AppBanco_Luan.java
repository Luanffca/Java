import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class AppBanco_Luan {
    public static void main(String[] args)throws InterruptedException {
		dadosConta(); 
	}

	private static void dadosConta() {
		// Tentativa do Scanner 
		Scanner sc = new Scanner(System.in);
		List<Banco_Luan> listaConta = new ArrayList<Banco_Luan>();
		int opcao = 0;
		int op = 0;
		do {
		Banco_Luan c1 = new Banco_Luan( );
		System.out.println("------ Bem Vindo ao Banco POO ------");
		System.out.println("------ Informe sua opção      ------");
		System.out.println("------ 0 - Sai do menu        ------");
		System.out.println("------ 1 - Abrir Conta        ------");
		opcao = sc.nextInt();
        if(opcao == 1){
            
            System.out.println(" Informe sua Agencia: " );
            c1.setAgencia(sc.nextInt());
            System.out.println(" Informe o número da conta: ");
			c1.setNumCanto(sc.nextInt());
            System.out.println(" Informe seu nome: ");
			c1.setDono (sc.next());
            System.out.println(" Informe sua senha: ");
			c1.setSenha(sc.nextInt());
            System.out.println(" Informe o tipo da conta.\n CP - Conta Poupança \n CC - Conta Corrente");
			c1.abrirConta (sc.next());
            listaConta.add(c1);
            do{
                System.out.println("------ 1 - Depositar          ------");
                System.out.println("------ 2 - Sacar              ------");
                System.out.println("------ 3 - Transferir         ------");
                System.out.println("------ 4 - Pagar Conta        ------");
                System.out.println("------ 5 - Ver Saldo          ------");
                System.out.println("------ 6 - Suas Informações   ------");
                System.out.println("------ 7 - Fechar Conta       ------");
				System.out.println("------ 8 - Sair da Consulta   ------");
                System.out.print(" Informe sua opção: ");
                op = sc.nextInt();
                switch(op){
                    case 1:
                        System.out.println("------ 1 - Depositar          ------");
                        //c1.senhaValida();
                        System.out.print("Informe o valor a ser depositado: ");
                        float valor = sc.nextFloat();
                        System.out.print("Informe a senha: ");
                        int senha = sc.nextInt();
                        c1.depositar (senha,valor);
                        break;
                    case 2:
                        System.out.println("------ 2 - Sacar              ------");
						System.out.print("Informe o valor a ser sacado: ");
                        valor = sc.nextFloat();
                        System.out.print("Informe a senha: ");
                        senha = sc.nextInt();
                        c1.sacar (senha, valor);
                        break;
                    case 3:
                        System.out.println("------ 3 - Transferir         ------");
                        break;
                    case 4:
						System.out.println("------ 4 - Pagar Conta        ------");
						System.out.print("Informe o valor da conta: ");
                        valor = sc.nextFloat();
                        System.out.print("Informe a senha: ");
                        senha = sc.nextInt();
						c1. pagarConta(senha, valor);
                        break;
                    case 5:
                        System.out.println("------ 5 - Ver Saldo          ------");
                        c1.saldoVer();
                        break;
                    case 6:
                        System.out.println("------ 6 - Suas Informações   ------");
                        c1.imprime();
                        break;
					case 7:
						System.out.println("------ 7 - Fechar Conta       ------");
						c1.fecharConta();
						break;
                    case 8:
                        System.out.println("------ 7 - Sair da Consulta   ------");
						System.out.println("Saindo da Conta...");
                        break;
                }
            }while(op != 7 );
			
        }
        else if( opcao == 0){
            System.out.println("Volte sempre ao Banco POO!");
        }
        else{
            System.out.println("Opção Invalida");
        }
		
            //listaConta.add(c1);
		}while (opcao != 0);
		
		sc.close();
	}
	
}

/*
 do {
		Banco c1 = new Banco( );
		System.out.println("------ Bem Vindo ao Banco POO ------");
		System.out.println("------ Informe sua opção      ------");
		System.out.println("------ 10 - Sai do menu        ------");
		System.out.println("------ 1 - Abrir Conta        ------");
		System.out.println("------ 2 - Depositar          ------");
		System.out.println("------ 3 - Sacar              ------");
		System.out.println("------ 4 - Transferir         ------");
		System.out.println("------ 5 - Historico          ------");
		System.out.println("------ 6 - Estado Atual       ------");
		System.out.println("------ 7 - Suas Informações   ------");
		System.out.println("------ 8 - Fechar Conta       ------");
		opcao = sc.nextInt();
		switch(opcao){
			case 1:
				System.out.println("------ 1 - Abrir Conta        ------");
				c1.setAgencia(sc.nextInt());
				c1.setNumCanto(sc.nextInt());
				c1.setDono (sc.next());
				c1.abrirConta (sc.next());
				listaConta.add(c1);
				break;
			case 2:
				System.out.println("------ 2 - Depositar          ------");
				c1.depositar (sc.nextFloat());
				break;
			case 3:
				System.out.println("------ 3 - Sacar              ------");
				c1.sacar (sc.nextFloat());
				break;
			case 4:
				System.out.println("------ 4 - Transferir         ------");
				break;
			case 5:
				System.out.println("------ 5 - Historico          ------");
				break;
			case 6:
				System.out.println("------ 6 - Estado Atual       ------");
				c1.estadoAtual();
				break;
			case 7:
				System.out.println("------ 7 - Suas Informações   ------");
				c1.imprime();
				break;
			case 8:
				System.out.println("------ 8 - Fechar Conta       ------");
				break;
			case 10:
				System.out.println("------ Volte sempre ao Banco POO ------");
				break;
				
			}
		}while (opcao != 0);
 */
