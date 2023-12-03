package Teste_2;

public class Batalha {
    public static void batalha() {
        TurnoJogador.turnoJogador();
        TurnoComputador.turnoComputador();
        PrintMapaOceano.printMapa();
        System.out.println();
        System.out.println("Seus navios: " + BatalhaNaval.naviosJogador +
                " | Navios do computador: " + BatalhaNaval.naviosComputador);
        System.out.println();
    }
}
