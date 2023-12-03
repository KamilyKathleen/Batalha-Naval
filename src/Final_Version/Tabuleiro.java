package Final_Version;

public class Tabuleiro {
    private int sizeX;
    private int sizeY;
    Quadrado[][] matriz;

    public Tabuleiro(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        fillTabuleiro(sizeX, sizeY);
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public Quadrado getQuadrado(int x, int y) {
        return matriz[x][y];
    }

    public Quadrado[][] fillTabuleiro(int x, int y) {
        matriz = new Quadrado[sizeX][sizeY];
        for (int row = 0; row < x; row++) {
            for (int col = 0; col < y; col++) {
                matriz[row][col] = new Quadrado(row, col, StatusQuadrado.oceano);
            }
        }
        return matriz;
    }

    public void construirNavio(Quadrado quadrado, Navio navio) {
        switch (navio.getTipoNavio().label) {
            case 1:
                quadrado.setStatusQuadrado(StatusQuadrado.navio);
                navio.add(quadrado);
                break;
            case 2:
                quadrado.setStatusQuadrado(StatusQuadrado.navio);
                navio.add(quadrado);
                int x = quadrado.getX();
                int y = quadrado.getY();
                navio.add(new Quadrado(x,y +1, StatusQuadrado.navio));
                break;
            case 3:
                quadrado.setStatusQuadrado(StatusQuadrado.navio);
                navio.add(quadrado);
                x = quadrado.getX();
                y = quadrado.getY();
                navio.add(new Quadrado(x,y +1, StatusQuadrado.navio));
                navio.add(new Quadrado(x,y +2, StatusQuadrado.navio));
            case 4:
                quadrado.setStatusQuadrado(StatusQuadrado.navio);
                navio.add(quadrado);
                x = quadrado.getX();
                y = quadrado.getY();
                navio.add(new Quadrado(x,y +1, StatusQuadrado.navio));
                navio.add(new Quadrado(x,y +2, StatusQuadrado.navio));
                navio.add(new Quadrado(x,y +3, StatusQuadrado.navio));
            case 5:
                quadrado.setStatusQuadrado(StatusQuadrado.navio);
                navio.add(quadrado);
                x = quadrado.getX();
                y = quadrado.getY();
                navio.add(new Quadrado(x,y +1, StatusQuadrado.navio));
                navio.add(new Quadrado(x,y +2, StatusQuadrado.navio));
                navio.add(new Quadrado(x,y +3, StatusQuadrado.navio));
                navio.add(new Quadrado(x,y +4, StatusQuadrado.navio));
        }
    }
}
