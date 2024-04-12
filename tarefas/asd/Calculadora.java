package asd;

public class Calculadora {
    private int execucoes=0;
    public int calcula(int numero){
        int resultado;
        if (numero==1){
            resultado=1;
        }

        else {
            resultado=numero *calcula(numero - 1);
        }
        execucoes++;
        return resultado;
    }
    public float custo(){
        return(float)Math.pow(execucoes,2) / 4;
    }
}
