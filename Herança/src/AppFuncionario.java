import java.util.Scanner;

public class AppFuncionario {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String primeiro_nome, segundo_nome;
        double salario, vendas, comissao;
        int op;
        do{
            System.out.println("\n 1- Cadastra Funcionario \n 2 - Cadastra Funcionario Comissionado\n 0 - Saí da Operação");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Você escolheu 1");
                    System.out.print("Informe o Primero Nome: ");
                    primeiro_nome = sc.next();
                    System.out.print("Informe o Segundo Nome: ");
                    segundo_nome = sc.next();
                    System.out.print("Informe o Salario: ");
                    salario = sc.nextDouble();
                    Funcionario funcionario1 = new Funcionario(primeiro_nome, segundo_nome, salario);
                    System.out.println("Primeiro nome " + funcionario1.getPrimeiro_nome() + "\nSegundo nome " + funcionario1.getSegundo_nome() + "\nSalario R$" + funcionario1.getSalario());
                  
                  break;
                case 2:
                    System.out.println("Você escolheu 2");
                    System.out.print("Informe o Primero Nome: ");
                    primeiro_nome = sc.next();
                    System.out.print("Informe o Segundo Nome: ");
                    segundo_nome = sc.next();
                    System.out.print("Informe o Salario: ");
                    salario = sc.nextDouble();
                    System.out.print("Informe quantas Vendas: ");
                    vendas = sc.nextDouble();
                    System.out.print("Informe a Comisão: ");
                    comissao = sc.nextDouble();
                    FuncionarioComissionado funcionario2 = new FuncionarioComissionado(primeiro_nome, segundo_nome, salario, vendas, comissao);
                    funcionario2.somaComissao();
                    System.out.println("Primeiro nome " + funcionario2.getPrimeiro_nome() + "\nSegundo nome " + funcionario2.getSegundo_nome() + "\nSalario R$" + funcionario2.getSalario());
                  
                  break;
                // case 3:
                //     System.out.println("Você escolheu 3");
                //     System.out.println("Primeiro nome " + funcionario1.getPrimeiro_nome() + "\nSegundo nome " + funcionario1.getPrimeiro_nome() + " Salario R$" + funcionario1.getSalario());
                //   break;
                // case 4:
                //     System.out.println("Você escolheu 4");
                //     System.out.println("Bye!!!");
                //   break;
                case 0:
                    System.out.println("Você escolheu 0");
                    System.out.println("Bye!!!");
                  break;
                default:
                    System.out.println("Número inválido");
             }
        }while(op != 0);

    }
}
