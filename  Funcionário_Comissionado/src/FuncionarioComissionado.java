public class FuncionarioComissionado extends Funcionario {
    private int quatidadeVendas;
    private double valorPorvenda;

    public FuncionarioComissionado(String nome, String matricula, int quatidadeVendas, double valorPorvenda){
        super(nome, matricula);
        this.quatidadeVendas = quatidadeVendas;
        this.valorPorvenda = valorPorvenda;
    }

    @Override
    public double ganhos() {
        return getValorPorvenda() * getQuatidadeVendas();
    }
    public int getQuatidadeVendas() {
        return quatidadeVendas;
    }
    public void setQuatidadeVendas(int quatidadeVendas) {
        this.quatidadeVendas = quatidadeVendas;
    }
    public double getValorPorvenda() {
        return valorPorvenda;
    }
    public void setValorPorvenda(double valorPorvenda) {
        this.valorPorvenda = valorPorvenda;
    }
    @Override
    public String toString() {
        return "Funcionario Comissionado { Nome " + getNome() + " Matricula " + getMatricula() +
                "\n Quatidade Vendas " + getQuatidadeVendas() + 
                " Valor Porvenda "+ getValorPorvenda() + "\n Ganhos R$ " + ganhos() +" } \n";
    }


}
