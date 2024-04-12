public class imv_novo extends imovel {

    public double getAcrescimo(){
        return this.preço*=1.10;
    }

    public imv_novo(String nome, double preço){
        super(nome,preço);
    }

}
