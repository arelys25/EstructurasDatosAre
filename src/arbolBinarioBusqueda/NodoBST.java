package arbolBinarioBusqueda;

public class NodoBST {
    public Ciudad dato;
    public NodoBST izq;
    public NodoBST dcho;

    public NodoBST(Ciudad dato) {
        this.dato = dato;
        this.izq = null;
        this.dcho = null;
    }

    public Ciudad getDato() {
        return dato;
    }

    public void setDato(Ciudad dato) {
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
