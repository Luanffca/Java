public class FuncionarioHora extends FuncionarioAssalariado{
    private int horas;
    private double valorDaHora;

    public FuncionarioHora(String nome, String matricula, double salarioSemanal, int horas, double valorDaHora){
        super(nome, matricula, salarioSemanal);
        this.horas = horas;
        this.valorDaHora = valorDaHora;
    }
    public int getHoras(){
        return this.horas;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }
    public double getvalorDaHora(){
        return this.valorDaHora;
    }
    public void setvalorDaHora(int valorDaHora){
        this.valorDaHora = valorDaHora;
    }

    @Override
    public double ganhos(){
        return getSalarioSemanal() + getHoras() * getvalorDaHora();
    }

    @Override
    public String toString() {
        return "Funcionario Assalariado { Nome " + getNome() + " Matricula " + getMatricula() + 
        "\n Salario Semanal " + getSalarioSemanal() + " Horas "+ getHoras() +
        " Valor da Hora " + getvalorDaHora() + "\n Ganhos R$ " + ganhos() + " } \n";
    }
    
}
