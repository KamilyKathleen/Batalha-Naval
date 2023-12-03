package Teste_2;

public class ColocarNaviosComputador {
    public static void naviosComputador() {
        System.out.println("\nO computador está posicionando seus navios no mapa...");
        BatalhaNaval.naviosComputador = 3;
        for (int i = 1; i <= BatalhaNaval.naviosComputador; ) {
            int x = (int)(Math.random() * 5);
            int y = (int) (Math.random() * 5);

            if ((x >= 0 && x < BatalhaNaval.numRows) && (y >= 0 && y < BatalhaNaval.numCols)
                    && (BatalhaNaval.grid[x][y].equals("~"))) {
                BatalhaNaval.grid[x][y] = "C";
                System.out.println("Navio " + i + " posicionado.");
                i++;
            }
        }
        PrintMapaOceano.printMapa();
    }
}
