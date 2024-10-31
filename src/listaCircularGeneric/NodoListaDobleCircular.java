package listaCircularGeneric;

public class NodoListaDobleCircular {

    public Libro dato;

    public NodoListaDobleCircular siguiente;

    public NodoListaDobleCircular anterior;

    public NodoListaDobleCircular (Libro dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
