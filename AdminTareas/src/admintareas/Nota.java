package admintareas;

public class Nota {
    private double valor;
    private double porcentaje;

    public Nota(double valor, double porcentaje) {
        this.valor = valor;
        this.porcentaje = porcentaje;
    }

    public double getValor() {
        return valor;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    @Override
    public String toString() {
        return "Nota: " + valor + " (" + porcentaje + "% del total)";
    }
}
