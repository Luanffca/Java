public class Filme{
	
	public String nome;
	public String estudio;
	public String genero;
	public String data_lancamento;
	public String diretor;
	public float duracao;
	private String data_exibicao;
	private float valor;
	
	public String compraIngresso(String data, float preco) {
		data_exibicao = data;
		valor = preco;
		
		return "Filme " + nome + " Data de Lancamento " + data_lancamento + " \n Pré-Venda "
				+ data_exibicao + " valor do ingresso " + valor + "\n";
	}
	
	public void imprime() {
		System.out.println("Imprime informações sobre o filme.");
		System.out.println("Nome "+ nome);
		System.out.println("Estudio " + estudio);
		System.out.println("Gereno " + genero);
		System.out.println("Data Laçamento " + data_lancamento);
		System.out.println("Diretor do filme " + diretor);
	}
}
