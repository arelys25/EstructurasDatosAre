package listaCircularGeneric;

public class NodoListaDobleCircular<E> {

    public E dato;

    public NodoListaDobleCircular siguiente;

    public NodoListaDobleCircular anterior;

    public NodoListaDobleCircular (E dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
