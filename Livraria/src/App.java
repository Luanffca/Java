public class App {
	public static void main(String args[]) {
		Livraria book = new Livraria();
		book.nome_Livro = "A Dança dos Dragões";
		book.dono = "Game of Thrones";
		book.autor = "Goege RR Martin";
		book.estil_Capa = "Dura";
		book.Data_Lacamento = "10/05/2018";
		book.qtd_pagina = 12;
		book.estoque = 12;
		book.preco = 50.52f;
		
		book.Consulta();
		book.QuemCompraLivro();
		}
}