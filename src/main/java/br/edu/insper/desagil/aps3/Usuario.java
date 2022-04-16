package br.edu.insper.desagil.aps3;

public class Usuario {
    // user has login and name
    private String login;
    private String nome;

    Usuario(String login, String nome){
        this.login = login;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
