
public class App {

	public static void main(String[] args) {
		Filme filme1 = new Filme();
		
		filme1.nome = "A Guerra dos Tronos";
		filme1.estudio = "HBO MAX";
		filme1.genero = "Fantasia";
		filme1.data_lancamento = " 06/04.2022";
		filme1.diretor = "Geoge R.R. Martin";
		filme1.duracao = 02.30f;
		
		System.out.println(filme1.compraIngresso("04/04/2022", 50.5f));
		
		filme1.imprime();
		
	}

}
