public class Usuario {

    private String nome;
    private String login;
    private String senha;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        nome = nome.toUpperCase();
        this.nome = nome;
    }

    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        login = login.toLowerCase();
        this.login = login;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        if(senha.length() < 16){
            this.senha = senha;
        }
        else{
            System.out.println("Senha Inválida");;
        }
        
    }
    
}
