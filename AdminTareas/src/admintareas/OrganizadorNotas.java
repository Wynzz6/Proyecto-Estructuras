package admintareas;

import java.util.HashMap;
import java.util.Map;

public class OrganizadorNotas {
    private HashMap<String, Materia> materias;

    public OrganizadorNotas() {
        materias = new HashMap<>();
    }

    public void agregarNota(String nombreMateria, Nota nota) {
        Materia materia = materias.getOrDefault(nombreMateria, new Materia(nombreMateria));
        materia.agregarNota(nota);
        materias.put(nombreMateria, materia);
    }

    public void mostrarNotas() {
        for (Map.Entry<String, Materia> entry : materias.entrySet()) {
            System.out.println("Materia: " + entry.getKey());
            for (Nota nota : entry.getValue().getNotas()) {
                System.out.println("  - " + nota);
            }
        }
    }

    public void mostrarNotasDe(String nombreMateria) {
        Materia materia = materias.get(nombreMateria);
        if (materia != null) {
            System.out.println("Notas de " + nombreMateria + ":");
            for (Nota nota : materia.getNotas()) {
                System.out.println("  - " + nota);
            }
        } else {
            System.out.println("La materia no existe.");
        }
    }

    public void calcularPromedio(String nombreMateria) {
        Materia materia = materias.get(nombreMateria);
        if (materia != null) {
            System.out.println("Promedio de " + nombreMateria + ": " + materia.calcularPromedio());
        } else {
            System.out.println("La materia no existe.");
        }
    }

    public HashMap<String, Materia> getMaterias() {
        return materias;
    }
}
