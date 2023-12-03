package Teste_2;

public class BatalhaNaval {
    public static int numRows = 5;
    public static int numCols = 5;
    public static int naviosJogador;
    public static int  naviosComputador;
    public static String[][] grid = new String[numRows][numCols];
    public static int[][] palpiteErrado = new int[numRows][numCols];

    public static void main(String[] args) {
        System.out.println("Batalha Naval");
        System.out.println("Agora, o mar está vazio\n");

        // Criar o mapa do oceano
        CriarMapaOceano.mapaOceano();

        // Colocar navios do jogador
        ColocarNaviosJogador.naviosJogador();

        // Colocar navios do computador
        ColocarNaviosComputador.naviosComputador();

        // Batalhar
        do {
            Batalha.batalha();
        } while (naviosJogador != 0 && naviosComputador != 0);

        // Fim de Jogo
        FimDeJogo.fimJogo();
    }
}
