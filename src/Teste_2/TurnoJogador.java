package Teste_2;

import java.util.Scanner;

public class TurnoJogador {
    public static void turnoJogador() {
        System.out.println("\nSua vez!");
        int x;
        int y;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Insira a coordenada X (linha): ");
            x = scan.nextInt() - 1;
            System.out.print("Insira a coordenada Y (coluna): ");
            y = scan.nextInt() - 1;

            if ((x >= 0 && x < BatalhaNaval.numRows) && (y >= 0 && y < BatalhaNaval.numCols)) { // Palpite válido
                if (BatalhaNaval.grid[x][y].equals("C")) { // Se tiver um navio do computador, ele afunda
                    System.out.println("Boom! Você afundou o navio!");
                    BatalhaNaval.grid[x][y] = "!";
                    --BatalhaNaval.naviosComputador;
                } else if (BatalhaNaval.grid[x][y].equals("@")) {
                    System.out.println("Você não pode afundar seu próprio navio!");
                    /*BatalhaNaval.grid[x][y] = "X";
                    --BatalhaNaval.naviosJogador;*/
                    //++BatalhaNaval.naviosComputador;
                } else if (BatalhaNaval.grid[x][y].equals("!")) {
                    System.out.println("Você já afundou esse navio! Tente novamente no próximo turno.");
                    BatalhaNaval.grid[x][y] = "!";
                } else {
                    System.out.println("Que pena! Não tinha nada ali! Tente novamente no próximo turno.");
                    BatalhaNaval.grid[x][y] = "-";
                }
            } else if (BatalhaNaval.naviosComputador <= 0 || BatalhaNaval.naviosJogador <= 0) {
                break;
            } else { // Palpite fora da grid
                System.out.println("Você não pode dar tiros fora do mapa!");
            }
        } while ((x < 0 || x >= BatalhaNaval.numRows) || (y < 0 || y >= BatalhaNaval.numCols)
                || (BatalhaNaval.grid[x][y].equals("@")));
        //PrintMapaOceano.printMapa();
    }
}
