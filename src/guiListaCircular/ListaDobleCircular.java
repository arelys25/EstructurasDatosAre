package guiListaCircular;

public class ListaDobleCircular {
    private NodoListaDobleCircular inicio;
    private NodoListaDobleCircular fin;
    private NodoListaDobleCircular actual; // Para navegación
    private int cantidad;

    public ListaDobleCircular() {
        this.inicio = null;
        this.fin = null;
        this.actual = null;
        this.cantidad = 0;
    }

    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return inicio == null;
    }

    // Método para mostrar todos los elementos de la lista
    public String mostrarElementos() {
        StringBuilder concatena = new StringBuilder();
        if (!estaVacia()) {
            actual = inicio;
            do {
                concatena.append("[").append(actual.dato.toString()).append("]\n");
                actual = actual.siguiente;
            } while (actual != inicio);
        }
        return concatena.toString();
    }

    // Método para ingresar un libro al inicio
    public void ingresarInicio(Libro libro) {
        NodoListaDobleCircular nuevo = new NodoListaDobleCircular(libro);
        if (!estaVacia()) {
            nuevo.siguiente = inicio;
            nuevo.anterior = fin;
            inicio.anterior = nuevo;
            fin.siguiente = nuevo;
            inicio = nuevo;
        } else {
            inicio = fin = nuevo;
            inicio.siguiente = inicio.anterior = inicio;
        }
        cantidad++;
    }

    // Método para ingresar un libro al final
    public void ingresarFinal(Libro libro) {
        NodoListaDobleCircular nuevo = new NodoListaDobleCircular(libro);
        if (!estaVacia()) {
            nuevo.anterior = fin;
            nuevo.siguiente = inicio;
            fin.siguiente = nuevo;
            inicio.anterior = nuevo;
            fin = nuevo;
        } else {
            inicio = fin = nuevo;
            inicio.siguiente = inicio.anterior = inicio;
        }
        cantidad++;
    }

    // Método para ingresar un libro en una posición específica
    public boolean ingresarEnPosicion(Libro libro, int posicion) {
        if (posicion < 0 || posicion > cantidad) return false;
        if (posicion == 0) {
            ingresarInicio(libro);
            return true;
        } else if (posicion == cantidad) {
            ingresarFinal(libro);
            return true;
        } else {
            NodoListaDobleCircular nuevo = new NodoListaDobleCircular(libro);
            NodoListaDobleCircular actual = inicio;
            for (int i = 0; i < posicion - 1; i++) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = actual.siguiente;
            nuevo.anterior = actual;
            actual.siguiente.anterior = nuevo;
            actual.siguiente = nuevo;
            cantidad++;
            return true;
        }
    }

    // Método para eliminar el primer libro
    public Libro eliminarInicio() {
        if (estaVacia()) return null;
        Libro libro = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = fin;
            fin.siguiente = inicio;
        }
        cantidad--;
        return libro;
    }

    // Método para eliminar el último libro
    public Libro eliminarFinal() {
        if (estaVacia()) return null;
        Libro libro = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            fin = fin.anterior;
            fin.siguiente = inicio;
            inicio.anterior = fin;
        }
        cantidad--;
        return libro;
    }

    // Método para eliminar un libro en una posición específica
    public Libro eliminarEnPosicion(int posicion) {
        if (posicion < 0 || posicion >= cantidad) return null;
        if (posicion == 0) return eliminarInicio();
        if (posicion == cantidad - 1) return eliminarFinal();

        NodoListaDobleCircular actual = inicio;
        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }
        actual.anterior.siguiente = actual.siguiente;
        actual.siguiente.anterior = actual.anterior;
        cantidad--;
        return actual.dato;
    }

    // Método para modificar un libro en una posición específica
    public boolean modificar(int posicion, Libro nuevoLibro) {
        if (posicion < 0 || posicion >= cantidad) return false;
        NodoListaDobleCircular actual = inicio;
        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }
        actual.dato = nuevoLibro;
        return true;
    }

    // Método para vaciar la lista
    public void vaciar() {
        inicio = null;
        fin = null;
        cantidad = 0;
    }

    // Método para destruir la lista
    public void destruir() {
        vaciar();
    }

    // Método para obtener el primer libro
    public Libro primeroFuncion() {
        if (estaVacia()) return null;
        return inicio.dato;
    }

    // Método para obtener el libro anterior en la lista
    public Libro anteriorFuncion() {
        if (fin == null) return null;
        return fin.dato;
    }

    // Método para obtener el último libro
    public Libro ultimoFuncion() {
        if (fin == null) return null;
        return fin.dato;
    }

    // Método para obtener el libro siguiente en la lista
    public Libro siguienteFuncion() {
        if (estaVacia()) return null;
        if (actual == null) {
            actual = inicio;
        } else {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    // Obtener la cantidad de elementos en la lista
    public int getCantidad() {
        return cantidad;
    }
}