package Teste_2;

public class PrintMapaOceano {
    public static void printMapa() {
        System.out.println();
        // Primeira seção do mapa
        System.out.print("  ");
        for (int i = 0; i < BatalhaNaval.numCols; i++) {
            System.out.print(i + 1);
        }
        System.out.println();

        // Segunda seção (meio) do mapa
        for (int x = 0; x < BatalhaNaval.grid.length; x++) {
            System.out.print((x + 1) + "|");
            for (int y = 0; y < BatalhaNaval.grid[x].length; y++) {
                System.out.print(BatalhaNaval.grid[x][y]);
            }
            System.out.println("|" + (x + 1));
        }

        // Última seção do mapa
        System.out.print("  ");
        for (int i = 0; i < BatalhaNaval.numCols; i++) {
            System.out.print(i + 1);
        }
        System.out.println();
    }
}
