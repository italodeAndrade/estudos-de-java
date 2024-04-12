public class produto {
    private int codigo;
    private double peso;

    public produto(int codigo, double peso){
        this.codigo=codigo;
        this.peso=peso;
    }
    public double seguro(){
        return (peso * 10);
    }
}
