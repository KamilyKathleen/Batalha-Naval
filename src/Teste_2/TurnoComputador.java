package Teste_2;

public class TurnoComputador {
    public static void turnoComputador() {
        System.out.println("\nVez do computador!");
        // Adivinhar coordenadas
        int x = -1;
        int y = -1;
        do {
            x = (int)(Math.random() * 5);
            y = (int) (Math.random() * 5);

            if ((x >= 0 && x < BatalhaNaval.numRows) && (y >= 0 && y < BatalhaNaval.numCols)) { // Palpite válido
                if (BatalhaNaval.grid[x][y].equals("@")) { // Se tiver um navio do jogador, ele afunda
                    System.out.println("O computador afundou um de seus navios!");
                    BatalhaNaval.grid[x][y] = "X";
                    --BatalhaNaval.naviosJogador;
                    //++BatalhaNaval.naviosComputador;
                } else if (BatalhaNaval.grid[x][y].equals("C")) {
                    System.out.println("O computador tentou afundar um de seus próprios navios!");
                    /*BatalhaNaval.grid[x][y] = "!";
                    --BatalhaNaval.naviosComputador;*/
                } else if (BatalhaNaval.grid[x][y].equals("X")) {
                    System.out.println("O computador tentou afundar um navio que já afundou!");
                    BatalhaNaval.grid[x][y] = "X";
                } else {
                    System.out.println("O computador errou!");
                    BatalhaNaval.grid[x][y] = "-";
                    // Salvando palpites errados para o computador
                    if (BatalhaNaval.palpiteErrado[x][y] != 1) {
                        BatalhaNaval.palpiteErrado[x][y] = 1;
                    }
                }
            } else if (BatalhaNaval.naviosComputador <= 0 || BatalhaNaval.naviosJogador <= 0) {
                break;
            }
        } while ((x < 0 || x >= BatalhaNaval.numRows) || (y < 0 || y >= BatalhaNaval.numCols)
                || (BatalhaNaval.grid[x][y].equals("C")));
        //PrintMapaOceano.printMapa();
    }
}
