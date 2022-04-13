public class FuncionarioComissionado extends Funcionario {
    private double salarioComissionado, vendas, comissao;

    public FuncionarioComissionado(String nome, String sobrenome, double salario, double vendas, double comissao) {
        super(nome, sobrenome, salario);
        this.vendas = vendas;
        this.comissao = comissao;
    }
    public void somaComissao(){
        salarioComissionado =  vendas * comissao;
        salarioComissionado = ( getSalario() + (getSalario() * salarioComissionado));
        setSalario(salarioComissionado);
    }

    public void setVendas(int vendas){
        this.vendas = vendas;
    }
    public double getVendas(){
        return this.vendas;
    }
    public void setsalarioComissionado(int salarioComissionado){
        this.salarioComissionado = salarioComissionado;
    }
    public double  getsalarioComissionado(){
        return this.salarioComissionado;
    }
    public void setComissao(double comissao){
        this.comissao = comissao;
    }
    public double  getcomissao(){
        return this.comissao;
    }
}
