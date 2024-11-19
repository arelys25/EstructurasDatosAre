package arbolBinarioBusqueda;

public class NodoBST<E> {
    public E dato;
    public NodoBST<E> izq;
    public NodoBST<E> dcho;

    public NodoBST(E dato) {
        this.dato = dato;
        this.izq = null;
        this.dcho = null;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public NodoBST getIzq() {
        return izq;
    }

    public void setIzq(NodoBST izq) {
        this.izq = izq;
    }

    public NodoBST getDcho() {
        return dcho;
    }

    public void setDcho(NodoBST dcho) {
        this.dcho = dcho;
    }
}
