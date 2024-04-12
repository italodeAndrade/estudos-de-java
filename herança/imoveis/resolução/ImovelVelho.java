package Exercicio2;

public class ImovelVelho extends Imovel {
    public ImovelVelho(String endereco, double preco) {
        super(endereco, preco);
    }

    public double getDesconto() {
        return this.preco * 0.9;
    }

    public void mostrar() {
        System.out.println(
                "<Exercicio2.ImovelVelho endereco=" + this.endereco +
                        " preco=" + this.preco +
                        " preço desconto=" + this.getDesconto() +
                        " >"
        );
    }
}
