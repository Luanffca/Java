public class Livraria {
	public String nome_Livro;
	public String dono;
	public String autor;
	public String estil_Capa;
	public String Data_Lacamento;
	public int qtd_pagina;
	public int estoque;
	public float preco;
	
	public void Consulta(){
		if(estoque > 0) {
			System.out.println("Disponivel para venda!");
			System.out.println("Quantidade de Livro em Estoque: " + estoque);
			System.out.println("Nome do Livro: " + nome_Livro);
			System.out.println("Autor do Livro: " + autor);
			System.out.println("Preço: " + preco);
		}
		else {
			System.out.println("Indisponivel");
		}
			
	}
	
	public void QuemCompraLivro(){
		System.out.println("Nome do Livro: " + nome_Livro + "Preço: " + preco);
	}

	
}
