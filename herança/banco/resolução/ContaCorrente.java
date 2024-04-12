package Exercicio3;

public class ContaCorrente extends Conta {
    private double taxaManutencao;
    public ContaCorrente(
            String nomeTitular,
            String numeroConta,
            double saldo,
            double taxaManutencao) {
        super(nomeTitular, numeroConta, saldo);
        this.taxaManutencao = taxaManutencao;
    }

    public boolean debitarManutencao() {
        return super.depositar(taxaManutencao);
    }

    public String toString() {
        return super.retornaTexto("ContaCorrente");
    }
}
