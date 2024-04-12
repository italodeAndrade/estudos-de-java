public class Campeoes {
    private String nome;
    private double vida;
    private double dano;

    public Campeoes(String nome, double vida, double dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Vida: " + vida + ", Dano: " + dano;
    }
}
