public class banco{
    public static void main(String[]args){
        Cliente clt1= new  Cliente("Jandira silva", 2500);
        Cliente clt2= new  Cliente("Sandra Rodrigues", 1800);
        Cliente clt3= new  Cliente("Luciana Teixeira", 5000);
      
        clt1.printar();
        System.out.println();
        clt2.printar();
        System.out.println();
        clt3.printar();

        clt1.Retirar(1000);
        System.out.println();
        clt1.printar();
        System.out.println();
        clt2.Retirar(2000);
        clt2.Depositar(500);
        clt2.printar();
        System.out.println();
        clt2.Retirar(2000);
        clt2.printar();
        System.out.println();
        clt3.Depositar(1000);
        clt3.printar();

    }




}