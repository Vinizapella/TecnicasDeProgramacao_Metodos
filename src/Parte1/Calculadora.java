package Parte1;

public class Calculadora {
    private String modelo;

    public Calculadora() {}

    public Calculadora(String modelo) {
        this.modelo = modelo;
    }

    public void somar(int a, int b) {
        int resultado = a + b;
        System.out.println(a + " + " + b + " = " + resultado);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}