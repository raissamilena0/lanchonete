package model;

public class Cliente {

    private String nome;
    private String sobrenome;


    public Cliente(String nome, String sobrenome) {
        this.sobrenome = sobrenome;
        this.nome = nome;
    }

    public void hello() {
        System.out.println("ola mundo");

    }

    public void bye(){
        System.out.println("ola mundo");

    }
    public String getNomeInteiro(){
        return nome + " " + sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}


