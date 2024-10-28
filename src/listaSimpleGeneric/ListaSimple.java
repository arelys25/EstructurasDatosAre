package listaSimpleGeneric;

import colas.Trabajo;
//import listas.Nodo;

public class ListaSimple <E>{
    private Nodo <E> inicio,aux;
    private int cantidad;
    private boolean vacia;

    // constructor vacio
    public ListaSimple() {
        // establecer los valores iniciales (por default)
        vacia = true;
        cantidad = 0;
    }

    // METODOS

    public boolean agregar (E element){
        Nodo<E> nuevo = new Nodo<E>(element);
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

    public boolean agregarEnPosicion (E element, int posicion) {
        Nodo<E> nuevo = new Nodo<E>(element);

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

    public E quitar (){ // quita el ultimo elemento de la fila
        if (inicio == null) { // La lista está vacía
            return null;
        }

        if (inicio.siguiente == null) { // Solo hay un elemento en la lista
            E element = inicio.dato;
            inicio = null; // Vaciar la lista porque solo hay un elemento
            cantidad--;
            return element;
        }

        // Si hay más de un elemento
        aux = inicio;
        while (aux.siguiente.siguiente != null) { // Encontrar el penultimo nodo
            aux = aux.siguiente;
        }

        E element = (E) aux.siguiente.dato; // El ultimo libro
        aux.siguiente = null; // Eliminar el último nodo
        cantidad--;
        return element;

    }

    public String mostrarLibros (){
        aux = inicio;
        String elements = "";
        while (aux != null){
            elements += aux.dato+"\n";
            aux = aux.siguiente;
        }
        return elements;
    }

    public E quitarEnPosicion(int posicion) {
        if (inicio == null) { // La lista está vacía
            return null;
        }

        if (posicion == 0) { // Si se quiere eliminar el primer nodo
            E element = inicio.dato;
            inicio = inicio.siguiente; // Mover el inicio al siguiente nodo
            cantidad--;
            return element;
        }

        aux = inicio;
        int contador = 0;

        // Buscar el nodo anterior al que se quiere eliminar
        while (aux != null && contador < posicion - 1) {
            aux = aux.siguiente;
            contador++;
        }

        if (aux == null || aux.siguiente == null) { // Si la posición no es válida
            return null;
        }

        E element = (E) aux.siguiente.dato; // Obtener el libro a eliminar
        aux.siguiente = aux.siguiente.siguiente; // Saltar el nodo a eliminar
        cantidad--;
        return element; // Retornar el libro eliminado
    }

    public void vaciar (){
        inicio = null; // Reiniciar el inicio para vaciar la lista
        cantidad = 0; // Establecer la cantidad a 0
        System.out.println("Lista vaciada\n");
    }

    public int getCantidad(){
        return cantidad;
    }

    public boolean estaVacia(){
        return false;
    }

}

