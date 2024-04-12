public class circulo extends figura {
    private double raio; 
public circulo(double x, double y , int cor , double raio){
    super(x,y,cor);
    this.raio=raio;
    desenhar();
}
public void apagar(){
    System.out.println("Apagando circulo : " +x+sep+y+sep+cor+sep+raio);
}
public void desenhar(){
    System.out.println("Desenhado circulo: " +x+sep+y+sep+cor+sep+raio);
}
}
