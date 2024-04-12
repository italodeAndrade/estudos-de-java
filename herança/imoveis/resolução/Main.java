package Exercicio2;

public class Main {
    public static void main(String[] args) {
        ImovelNovo  in = new ImovelNovo ("Rua Brigadeiro Franco, 2222", 10000);
        ImovelVelho iv = new ImovelVelho("Rua das Ruas", 170000);

        in.mostrar();
        iv.mostrar();
    }
}
