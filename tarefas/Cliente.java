public class Cliente {
    private String nome;
    private double saldo_inc;

    public  Cliente(String nome, double saldo_inc){
        this.nome=nome;
        this.saldo_inc=saldo_inc;
    }
    public void Depositar(double sld_dpst){
        saldo_inc+=sld_dpst;
    }
    public void Retirar(double sld_rtd){
        saldo_inc-=sld_rtd;
    }
    public void printar(){
        System.out.printf("nome: %s saldo: %2f",this.nome, this.saldo_inc );
    }

}

