public class produtos {

    private String nome;
    private double preço;
    private String marca;

    public produtos(String nome, double preço,String marca){
        this.nome= nome;
        this.preço= preço;
        this.marca=marca;
    }
    
    public void executar() {
        System.out.println("você pôs os produtos no carrinho");
    }
    public void printar(){
        System.out.printf("nome: %s preço: %2f marca: %s", this.nome, this.preço, this.marca );
    
    }
    }