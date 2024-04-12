public class a{
    public static void main(String[]args){
        geladeira g= new geladeira(35,50,300);
        notebook  n= new notebook(81, 3.5, 8);
        System.out.println(g.seguro());
        System.out.println(n.seguro());
    }
}