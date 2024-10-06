// ARELY SINAI MUÑOZ TAPIA
// AXEL JOSUE HERNANDEZ ZAMBRANO

package listas;

import colas.Trabajo;

public class Nodo {
    public Trabajo dato;
    public Nodo siguiente;
    public Nodo anterior;

    public Nodo(Trabajo dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
