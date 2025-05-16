package admintareas;

public class NodoArbol {
    String nombre;
    NodoArbol izquierda, derecha;

    public NodoArbol(String nombre) {
        this.nombre = nombre;
        this.izquierda = null;
        this.derecha = null;
    }
}
