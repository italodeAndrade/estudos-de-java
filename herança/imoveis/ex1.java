public class ex1{
    public static void main (String[]args){
     imv_novo imvn1= new imv_novo("rogerinho", 1200);
        imvn1.getAcrescimo();
        imvn1.mostrar_info();
        
        imv_velho imvv1 = new imv_velho("carlos", 700);
        imvv1.getDesconto();
        imvv1.mostrar_info();

    }
}