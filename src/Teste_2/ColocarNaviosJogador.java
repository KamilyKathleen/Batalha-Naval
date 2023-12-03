package Teste_2;

import java.util.Scanner;

public class ColocarNaviosJogador {
    public static void naviosJogador() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nPosicione seus navios no mapa!");
        BatalhaNaval.naviosJogador = 3;
        for (int i = 1; i <= BatalhaNaval.naviosJogador; ) {
            System.out.print("Insira a coordenada X (linha) para o navio número " + i + ": ");
            int x = scan.nextInt() - 1;
            System.out.print("Insira a coordenada Y (coluna) para o navio número " + i + ": ");
            int y = scan.nextInt() - 1;

            if ((x >= 0 && x < BatalhaNaval.numRows) && (y >= 0 && y < BatalhaNaval.numCols)
                    && (BatalhaNaval.grid[x][y].equals("~"))) {
                BatalhaNaval.grid[x][y] = "@";
                i++;
            } else if ((x >= 0 && x < BatalhaNaval.numRows) && (y >= 0 && y < BatalhaNaval.numCols)
                    && (BatalhaNaval.grid[x][y].equals("@"))) {
                System.out.println("Você não pode colocar mais de um navio no mesmo lugar");
            } else {
                System.out.println("Você não pode colocar navios fora do mapa!");
            }
        }
        PrintMapaOceano.printMapa();
    }
}
