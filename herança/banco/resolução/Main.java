package Exercicio3;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca("Pedro", "1", 3, 0.3);
        ContaCorrente cc = new ContaCorrente("Joao das couves", "2", 300, 100);

        System.out.println(cc);
        System.out.println(cp);
    }
}
