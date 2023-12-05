package Final_Version;

import java.util.List;

public class Navio {
    private List<Quadrado> NovoNavio;
    private TipoNavio tipoNavio;

    public Navio(List<Quadrado> campos, TipoNavio tipoNavio) {
        NovoNavio = campos;
        this.tipoNavio = tipoNavio;
    }

    public boolean isLocalOk (Navio navio1, List<Navio> navios, Tabuleiro tabuleiro) {
        int contador = 0;
        for (int i = 0; i < navio1.getCampos().size(); i++) {
            if (navio1.getCampos().get(i).getY() > tabuleiro.getSizeY() ||
                navio1.getCampos().get(i).getX() > tabuleiro.getSizeX()) {
                contador++;
            }
            for (int j = 0; j < navios.size(); j++) {
                for (int k = 0; k < navios.get(j).getCampos().size(); k++) {
                    if (navio1.getCampos().get(i).getX() == navios.get(j).getCampos().get(k).getX() &&
                        navio1.getCampos().get(i).getY() == navios.get(j).getCampos().get(k).getY()) {
                        contador++;
                    }
                }
            }
        }
        if (contador == 0) {
            return true;
        }
        return false;
    }

    public List<Quadrado> getCampos() {
        return NovoNavio;
    }

    public TipoNavio getTipoNavio() {
        return tipoNavio;
    }

    public void add(Quadrado quadrado) {
        NovoNavio.add(quadrado);
    }

}
