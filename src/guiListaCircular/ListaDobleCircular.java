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
            cantidad ++;
            return true;
        }

        if (posicion == 0){
            nuevo.siguiente = primero;       // El nuevo nodo apunta al antiguo primero
            nuevo.anterior = ultimo;         // El nuevo nodo apunta al último nodo
            primero.anterior = nuevo;        // El antiguo primero apunta hacia atrás al nuevo nodo
            ultimo.siguiente = nuevo;        // El último nodo apunta hacia adelante al nuevo nodo
            primero = nuevo;                 // El nuevo nodo se convierte en el primero

            cantidad ++;
            return true;
        }

        int contador = 0;

        actual = primero;

        // buscar la posicion del usuario
        do {
            actual = actual.siguiente;
            contador ++;

        } while (actual != primero && contador < posicion -1);

        // si encontramos la posicion del usuario
        if (actual != null) {
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;

            cantidad ++;
            return true;
        }

        return false; // por si no se encontro la posicion ingrsada por el usuario
    }

    public int getCantidad (){
        return cantidad;
    }
}
