package Final_Version;

public enum TipoNavio {
    barco(1),
    contratorpedeiro(2),
    submarino(3),
    encouracado(4),
    portaAvioes(5);

    public final Integer label;

    TipoNavio(Integer label) {
        this.label = label;
    }
}
