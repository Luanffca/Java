import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Usuario user = new Usuario();
        String nome, login, senha;

        System.out.println("Informe seu Nome: ");
        nome = sc.next();
        user.setNome(nome);
        System.out.println("Informe seu Login: ");
        login = sc.next();
        user.setLogin(login);
        System.out.println("Informe sua Senha: ");
        senha = sc.next();
        user.setSenha(senha);
        System.out.println("Seu nome: " + user.getNome());
        System.out.println("Seu Login: " + user.getLogin());
        System.out.println("Sua Senha: " + user.getSenha());

    }
}
