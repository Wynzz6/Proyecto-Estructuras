package admintareas;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<Nota> notas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public double calcularPromedio() {
        double suma = 0;
        double totalPorcentaje = 0;
        for (Nota nota : notas) {
            suma += nota.getValor() * (nota.getPorcentaje() / 100);
            totalPorcentaje += nota.getPorcentaje();
        }
        return totalPorcentaje > 0 ? suma : 0;
    }
}
