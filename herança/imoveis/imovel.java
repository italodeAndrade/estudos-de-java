public class imovel {
    protected String nome;
    protected double preço;
    public imovel(String nome, double preço) {
        this.nome = nome;
        this.preço= preço;
    }

    public String getnome() {
        return nome;
    }
    public double getPreço() {
        return preço;
    }
    
    public void mostrar_info(){
        System.out.println("[ nome do imovel= "+this.nome+"  ||  preço= "+ this.preço+ " ]");
    }
    
    
}