public class Funcionario {
	public String nome;
	public String data_nascimento;
	public String CPF;
	public String RG;
	public String sexo;
	public boolean ferias;
	private int carga_h;
	private String trabalho; 
	
	public void imprime() {
		System.out.println("Imprime informações sobre o Funcionario.");
		System.out.println("Nome: " + nome);
		System.out.println("Data de nascimento: " + data_nascimento);
		System.out.println("CPF: " + CPF);
		System.out.println("RG: " + RG);
		System.out.println("Sexo: " + sexo);
		System.out.println("Ferias: " + ferias);
	}
	
	public String realizarTrabalho(String work, int carga) {
		trabalho = work;
		carga_h = carga;
		return "Funcionario "+ nome + " realizar a função de " + trabalho + "\ncom carga horaria semanal de " + carga_h + " semanal"; 
	}
}
