public class App {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		paciente1.nome = "Lucius Malfoy";
		paciente1.data_nascimento = "06/05/2002";
		paciente1.telefone = "(84) 9 8745-1236";
		paciente1.sexo = "M";
		paciente1.acompanhante = false;
		
		System.out.println(paciente1.agenda("12/03/2022"));
		
		paciente1.imprime();

	}

}
