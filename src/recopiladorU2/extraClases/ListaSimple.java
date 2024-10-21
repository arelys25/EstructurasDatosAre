package recopiladorU2.extraClases;

public class ListaSimple {
    private Nodo inicio;
    private Nodo aux;
    private int cantidad;

    // Constructor vacío
    public ListaSimple() {
        inicio = null;
        cantidad = 0;
    }

    // Métodos

    public boolean agregar(Trabajo libro) {
        Nodo nuevo = new Nodo(libro);
        if (inicio == null) { // Cuando está vacía la lista
            inicio = nuevo;
            cantidad++;
            return true;
        } else { // Cuando ya hay elementos en la lista
            aux = inicio;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
            cantidad++;
            return true;
        }
    }

    public boolean agregarEnPosicion(Trabajo libro, int posicion) {
        Nodo nuevo = new Nodo(libro);

        // Si la lista está vacía y el usuario quiere agregar en la posición 0
        if (inicio == null && posicion == 0) {
            inicio = nuevo;
            cantidad++;
            return true;
        }

        // Agregar al inicio en caso de que no esté vacía la lista
        if (posicion == 0) {
            nuevo.siguiente = inicio;
            inicio = nuevo;
            cantidad++;
            return true;
        }

        aux = inicio;
        int contador = 0;

        // Buscar el lugar que introdujo el usuario
        while (aux != null && contador < posicion - 1) {
            aux = aux.siguiente;
            contador++;
        }

        // Si encontramos el lugar que pidió el usuario
        if (aux != null) {
            nuevo.siguiente = aux.siguiente;
            aux.siguiente = nuevo;
            cantidad++;
            return true;
        }

        // Si la posición es mayor que la longitud de la lista actual, no se podrá agregar
        return false;
    }

    public Trabajo quitar() { // Quita el último elemento de la lista
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
        while (aux.siguiente.siguiente != null) { // Encontrar el penúltimo nodo
            aux = aux.siguiente;
        }

        Trabajo libro = aux.siguiente.dato; // El último libro
        aux.siguiente = null; // Eliminar el último nodo
        cantidad--;
        return libro;
    }

    public String mostrarLibros() {
        aux = inicio;
        StringBuilder libros = new StringBuilder();
        while (aux != null) {
            libros.append(aux.dato.toString()).append("\n"); // Usa el toString() de Trabajo
            aux = aux.siguiente;
        }
        return libros.toString();
    }

    public Trabajo quitarEnPosicion(int posicion) {
        if (inicio == null) { // La lista está vacía
            return null;
        }

        if (posicion == 0) { // Si se quiere eliminar el primer nodo
            Trabajo libro = inicio.dato;
            inicio = inicio.siguiente; // Mover el inicio al siguiente nodo
            cantidad--;
            return libro;
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

        Trabajo libro = aux.siguiente.dato; // Obtener el libro a eliminar
        aux.siguiente = aux.siguiente.siguiente; // Saltar el nodo a eliminar
        cantidad--;
        return libro; // Retornar el libro eliminado
    }

    public void vaciar() {
        inicio = null; // Reiniciar el inicio para vaciar la lista
        cantidad = 0; // Establecer la cantidad a 0
        System.out.println("Lista vaciada\n");
    }

    // Método para insertar al final
    public void insertarFinal(Trabajo libro) {
        Nodo nuevo = new Nodo(libro);
        if (inicio == null) { // Si la lista está vacía
            inicio = nuevo;
        } else {
            aux = inicio;
            while (aux.siguiente != null) { // Recorrer hasta el último nodo
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo; // Agregar el nuevo nodo al final
        }
        cantidad++;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean estaVacia() {
        return cantidad == 0; // Retorna si la lista está vacía
    }

    @Override
    public String toString() {
        return mostrarLibros(); // Usa el método mostrarLibros para la representación de la lista
    }
}
