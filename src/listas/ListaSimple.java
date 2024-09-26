package listas;

import colas.Trabajo;

public class ListaSimple {
    private Nodo inicio,aux;
    private int cantidad;
    private boolean vacia;

    // constructor vacio
    public ListaSimple () {
        // establecer los valores iniciales (por default)
        vacia = true;
        cantidad = 0;
    }

    // METODOS

    public boolean agregar (Trabajo libro){
        Nodo nuevo = new Nodo(libro);
        if (inicio == null) { // cuando esta vacia la lista
            inicio = nuevo;
            cantidad ++;
            return true;
        } else { // cuando ya hay elementos en la lista
            // recorrido de nodos
            aux = inicio;
            while (aux.siguiente != null){
                aux = aux.siguiente;
            }

            aux.siguiente = nuevo;
            cantidad ++;
            return true;
        }
        // return false;
    }

    public boolean agregarEnPosicion (Trabajo libro, int posicion) {
        Nodo nuevo = new Nodo(libro);

        // si la lista esta vacia y el usuario quiere agregar en la posicion 1
        if (inicio == null && posicion == 0){
            inicio = nuevo;
            cantidad ++;
            return true; // se sale del metodo
        }

        // agregar al inicio en caso de que no este vacia la fila
        if (posicion == 0){
            nuevo.siguiente = inicio;
            inicio = nuevo;
            cantidad ++;
            return true; // sale del metodo
        }

        aux = inicio;
        int contador = 0;

        // buscar el lugar que introdujo el usuario
        while (aux != null && contador < posicion -1) {
            aux = aux.siguiente;
            contador++;
        }

        // si encontramos el lugar que pidio el usuario y esta vacio, crearemos el objeto
        if (aux != null){
            nuevo.siguiente = aux.siguiente;
            aux.siguiente = nuevo;
            cantidad ++;
            return true;
        }

        // si la posicion es mayor que la longitud de la lista actual, no se podra agregar
        return false;
    }

    public Trabajo quitar (){ // quita el ultimo elemento de la fila
        if (inicio == null) { // La lista está vacía
            return null;
        }

        if (inicio.siguiente == null) { // Solo hay un elemento en la lista
            Trabajo libro = inicio.dato;
            inicio = null; // Vaciar la lista porque solo hay un elemento
            cantidad--;
            return libro;
        }

        // Si hay más de un elemento
        aux = inicio;
        while (aux.siguiente.siguiente != null) { // Encontrar el penultimo nodo
            aux = aux.siguiente;
        }

        Trabajo libro = aux.siguiente.dato; // El ultimo libro
        aux.siguiente = null; // Eliminar el último nodo
        cantidad--;
        return libro;

    }

    public String mostrarLibros (){
        aux = inicio;
        String libros = "";
        while (aux != null){
            libros += aux.dato+"\n";
            aux = aux.siguiente;
        }
        return libros;
    }

    public Trabajo quitarEnPosicion (int posicion){
        return null;
    }

    public void vaciar (){

    }

    public int getCantidad(){
        return cantidad;
    }

    public boolean estaVacia(){
        return false;
    }

}
