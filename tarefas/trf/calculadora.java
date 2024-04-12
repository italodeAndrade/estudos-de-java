import java.util.Scanner;

public class calculadora {
    public static void main (String[] args) {
        while(true){
            int numero1;
            int numero2;
            float resultado;

            Scanner scanner = new Scanner(System.in);

            System.out.println("digite o primeiro numero");
            numero1= scanner.nextInt();

            System.out.println("agora digite o segundo numero");
            numero2= scanner.nextInt();
            
            System.out.println("agora escolha qual a operção + - / *");
            String operação= scanner.next();

            if (operação.equals("+")){
                resultado=numero1+numero2;
                System.out.println("seu resultado é: " + resultado);
            }

            if (operação.equals("-")){
                resultado=numero1-numero2;
                System.out.println("seu resultado é: " + resultado);
            }
            
            if (operação.equals("*")){
                resultado=numero1*numero2;
                System.out.println("seu resultado é: " + resultado);
            }
            
        

            if (operação.equals("/")){
                resultado=numero1/numero2;
                System.out.println("seu resultado é: " + resultado);
            }
            



        }


       
    }
}

