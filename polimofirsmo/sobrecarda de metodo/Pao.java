public class Pao {
    private String tipo;

    public Pao(String tipo){
        this.tipo=tipo;
    }

    public void mostrarmenssage(){
        System.out.println("você pediu um pão do tipo= "+this.tipo);
    }

    public String gettipo(){
        return tipo;
    }
    
}
