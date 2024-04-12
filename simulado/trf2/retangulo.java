public class retangulo extends figura {
    private double base;
    private double altura;
    public retangulo(double x, double y, int cor, double base, double altura){
        super(x, y, cor);
        this.base=base; this.altura=altura;
        desenhar();
    }
    public void apagar(){
        System.out.println("Desenhado retangulo: " +x+sep+y+sep+cor+sep+base+sep+altura);
    }
    public void desenhar(){
        System.out.println("Desenhado retangulo: " +x+sep+y+sep+cor+sep+base+sep+altura);
    }
    
}
