package guiListaCircular;

public class ListaDobleCircular {
    public NodoListaDobleCircular primero, ultimo, actual;

    public int cantidad = 0;
    public ListaDobleCircular () {
        primero = null;
        ultimo = null;
    }

    public boolean estaVacia (){
        // si esta vacia, va a retornar null
        return primero == null;
    }

    public String mostrarElementos (){
        String concatena = "";
        if (!estaVacia()){
            actual = primero;

            do {
                concatena = concatena + "["+actual.dato + "]\n";
                actual = actual.siguiente;
            } while (actual != primero);
        }

        return concatena;
    }

    public void ingresarInicio(Libro libro) {
        NodoListaDobleCircular nuevo = new NodoListaDobleCircular(libro);

        nuevo.dato = libro;

        if(!estaVacia()){ // si la lista no esta vacia
            nuevo.siguiente = primero;       // El nuevo nodo apunta al antiguo primero
            nuevo.anterior = ultimo;         // El nuevo nodo apunta al último nodo
            primero.anterior = nuevo;        // El antiguo primero apunta hacia atrás al nuevo nodo
            ultimo.siguiente = nuevo;        // El último nodo apunta hacia adelante al nuevo nodo
            primero = nuevo;                 // El nuevo nodo se convierte en el primero

            cantidad ++;
        } else {
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = ultimo;
            ultimo = nuevo;

            cantidad ++;
        }

    }

    public void ingresarFinal (Libro libro){
        NodoListaDobleCircular nuevo = new NodoListaDobleCircular(libro);

        nuevo.dato = libro;

        if(!estaVacia()){ // si la lista no esta vacia
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
            primero.anterior = ultimo;

            cantidad ++;

        } else {
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = ultimo;
            ultimo = nuevo;

            cantidad ++;
        }

    }

    public boolean ingresarEnPosicion (Libro libro, int posicion){
        NodoListaDobleCircular nuevo = new NodoListaDobleCircular(libro);

        nuevo.dato = libro;

        if (primero == null && posicion == 0){
            primero = ultimo = nuevo;
            primero.siguiente = primero;
            primero.anterior = ultimo;
            ultimo.siguiente = primero;
            cantidad ++;
            return true;
        }

        if (posicion == 0){
            ingresarInicio(libro);
            return true;
        } else if (posicion == cantidad) { // si es la ultima posicion
            ingresarFinal(libro);
            return true;
        } else {
            int contador = 0;

            actual = primero;

            // buscar la posicion del usuario
            while (contador < posicion -1){
                actual = actual.siguiente;
                contador ++;
            }

            // insertar el nuevo nodo entre 'actual' y 'actual.siguiente'
            nuevo.siguiente = actual.siguiente;
            nuevo.anterior = actual;
            actual.siguiente.anterior = nuevo; // ajustar el enlace hacia atras del siguiente nodo
            actual.siguiente = nuevo;

            cantidad ++;
            return true;
        }
    }

    public Libro eliminarInicio(){
        if (estaVacia()) { // si la lista esta vacia
            return null;
        }

        Libro libro = primero.dato;

        if (primero == ultimo) { // si hay un solo elemento en la lista
            primero = ultimo = null;
            cantidad --;
            return libro;
        } else { // si hay mas de un elemento en la lista
            primero = primero.siguiente;
            primero.anterior = ultimo;
            ultimo.siguiente = primero;

            cantidad --;
            return libro;
        }
    }

    public Libro primeroFuncion(){
        if (estaVacia()) {
            return null;
        }
        return primero.dato;

    }
    public Libro quitarFinal(){
        if (estaVacia()) { // si la lista esta vacia
            return null;
        }

        Libro libro = ultimo.dato;

        if (ultimo == primero) { // si hay un solo elemento en la lista
            ultimo = primero = null;
            cantidad --;
            return libro;
        } else { // si hay mas de un elemento en la lista
            ultimo = null;

            cantidad --;
            return libro;
        }
    }

    public Libro siguienteFuncion(){
        if (estaVacia()) {
            return null; // La lista está vacía
        }

        // Si estamos en el último nodo, volver al primero
        if (actual == null) {
            actual = primero; // Si no se ha inicializado, comenzamos desde el primero
        }

        actual = actual.siguiente; // Avanzar al siguiente nodo

        // Si después de avanzar estamos de vuelta en el primero
        if (actual == primero) {
            return primero.dato; // retornar el dato del primero para que sea un ciclo
        }

        return actual.dato; // Retornar el dato del nodo actual
    }

    public int getCantidad (){
        return cantidad;
    }
}
