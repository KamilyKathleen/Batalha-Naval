package Final_Version;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private List<Navio> naviosJogador1 = new ArrayList<>();
    private List<Navio> naviosJogador2 = new ArrayList<>();
    List<Tabuleiro> tabuleiros;

    public void adicionarNavios() {
        Input tabuleiro1 = new Input();
        tabuleiros = tabuleiro1.getTabuleiros();
        Tabuleiro tabuleiroJogador1 = tabuleiros.get(0);
        Tabuleiro tabuleiroJogador2 = tabuleiros.get(1);
        for (int i = 0; i < 3; i++) {
            Navio one = tabuleiro1.criarNavio(0);
            while (one.isLocalOk(one, naviosJogador1, tabuleiroJogador1) == false) {
                one = tabuleiro1.criarNavio(0);
            }
            naviosJogador1.add(one);
        }
        for (int i = 0; i < 3; i++) {
            Navio one = tabuleiro1.criarNavio(1);
            while (one.isLocalOk(one, naviosJogador2, tabuleiroJogador2) == false) {
                one = tabuleiro1.criarNavio(1);
            }
            naviosJogador2.add(one);
        }
        Jogador jogador1 = new Jogador(naviosJogador1, tabuleiroJogador2);
        Jogador jogador2 = new Jogador(naviosJogador2, tabuleiroJogador1);
        boolean jogoOn = true;
        Display display = new Display();

        System.out.println("<<<<<<<<<< Tabuleiro Jogador 1 >>>>>>>>>>");
        display.printTabuleiro(tabuleiroJogador1);
        System.out.println("---------------------------------------------");

        System.out.println("<<<<<<<<<< Tabuleiro Jogador 2 >>>>>>>>>>");
        display.printTabuleiro(tabuleiroJogador2);
        System.out.println("---------------------------------------------");

        int numeroDeNaviosJogador1 = jogador1.numeroDeQuadradosDeNavios(naviosJogador1);
        int numeroDeNaviosJogador2 = jogador2.numeroDeQuadradosDeNavios(naviosJogador2);
        System.out.println("Número de quadrados jogador 1: " + numeroDeNaviosJogador1);
        System.out.println("Número de quadrados jogador 2: " + numeroDeNaviosJogador2);
        while (jogoOn) {
            int[] atirarCoordenadas;
            atirarCoordenadas = tabuleiro1.atirar(0);
            if (jogador2.handleTiro(atirarCoordenadas[0], atirarCoordenadas[1])) {
                System.out.println("<<<<<<<<<< Tabuleiro Jogador 2 >>>>>>>>>>");
                display.printTabuleiro(jogador2.getTabuleiro());
                System.out.println("---------------------------------------------");
                numeroDeNaviosJogador2--;
            } else {
                System.out.println("<<<<<<<<<< Tabuleiro Jogador 2 >>>>>>>>>>");
                display.printTabuleiro(jogador2.getTabuleiro());
                System.out.println("---------------------------------------------");
            }

            if (numeroDeNaviosJogador2 == 0) {
                display.printTabuleiro(jogador2.getTabuleiro());
                System.out.println("Jogador 1 venceu! \n");
                break;
            }

            atirarCoordenadas = tabuleiro1.atirar(1);
            if (jogador1.handleTiro(atirarCoordenadas[0], atirarCoordenadas[1])) {
                System.out.println("<<<<<<<<<< Tabuleiro Jogador 1 >>>>>>>>>>");
                display.printTabuleiro(jogador1.getTabuleiro());
                System.out.println("---------------------------------------------");
                numeroDeNaviosJogador1--;
            } else {
                System.out.println("<<<<<<<<<< Tabuleiro Jogador 1 >>>>>>>>>>");
                display.printTabuleiro(jogador1.getTabuleiro());
                System.out.println("---------------------------------------------");
            }

            if (numeroDeNaviosJogador1 == 0) {
                display.printTabuleiro(jogador1.getTabuleiro());
                System.out.println("Jogador 2 venceu! \n");
                break;
            }
        }
    }
}
