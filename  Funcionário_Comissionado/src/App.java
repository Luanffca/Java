public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        //Funcionario fun = new Funcionario();
        System.out.println("Funcionario Comissionado");
        FuncionarioComissionado fc = new FuncionarioComissionado("João","1202", 15, 10.5);
        System.out.println(fc.toString());

        System.out.println("Funcionario Assalariado");
        FuncionarioAssalariado fa = new FuncionarioAssalariado("Inacio", "8523", 500.50);
        System.out.println(fa.toString());

        System.out.println("Funcionario Hora");
        FuncionarioHora fh = new FuncionarioHora("Daenerys", "8524", 500.5, 10, 12.5);
        System.out.println(fh.toString());
    }
}
