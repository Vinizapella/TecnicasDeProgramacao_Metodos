package Parte1;

public class Carro {
    private String modelo;
    private int velocidade;

    public Carro() {}

    public Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando! Nova velocidade: " + velocidade + " km/h");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
