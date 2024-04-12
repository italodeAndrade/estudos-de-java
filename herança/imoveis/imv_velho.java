public class imv_velho extends imovel {
    

    public double getDesconto(){
        return this.preço*=0.90;
    }

    public imv_velho(String nome, double preço){
        super(nome,preço);
    }

}
