import java.util.Scanner;
public class arrays {
    public static void print_array(int[] array) {
        for (int i=0; i <array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void mdf_num(int[] array){
        Scanner Scanner= new Scanner(System.in);
        for (int a=0; a <array.length;a++){
            array[a]=Scanner.nextInt();
        }
    }
    public static void main (String[] args){
        Scanner Reader =  new Scanner(System.in);
        int[] lista= {0,0,0,0,0};
        while (true){
        System.out.println("o que deseja fazer ?");
        System.out.println("A-ver a lista");
        System.out.println("B-modificar todos os numeros da lista");
        System.out.println("C-sair");
        String escolha =Reader.next();  
        switch(escolha){
            case "A":
            print_array(lista);

            case "B":
            System.out.println("digite os numeros: ");
            mdf_num(lista);

            case "c":
             break;
        }  

        System.out.println("agora essa é a lista:");
        print_array(lista);
    }
   }
}
