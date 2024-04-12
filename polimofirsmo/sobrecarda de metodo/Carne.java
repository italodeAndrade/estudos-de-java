public class Carne {
 private String  corte;

 public Carne(String corte){
    this.corte=corte;
 }

 public void mostrarmenssage(){
    System.out.println("você pediu um(a)= "+this.corte);
    
 }
 public String getcorte(){
   return corte;
 }
}
