import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tamanhoTabuleiro = 5;
        char agua = '~';
        char navio = 'N';
        char acerto = 'X';
        char erro = 'O';
        int numeroNavios = 3;

        char[][] tabuleiro = criarTabuleiro(tamanhoTabuleiro, agua, navio, numeroNavios);
        printTabuleiro(tabuleiro, agua, navio);
        int numeroNaviosNaoDetectado = numeroNavios;
        while (numeroNaviosNaoDetectado > 0) {
            int[] palpiteCoordenadas = getCoordenadasUsuario(tamanhoTabuleiro);
            char atualizarViewLocalizacao = avaliarPalpiteAndGetAlvo(palpiteCoordenadas, tabuleiro, navio, agua, acerto, erro);
            if (atualizarViewLocalizacao == acerto) {
                numeroNaviosNaoDetectado--;
            }
            tabuleiro = updateTabuleiro(tabuleiro, palpiteCoordenadas, atualizarViewLocalizacao);
            printTabuleiro(tabuleiro, agua, navio);
        }
        System.out.println("Você ganhou!");
    }
    private static char[][] updateTabuleiro(char[][] tabuleiro, int[] palpiteCoordenadas, char atualizarViewLocalizacao) {
        int row = palpiteCoordenadas[0];
        int col = palpiteCoordenadas[1];
        tabuleiro[row][col] = atualizarViewLocalizacao;
        return tabuleiro;
    }

    private static char avaliarPalpiteAndGetAlvo(int[] palpiteCoordenadas, char[][] tabuleiro, char navio, char agua, char acerto, char erro) {
        String mensagem;
        int row = palpiteCoordenadas[0];
        int col = palpiteCoordenadas[1];
        char alvo = tabuleiro[row][col];
        if (alvo == navio) {
            mensagem = "Acerto!";
            alvo = acerto;
        } else if (alvo == agua) {
            mensagem = "Erro!";
            alvo = erro;
        } else {
            mensagem = "Já havia atirado anteriormente!";
        }
        System.out.println(mensagem);
        return alvo;
    }

    private static int[] getCoordenadasUsuario(int tamanhoTabuleiro) {
        int row;
        int col;
        do {
            System.out.print("Linha: ");
            row = new Scanner(System.in).nextInt();
        } while (row < 1 || row > tamanhoTabuleiro + 1);
        do {
            System.out.print("Coluna: ");
            col = new Scanner(System.in).nextInt();
        } while (col < 1 || col > tamanhoTabuleiro + 1);
        return new int[]{row - 1, col - 1};
    }

    private static void printTabuleiro(char[][] tabuleiro, char agua, char navio) {
        int tamanhoTabuleiro = tabuleiro.length;
        System.out.print("  ");
        for (int i = 0; i < tamanhoTabuleiro; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int row = 0; row < tamanhoTabuleiro; row++) {
            System.out.print(row + 1 + " ");
            for (int col = 0; col < tamanhoTabuleiro; col++) {
                char posicao = tabuleiro[row][col];
                if (posicao == navio) {
                    System.out.print(agua + " ");
                } else {
                    System.out.print(posicao + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static char[][] criarTabuleiro(int tamanhoTabuleiro, char agua, char navio, int numeroNavios) {
        char[][] tabuleiro = new char[tamanhoTabuleiro][tamanhoTabuleiro];
        for (char[] row : tabuleiro) {
            Arrays.fill(row, agua);
        }
        return colocarNavios(tabuleiro, numeroNavios, agua, navio);
    }

    private static char[][] colocarNavios(char[][] tabuleiro, int numeroNavios, char agua, char navio) {
        int naviosColocados = 0;
        int tamanhoTabuleiro = tabuleiro.length;
        while (naviosColocados < numeroNavios) {
            int[] localizacao = gerarCoordenadasNavio(tamanhoTabuleiro);
            char possivelLocalizacao = tabuleiro[localizacao[0]][localizacao[1]];
            if (possivelLocalizacao == agua) {
                tabuleiro[localizacao[0]][localizacao[1]] = navio;
                naviosColocados++;
            }
        }
        return tabuleiro;
    }

    private static int[] gerarCoordenadasNavio(int tamanhoTabuleiro) {
        int[] coordenadas = new int[2];
        for (int i = 0; i < coordenadas.length; i++) {
            coordenadas[i] = new Random().nextInt(tamanhoTabuleiro);
        }
        return coordenadas;
    }
}