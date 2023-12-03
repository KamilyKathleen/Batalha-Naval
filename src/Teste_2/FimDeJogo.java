package Teste_2;

public class FimDeJogo {
    public static void fimJogo() {
        System.out.println("Seus navios: " + BatalhaNaval.naviosJogador +
                " | Navios do computador: " + BatalhaNaval.naviosComputador);
        if (BatalhaNaval.naviosJogador > 0 && BatalhaNaval.naviosComputador <= 0) {
            System.out.println("Viva! Você ganhou o jogo :)");
        } else {
            System.out.println("Que pena! Você perdeu o jogo :(");
        }
        System.out.println();
    }
}