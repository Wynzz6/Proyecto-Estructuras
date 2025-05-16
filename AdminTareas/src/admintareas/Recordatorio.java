package admintareas;

public class Recordatorio {
    private String texto;
    private String fecha;

    public Recordatorio(String texto, String fecha) {
        this.texto = texto;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "[" + fecha + "] " + texto;
    }
}
