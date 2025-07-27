package Parte1;

public class Animal {
    private String nome;

    public Animal() {}

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Som emitido por " + nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}