package Parte1;
public class Relogio {
    private int hora;

    public Relogio() {}

    public Relogio(int hora) {
        this.hora = hora;
    }

    public void ajustarHora(int novaHora) {
        this.hora = novaHora;
        System.out.println("Hora ajustada para: " + hora + ":00");
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}