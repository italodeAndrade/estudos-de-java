public class Comida {
    public void assar(Pizza pi){
     System.out.println("a pizza sabor "+pi.getsabor() +" esta assando yummmi");
    } 
        public void assar(Carne ca){
     System.out.println("a"+ca.getcorte() +"esta no forno ");
    } 
        public void assar(Pao pa){
     System.out.println("a(o)"+pa.gettipo()+"esta no forno");
    } 

}
