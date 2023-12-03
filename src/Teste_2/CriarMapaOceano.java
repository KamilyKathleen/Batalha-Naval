package Teste_2;

public class CriarMapaOceano {
    public static void mapaOceano() {
        String textBlue = "\u001B[34m";
        String textRed = "\u001B[41m";
        String reset = "\u001B[0m";

        // Primeira seção do mapa
        System.out.print("  ");
        for (int i = 0; i < BatalhaNaval.numCols; i++) {
            System.out.print(i + 1);
        }
        System.out.println();

        // Segunda seção (meio) do mapa
        for (int i = 0; i < BatalhaNaval.grid.length; i++) {
            for (int j = 0; j < BatalhaNaval.grid[i].length; j++) {
                BatalhaNaval.grid[i][j] = ("~");
                if (j == 0) {
                    System.out.print((i + 1) + "|" + BatalhaNaval.grid[i][j]);
                } else if (j == BatalhaNaval.grid[i].length - 1) {
                    System.out.print(BatalhaNaval.grid[i][j] + "|" + (i + 1));
                } else {
                    System.out.print(BatalhaNaval.grid[i][j]);
                }
            }
            System.out.println();
        }

        // Última seção do mapa
        System.out.print("  ");
        for (int i = 0; i < BatalhaNaval.numCols; i++) {
            System.out.print(i + 1);
        }
        System.out.println();
    }
}
