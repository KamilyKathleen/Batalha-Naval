package Final_Version;

public class Quadrado {
    private int x;
    private int y;
    private StatusQuadrado statusQuadrado;

    public Quadrado(int x, int y, StatusQuadrado statusQuadrado) {
        this.x = x;
        this.y = y;
        this.statusQuadrado = statusQuadrado;
    }

    public void setStatusQuadrado(StatusQuadrado statusQuadrado) {
        this.statusQuadrado = statusQuadrado;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public StatusQuadrado getStatusQuadrado() {
        return statusQuadrado;
    }

    public char getCaracter() {
        char resultado = ' ';
        switch (statusQuadrado) {
            case vazio:
                resultado = 'V';
            case acerto:
                resultado = 'A';
            case navio:
                resultado = 'N';
            case oceano:
                resultado = 'O';
            case erro:
                resultado = 'E';
        }
        return resultado;
    }
}
