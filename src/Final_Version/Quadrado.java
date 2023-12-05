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
            case VAZIO:
                resultado = 'V';
                break;
            case ACERTO:
                resultado = 'A';
                break;
            case NAVIO:
                resultado = 'N';
                break;
            case OCEANO:
                resultado = 'O';
                break;
            case ERRO:
                resultado = 'E';
                break;
        }
        return resultado;
    }
}
