
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	//private static Scanner  sol;
	public static void main(String[] args)throws InterruptedException  {
		dadosConta();
	}
	
	private static void dadosConta() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Conta conta = null;
		List<Conta> listaConta = new ArrayList<Conta>();
		int opcao = 0;
		
		do {
		      System.out.println("## Escolha uma das opções abaixo. ##");
		      System.out.println("________________________________________"); 
		          System.out.println("Opção 0 - Sair da conta");
		          System.out.println("Opção 1 - Consulta sua conta.");
		          System.out.println("Opção 2 - Historico da sua conta");
		          System.out.println("_________________________________________"); 
		          
		          System.out.println("Digite aqui sua opção: ");
		          opcao = sc.nextInt();
		          
		          if(opcao == 1){
		              //Cria um novo objeto 
		                      conta = new Conta();
		                  System.out.println("Digite sua agencia: ");
		                  conta.setAgencia(sc.nextLine());
		                  sc.nextLine();
		                  System.out.println("Digite o numero: ");
		                  conta.setNumero(sc.nextLine());
		                  System.out.println("Digite o valor a ser depositado: ");
		                  conta.depositar(sc.nextFloat());
		                  System.out.println("Digite o valor a ser sacado: ");
		                  conta.sacar(sc.nextFloat());
		                  System.out.println();
		                   
		              //Guarda o objeto pessoa em uma lista.
		                  listaConta.add(conta);
		                  }else if(opcao == 2){
		                    if(listaConta.isEmpty()==false){
		                    	System.out.println("Historico:");
		                    	conta.verExtrato();
			                    sc.nextLine();
		                    }else{
			                    System.out.println(listaConta.toString());  
			                    System.out.println("Pressione um tecla para continuar.");
			                    sc.nextLine();
		                     
		                    }         }
		            } while (opcao != 0);
		            sc.close();
		
		
	}
}

/*	int i;
sol = new Scanner(System.in);
Conta c = new Conta();
c.agencia = "056";
c.numero = "546";
i = sol.nextInt();
c.clienteConta();

while (i != 0) {
	if(i == 1) {
		System.out.printlnln("Digite o valor de deposito: ");
		float valor = sol.nextInt();
		c.depositar(valor);
	}else
		if (i == 2 ) {
			System.out.printlnln("Digite o valor que deseja sacar");
			float sacar = sol.nextInt();
			c.sacar(sacar);
			
		}
	i = sol.nextInt();
	c.verExtrato();
}*/
