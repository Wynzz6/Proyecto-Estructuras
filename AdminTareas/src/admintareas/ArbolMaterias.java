package admintareas;

public class ArbolMaterias {
    private NodoArbol raiz;

    public void insertar(String nombre) {
        raiz = insertarRec(raiz, nombre);
    }

    private NodoArbol insertarRec(NodoArbol actual, String nombre) {
        if (actual == null) return new NodoArbol(nombre);
        if (nombre.compareToIgnoreCase(actual.nombre) < 0)
            actual.izquierda = insertarRec(actual.izquierda, nombre);
        else if (nombre.compareToIgnoreCase(actual.nombre) > 0)
            actual.derecha = insertarRec(actual.derecha, nombre);
        return actual;
    }

    public void mostrarOrdenado() {
        System.out.println("Materias en orden alfabético:");
        mostrarEnOrden(raiz);
    }

    private void mostrarEnOrden(NodoArbol nodo) {
        if (nodo != null) {
            mostrarEnOrden(nodo.izquierda);
            System.out.println("- " + nodo.nombre);
            mostrarEnOrden(nodo.derecha);
        }
    }
}
