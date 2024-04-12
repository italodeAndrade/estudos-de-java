package Exercicio3;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;
    public ContaPoupanca(
            String nomeTitular,
            String numeroConta,
            double saldo,
            double taxaRendimento) {
        super(nomeTitular, numeroConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public boolean debitarManutencao() {
        return super.depositar(this.saldo * taxaRendimento);
    }

    public String toString() {
        return super.retornaTexto("ContaPoupanca");
    }
}
