package Parte1;

public class Lampada {
    private boolean ligada;

    public Lampada() {
        this.ligada = false;
    }

    public Lampada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar() {
        ligada = true;
        System.out.println("Lâmpada ligada!");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Lâmpada desligada!");
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}