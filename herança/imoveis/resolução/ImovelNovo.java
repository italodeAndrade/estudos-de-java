package Exercicio2;

public class ImovelNovo extends Imovel {
    public ImovelNovo(String endereco, double preco) {
        super(endereco, preco);
    }

    public double getAcrescimo() {
        return this.preco * 1.10;
    }

    public void mostrar() {
        System.out.println(
                "<Exercicio2.ImovelNovo endereco=" + this.endereco +
                " preco=" + this.preco +
                " preço acrescido=" + this.getAcrescimo() +
                " >"
        );
    }
}
