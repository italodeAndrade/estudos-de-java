public class gerenciador_partida {

    public static void main(String[] args) {
        Campeoes leesin = new Campeoes("yasuo", 100, 200);
        Campeoes darius = new Campeoes("darius", 1000, 350);
        Campeoes fizz = new Campeoes("fizz", 400, 900);
        Campeoes lulu = new Campeoes("lulu", 10, 350);
        Campeoes samira = new Campeoes("samira", 400, 900);

        Time liquid = new Time();
        liquid.adicionarCampeao(leesin);
        liquid.adicionarCampeao(darius);
        liquid.adicionarCampeao(fizz);
        liquid.adicionarCampeao(samira);
        liquid.adicionarCampeao(lulu);
        System.out.println("match started");
        System.out.print(liquid.toString());
}
}
