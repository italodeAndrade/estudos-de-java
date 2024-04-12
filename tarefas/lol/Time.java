import java.util.ArrayList;

public class Time {
    private ArrayList<Campeoes> campeoes;

    public Time() {
        campeoes = new ArrayList<Campeoes>();
    }

    public void adicionarCampeao(Campeoes campeao) {
        campeoes.add(campeao);
    }

    @Override
    public String toString() {
        return campeoes.toString();
    }
}
