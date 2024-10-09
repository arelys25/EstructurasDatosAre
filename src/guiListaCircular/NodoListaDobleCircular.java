package guiListaCircular;

public class NodoListaDobleCircular {

    public LibroListaDobleCircular dato;

    public NodoListaDobleCircular siguiente;

    public NodoListaDobleCircular anterior;

    public NodoListaDobleCircular (LibroListaDobleCircular dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
