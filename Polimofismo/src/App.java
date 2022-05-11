import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		List<Produto> list = new ArrayList<>();

		System.out.println("Informe o número de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Produto #" + i + ":");
			System.out.print("Comum, Usado ou Importado? (C/U/I): ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preco: ");
			Double preco = sc.nextDouble();
			if (Character.toLowerCase(ch)  == 'i') {
				System.out.print("Taxa Alfandegária: ");
				double customsFee = sc.nextDouble();
				Produto prod1 = new ImportadosProdutos(nome, preco, customsFee);
				list.add(prod1);
			} else if (Character.toLowerCase(ch) == 'u') {
				System.out.print("Data de Fabricação: ");
				Date manufactureDate = data.parse(sc.next());
				Produto prod2 = new UserdProduto(nome, preco, manufactureDate);
				list.add(prod2);
			} else if (Character.toLowerCase(ch) == 'c') {
				Produto prod3 = new Produto(nome, preco);
				list.add(prod3);
			} else {
				System.out.println("Você informou um tipo de produto inválido");
			}
		}
		System.out.println();
		System.out.println("Etiquetas de Preço");
		for (Produto prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
    }
}