package Parte1;
public class Aluno {
    private String nome;
    private double nota;

    public Aluno() {}

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void verificarAprovacao() {
        if (nota >= 7) {
            System.out.println(nome + " está APROVADO com nota " + nota);
        } else {
            System.out.println(nome + " está REPROVADO com nota " + nota);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}