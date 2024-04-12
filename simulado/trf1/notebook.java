public class notebook extends produto {
    private int memoria;
    public notebook(int codigo, double peso, int memoria){
        super(codigo, peso);
        this.memoria=memoria;
    }
    
    public double seguro(){
        return(memoria*500);
    }
}
