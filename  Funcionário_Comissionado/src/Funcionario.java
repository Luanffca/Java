public abstract class Funcionario {
    private String nome;
    private String matricula;
    //private double ganhos;
    public Funcionario(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String toString() {
        return "Funcionario { Nome" + getNome() + "Matricula" + getMatricula() + "} \n"; 
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double ganhos(){
        return 0;
    }

}