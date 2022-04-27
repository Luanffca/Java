public class FuncionarioAssalariado extends Funcionario{
    private double salarioSemanal;

    public FuncionarioAssalariado (String nome, String matricula, double salarioSemanal){
        super(nome, matricula);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ganhos(){
        return salarioSemanal;
    }

    public double getSalarioSemanal(){
        return this.salarioSemanal;
    }
    public void setSalarioSemanal(double salarioSemanal){
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public String toString() {
        return "Funcionario Assalariado { Nome " + getNome() + " Matricula " + getMatricula() + 
        "\n Salario Semanal " + getSalarioSemanal() + " Ganhos R$ " + ganhos() + " } \n";
    }
}
