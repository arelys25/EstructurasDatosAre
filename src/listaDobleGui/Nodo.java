package listaDobleGui;

public class Nodo<E> {
    public E dato;
    public Nodo siguiente;
    public Nodo anterior;

    public Nodo(E dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
