// ARELY SINAI MUÑOZ TAPIA
// AXEL JOSUE HERNANDEZ ZAMBRANO

package listaSimpleGeneric;

// E hace que la clase nodo pueda usarse para un objeto que no se ha especificado
public class Nodo <E> {
    public E dato;
    public Nodo siguiente;
    public Nodo anterior;

    public Nodo(E dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
