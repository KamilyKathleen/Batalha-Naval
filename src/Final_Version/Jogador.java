package Final_Version;

import java.util.List;

public class Jogador {
    private List<Navio> navios;
    private Tabuleiro tabuleiro;
    private int naviosRestantes = 0;

    public Jogador(List<Navio> navios, Tabuleiro tabuleiro) {
        this.navios = navios;
        this.tabuleiro = tabuleiro;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public int numeroDeQuadradosDeNavios(List<Navio> navios) {
        int somaDeTodosOsQuadrados = 0;
        for (Navio navio : navios) {
            somaDeTodosOsQuadrados += navio.getTipoNavio().label;
        }
        return somaDeTodosOsQuadrados;
    }

    public boolean handleTiro(int x, int y) {
        for (Navio navio : navios) {
            for (Quadrado quadrado : navio.getCampos()) {
                if (quadrado.getY() == y && quadrado.getX() == x && quadrado.getStatusQuadrado().equals(StatusQuadrado.navio)) {
                    quadrado.setStatusQuadrado(StatusQuadrado.acerto);
                    tabuleiro.getQuadrado(x, y).setStatusQuadrado(StatusQuadrado.acerto);
                    System.out.println("Você acertou um navio!");
                    return true;
                } else if (quadrado.getY() == y && quadrado.getX() == x && quadrado.getStatusQuadrado().equals(StatusQuadrado.acerto)) {
                    quadrado.setStatusQuadrado(StatusQuadrado.acerto);
                    tabuleiro.getQuadrado(x, y).setStatusQuadrado(StatusQuadrado.acerto);
                    System.out.println("Você já acertou esse lugar!");
                    return false;
                }
            }
        }
        tabuleiro.getQuadrado(x, y).setStatusQuadrado(StatusQuadrado.erro);
        System.out.println("Errou!");
        return false;
    }
}
