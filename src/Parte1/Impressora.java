package Parte1;

public class Impressora {
    private String modelo;

    public Impressora() {}

    public Impressora(String modelo) {
        this.modelo = modelo;
    }

    public void imprimirDocumento(String documento) {
        System.out.println("Imprimindo documento:");
        System.out.println("======================");
        System.out.println(documento);
        System.out.println("======================");
        System.out.println("Documento impresso com sucesso!");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}