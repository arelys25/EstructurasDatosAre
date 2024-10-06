package listaDobleEnlazada;
import listas.Nodo;
import colas.Trabajo;


public class ListaDobleLibros {

    private Nodo inicio,aux,fin;
    private boolean vacia;
    private int cantidad;

    // constructor vacio qpara añadir los valores por default
    public ListaDobleLibros (){
        inicio = null;
        fin = null;
    }

    // metodo para ver si esta vacia
    public boolean estaVacia (){
        // si la lista esta vacia, va a devolver null
        return inicio == null;
    }

    public void agregarAlInicio(Trabajo libro) {
        Nodo nuevo = new Nodo(libro);

        if (!estaVacia()) {
            nuevo.siguiente = inicio; // El nuevo nodo apunta al inicio actual
            inicio.anterior = nuevo;  // El inicio actual ahora apunta al nuevo nodo como su anterior
            inicio = nuevo;           // El nuevo nodo ahora es el inicio
            cantidad++;
        } else {
            inicio = fin = nuevo;
            cantidad++;
        }

    }

    public void agregarAlFinal (Trabajo libro){
        Nodo nuevo = new Nodo(libro);

        if (!estaVacia()){ //si la lista NO esta vacia...
            nuevo.anterior = fin;   // El nuevo nodo apunta al nodo anterior (fin actual)
            fin.siguiente = nuevo;  // El nodo fin actual apunta al nuevo nodo como siguiente
            fin = nuevo;            // El nuevo nodo es ahora el último nodo (fin)
            cantidad++;

        } else {
            inicio = fin = nuevo;
            cantidad++;
        }
    }

    public boolean agregarPuntoEspecifico(Trabajo libro, int posicion){
        Nodo nuevo = new Nodo(libro);

        // si la lista esta vacia y el usuario quiere introducir el libro en la posicion 0
        if (inicio == null && posicion == 0){
            inicio = fin = nuevo;
            cantidad ++;
            return true;
        }

        // agregar al inicio en caso de que no este vacia la fila
        if (posicion == 0){
            nuevo.siguiente = inicio; // El nuevo nodo apunta al inicio actual
            inicio.anterior = nuevo;  // El inicio actual ahora apunta al nuevo nodo como su anterior
            inicio = nuevo;           // El nuevo nodo ahora es el inicio
            cantidad++;
            return true;
        }

        int contador = 0;
        aux = inicio;

        // buscar el lugar que quiere el usuario
        while (aux!= null && contador < posicion -1){
            aux = aux.siguiente;
            contador ++;
        }

        // si encontramos el lugar que pidio y esta vacio, crearemos el objeto
        if (aux != null){
            nuevo.siguiente = aux.siguiente;
            aux.siguiente = nuevo;
            cantidad ++;
            return true;
        }

        return false; // en caso de que no se haya encontrado su posicion
    }

    // mostrar datos
    public String mostrarLibros (){
        String concatena = "";
        if (!estaVacia()){

            aux = inicio;
            while (aux!= null){
                concatena = concatena +"["+ aux.dato + "]\n";
                aux = aux.siguiente;
            }

        }
        return concatena;
    }

    // eliminar datos del inicio
    public Trabajo eliminarElementoDelInicio (){
        if (inicio == null){ // la lista esta vacia
            return null;
        }

        Trabajo libro = fin.dato;


        if (inicio == fin){ // si hay un solo dato en la lista

            inicio = fin = null;
            cantidad --;
            return libro;

        } else {
            // si hay mas de un elemento en la lista
            inicio = inicio.siguiente;
            inicio.anterior = null;

            cantidad --;
            return libro;
        }

    }
    public Trabajo eliminarElementoFinal() {
        if (inicio == null) { // La lista está vacía
            return null;
        }

        Trabajo libro = fin.dato; // Guarda el dato del nodo a eliminar

        if (inicio == fin) { // Solo hay un elemento en la lista
            inicio = fin = null; // La lista queda vacía
        } else {
            fin = fin.anterior; // Mueve el puntero `fin` al nodo anterior
            fin.siguiente = null; // El nuevo `fin` ahora no tiene siguiente
        }

        cantidad--; // Disminuye la cantidad de elementos
        return libro; // Retorna el libro eliminado
    }


    public int getCantidad (){
        return cantidad;
    }
    public Trabajo eliminarElementoEnPosicion(int posicion) {
        if (posicion < 0 || posicion >= cantidad) {
            return null; // Posición inválida
        }

        if (posicion == 0) {
            return eliminarElementoDelInicio();
        } else if (posicion == cantidad - 1) {
            return eliminarElementoFinal();
        } else {
            aux = inicio;
            for (int i = 0; i < posicion; i++) {
                aux = aux.siguiente;
            }
            Trabajo libro = aux.dato;
            aux.anterior.siguiente = aux.siguiente;
            if (aux.siguiente != null) {
                aux.siguiente.anterior = aux.anterior;
            }
            cantidad--;
            return libro;
        }
    }
    public void modificarElementoEnPosicion(int posicion, Trabajo nuevoTrabajo) {
        if (posicion < 0 || posicion >= cantidad) {
            return; // Posición inválida
        }

        aux = inicio;
        for (int i = 0; i < posicion; i++) {
            aux = aux.siguiente;
        }
        aux.dato = nuevoTrabajo; // Cambia el trabajo en la posición dada
    }
    public void vaciarLista() {
        inicio = fin = null;
        cantidad = 0;
    }

}
