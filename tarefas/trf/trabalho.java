public class trabalho {
    public static void main(String[] arg) {
        produtos prd1= new produtos("pão",20.0,"pão da joana");
        produtos prd2= new produtos("chocolate",5.0,"nestle");
        produtos prd3= new produtos("bolacha",2.0,"bono");
        produtos prd4= new produtos("miojo",1.0,"nissin");
        produtos prd5= new produtos("arroz",10.0,"tio joão");
        prd1.printar();
        prd2.printar();
        prd3.printar();
        prd4.printar();
        prd5.printar();
    }
}