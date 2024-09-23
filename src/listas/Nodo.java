package listas;

import colas.Trabajo;

public class Nodo {
    public Trabajo dato;
    public Nodo siguiente;

    public Nodo(Trabajo dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
