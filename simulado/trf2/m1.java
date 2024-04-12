public class m1{
    public static void main (String [] args){
        figura f = new circulo(0, 0, 5, 3.0);
        f.deslocar(7.5, 8);
        f.colorir(9);

        f= new retangulo(4.5, 3, 8, 2.5, 4.0);
        f.deslocar(2, 8.5);
        f.colorir(1);

    }
}