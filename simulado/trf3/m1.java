import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto terraria = new Produto("Terraria", 20);
        Produto hk = new Produto("Hollow Knight", 40);

        PedidoJogo pedidos = new PedidoJogo();
        pedidos.addProduto(terraria);
        pedidos.addProduto(hk);
        
        double valorTotal = pedidos.calcularValorTotal();
        System.out.println("Produtos no pedido:");
        for (Produto produto : pedidos.getProdutos()) {
            System.out.println(produto.getNome() + ": R$" + produto.getValor());
        }
        System.out.println("Valor total do pedido: R$" + valorTotal);
    }
}

class PedidoJogo implements Pedido {
    private List<Produto> produtos;

    public PedidoJogo() {
        produtos = new ArrayList<>();
    }

    @Override
    public void addProduto(Produto produto) {
        System.out.println(produto.getNome() + " foi adicionado à sua lista de produtos.");
        produtos.add(produto);
    }

    @Override
    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public double calcularValorTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getValor();
        }
        return total;
    }
}

interface Pedido {
    void addProduto(Produto produto);
    List<Produto> getProdutos();
    double calcularValorTotal();
}

class Produto {
    private double valor;
    private String nome;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
