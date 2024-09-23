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
            return true;
        } else { // cuando ya hay elementos en la lista
            // recorrido de nodos
            aux = inicio;
            while (aux.siguiente != null){
                aux = aux.siguiente;
            }

            aux.siguiente = nuevo;
            return true;
        }
        // return false;
    }

    public boolean agregarEnPosicion (Trabajo l, int posicion){
        return false;
    }

    public Trabajo quitar (){ // quita el ultimo elemento de la fila
        if (inicio == null){
            return null;
        } else {
            aux = inicio;
            while (aux.siguiente != null){
                aux = aux.siguiente;
            }

            Nodo quitado = aux.siguiente;
            aux.siguiente = null;
            return quitado.dato;

        }
    }

    public Trabajo quitarEnPosicion (int posicion){
        return null;
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

    public void vaciar (){

    }

    public int getCantidad(){
        return cantidad;
    }

    public boolean estaVacia(){
        return false;
    }

}
