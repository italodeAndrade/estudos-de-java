public class geladeira extends produto {
    private int volume;
    public geladeira(int codigo, double peso, int volume){
        super(codigo, peso);
        this.volume=volume;
    }
    public double seguro(){
        return(super.seguro()+(volume*5));
    }
}
