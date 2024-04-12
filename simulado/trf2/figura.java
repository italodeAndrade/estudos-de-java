public abstract class figura {
    protected String sep= "/";
    protected double x;
    protected double y;
    protected int cor;

    public figura (double x, double y, int cor){
        this.x=x;this.y=y;this.cor=cor;
    }
    public void deslocar (double x, double y){
        apagar();
        this.x=x; this.y=y;
        desenhar();
    }
public void colorir(int cor){
    apagar();
    this.cor=cor;
    desenhar();
}
abstract public void apagar();
abstract public void desenhar();
}
