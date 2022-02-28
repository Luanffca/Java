public class App {
	public static void main(String[] args) {
		Funcionario funcinario1 = new Funcionario();
		
		funcinario1.nome = "Harry Potter";
		funcinario1.data_nascimento = "08/10/1987";
		funcinario1.CPF = "852.147.455.-89";
		funcinario1.RG = "987456321 - 25";
		funcinario1.sexo = "M";
		//funcinario1.carga_h = 12;
		funcinario1.ferias = false;
		
		System.out.println(funcinario1.realizarTrabalho("Programador", 12));
		funcinario1.imprime();
	}

	

}
