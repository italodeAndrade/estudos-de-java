package Exercicio3;

import java.time.LocalDateTime;

public class Conta {
    protected String nomeTitular;
    protected String numeroConta;
    protected String dataAbertura;
    protected double saldo;

    public Conta(String nomeTitular, String numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.dataAbertura = LocalDateTime.now().toString();
    }

    public double sacar(double valor) {
        if ((saldo - valor) < 0){
            System.out.println("Saldo insuficiente");
            return -1;
        }

        this.saldo -= valor;
        return this.saldo;
    }

    public boolean depositar(double valor) {
        if (saldo <= 0) return false;

        this.saldo += valor;
        return true;
    }

    public String retornaTexto(String tipoConta) {
        return String.format("<%s nome=%s, saldo=%.2f, data=%s>",tipoConta, this.nomeTitular,this.saldo, this.dataAbertura);
    }
}
