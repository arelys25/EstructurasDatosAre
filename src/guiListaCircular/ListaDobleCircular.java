package guiListaCircular;

public class ListaDobleCircular {
    public NodoListaDobleCircular primero, ultimo, actual;

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
        } else {
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = ultimo;
            ultimo = nuevo;
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

        } else {
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = ultimo;
            ultimo = nuevo;
        }

    }

}
