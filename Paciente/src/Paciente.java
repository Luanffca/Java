public class Paciente {
	
	public String nome;
	public String data_nascimento;
	public String telefone;
	public String sexo;
	public boolean acompanhante;
	private String agenda_consulta;
	
	public String agenda(String data_consulta) {
		agenda_consulta = data_consulta;
		return "Consulta agendada para: " + agenda_consulta+ " Parciante: "+ nome;
	}
	
	public void imprime() {
		System.out.println("Imprime informações sobre o paciente");
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("Sexo: " + sexo);
		System.out.println("Acompanhante: " + acompanhante);
	}
}