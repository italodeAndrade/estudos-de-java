package Exercicio2;

// Super classe (outras classes herdarão dela)
public class Imovel {
    protected String endereco;
    protected double preco;

    public Imovel(String endereco, double preco){
        this.preco = preco;
        this.endereco = endereco;
    }
}
