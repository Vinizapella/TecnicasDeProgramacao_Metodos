package Parte1;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado! Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado! Novo saldo: R$" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

