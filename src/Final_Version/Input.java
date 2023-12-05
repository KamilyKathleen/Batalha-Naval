package Final_Version;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    private Scanner scan = new Scanner(System.in);
    private List<Tabuleiro> tabuleiros = new ArrayList<>();
    int escolha;
    List<Integer> CoordenadasETipoNavio = new ArrayList<>();

    public List<Tabuleiro> getTabuleiros() {
        gerarTabuleiro();
        return tabuleiros;
    }

    public Input() {

    }

    public int getIntegerOpcaoMenu() {
        escolha = scan.nextInt();
        scan.nextLine();
        return escolha;
    }

    private List<Integer> pedirCoordenadasETipoNavio() {
        this.CoordenadasETipoNavio = new ArrayList<>();
        System.out.println("Selecione a linha: ");
        int row = scan.nextInt();
        scan.nextLine();

        System.out.println("Selecione a coluna: ");
        int col = scan.nextInt();
        scan.nextLine();

        System.out.println("Selecione o navio: \n" + "1 - Barco \n" + "2 - Contratorpedeiro \n" + "3 - Submarino \n" +
                "4 - Encouraçado \n" + "5 - Porta Aviões");
        int tipoNavio = scan.nextInt();

        CoordenadasETipoNavio.add(row);
        CoordenadasETipoNavio.add(col);
        CoordenadasETipoNavio.add(tipoNavio);
        return CoordenadasETipoNavio;
    }

    public Navio criarNavio(int jogador) {
        int GameJogador = jogador + 1;
        Quadrado parteNavio;
        Navio navio;
        System.out.println("\nJogador " + GameJogador + " posicione o navio.");
        CoordenadasETipoNavio = pedirCoordenadasETipoNavio();
        int row = CoordenadasETipoNavio.get(0);
        int col = CoordenadasETipoNavio.get(1);
        int tipoNavio = CoordenadasETipoNavio.get(2);
        parteNavio = new Quadrado(row, col, StatusQuadrado.NAVIO);
        navio = new Navio(new ArrayList<>(), TipoNavio.values()[tipoNavio - 1]);
        tabuleiros.get(jogador).construirNavio(parteNavio, navio);
        return navio;
    }

    public void gerarTabuleiro() {
        int x = 10;
        int y = 10;

        Tabuleiro tabuleiro1 = new Tabuleiro(x, y);
        Tabuleiro tabuleiro2 = new Tabuleiro(x, y);

        tabuleiros.add(tabuleiro1);
        tabuleiros.add(tabuleiro2);
    }

    public int[] atirar(int jogador) {
        int GameJogador = jogador + 1;
        System.out.println("\nJogador " + GameJogador + " atire.");
        System.out.println("Selecione a linha: ");
        int row = scan.nextInt();
        scan.nextLine();

        System.out.println("Selecione a coluna: ");
        int col = scan.nextInt();
        return new int[]{row, col};
    }
}
