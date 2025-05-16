package admintareas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Agenda {
    private Queue<Recordatorio> recordatorios;
    private Stack<Recordatorio> historial;

    public Agenda() {
        recordatorios = new LinkedList<>();
        historial = new Stack<>();
    }

    public void agregarRecordatorio(Recordatorio r) {
        recordatorios.add(r);
        historial.push(r);
    }

    public void mostrarRecordatorios() {
        if (recordatorios.isEmpty()) {
            System.out.println("No hay recordatorios.");
        } else {
            System.out.println("Recordatorios:");
            for (Recordatorio r : recordatorios) {
                System.out.println("- " + r);
            }
        }
    }

    public void mostrarUltimoAgregado() {
        if (!historial.isEmpty()) {
            System.out.println("Último recordatorio agregado: " + historial.peek());
        }
    }
}
