package listaDobleGui;

public class ListaDoble<E extends Nombrable> {
    private Nodo<E> inicio, fin, actual;
    private int cantidad = 0;


    public ListaDoble() {
        inicio = null;
        fin = null;
    }

    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return inicio == null;
    }

    // Buscar y mostrar elemento por nombre
    public String buscarYMostrar(String nombre) {
        Nodo<E> actual = inicio;

        while (actual != null) {
            if (actual.getDato().getNombre().equalsIgnoreCase(nombre)) {
                return actual.getDato().toString();
            }
            actual = actual.getSiguiente();
        }

        return "Elemento no encontrado.";
    }

    // Buscar si existe un elemento por nombre
    public boolean buscar(String nombre) {
        Nodo<E> actual = inicio;

        while (actual != null) {
            if (actual.getDato().getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
            actual = actual.getSiguiente();
        }

        return false;
    }

    public boolean quitar(String nombre) {
        Nodo<E> actual = inicio;
        while (actual != null) {
            if (actual.getDato().getNombre().equalsIgnoreCase(nombre)) {
                if (actual == inicio) {
                    inicio = actual.getSiguiente();
                    if (inicio != null) {
                        inicio.setAnterior(null);
                    }
                } else if (actual == fin) {
                    fin = actual.getAnterior();
                    if (fin != null) {
                        fin.setSiguiente(null);
                    }
                } else {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }
                cantidad--;
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public E siguiente() {
        if (actual != null && actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
            return actual.getDato();
        }
        return null; // No hay más nodos
    }

    // Obtener el nodo anterior
    public E anterior() {
        if (actual != null && actual.getAnterior() != null) {
            actual = actual.getAnterior();
            return actual.getDato();
        }
        return null; // No hay más nodos hacia atrás
    }

    // Reiniciar el nodo actual al inicio
    public void resetActual() {
        actual = inicio;
    }

    // Configurar el nodo actual al final
    public void setActualToEnd() {
        actual = fin;
    }


    // Invertir la lista
    public void invertir() {
        Nodo<E> actual = inicio, temp = null;
        fin = inicio;
        while (actual != null) {
            temp = actual.getAnterior();
            actual.setAnterior(actual.getSiguiente());
            actual.setSiguiente(temp);
            actual = actual.getAnterior();
        }
        if (temp != null) {
            inicio = temp.getAnterior();
        }
    }

    // Vaciar la lista
    public void vaciar() {
        inicio = fin = null;
        cantidad = 0;
    }

    // Obtener el primero
    public E primero() {
        return (inicio != null) ? inicio.getDato() : null;
    }

    // Obtener el último
    public E ultimo() {
        return (fin != null) ? fin.getDato() : null;
    }



    // Obtener la cantidad de elementos
    public int cantidad() {
        return cantidad;
    }



    // Agregar un elemento de forma ordenada
    public boolean agregarElemento(E elemento) {
        if (buscar(elemento.getNombre())) {
            return false; // El elemento ya existe
        }

        Nodo<E> nuevo = new Nodo<>(elemento);

        if (estaVacia()) {
            inicio = fin = nuevo;
            cantidad++;
            return true;
        }

        Nodo<E> actual = inicio;

        // Insertar al inicio
        if (elemento.getNombre().compareToIgnoreCase(inicio.getDato().getNombre()) < 0) {
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
            cantidad++;
            return true;
        }

        // Recorrer para encontrar la posición correcta
        while (actual.getSiguiente() != null &&
                elemento.getNombre().compareToIgnoreCase(actual.getDato().getNombre()) > 0) {
            actual = actual.getSiguiente();
        }

        // Insertar al final o en el medio
        if (actual.getSiguiente() == null) {
            actual.setSiguiente(nuevo);
            nuevo.setAnterior(actual);
            fin = nuevo;
        } else {
            nuevo.setSiguiente(actual.getSiguiente());
            nuevo.setAnterior(actual);
            actual.getSiguiente().setAnterior(nuevo);
            actual.setSiguiente(nuevo);
        }

        cantidad++;
        return true;
    }


    public interface Nombrable {
        String getNombre();
    }

    // Imprimir la lista
    public String imprimirLista() {
        Nodo<E> actual = inicio;
        StringBuilder resultado = new StringBuilder();

        while (actual != null) {
            resultado.append("[").append(actual.getDato()).append("]\n");
            actual = actual.getSiguiente();
        }

        return resultado.toString();
    }

    // Modificar un elemento existente
    public boolean modificarElemento(E nuevoDato) {
        Nodo<E> actual = inicio;

        while (actual != null) {
            if (actual.getDato().getNombre().equalsIgnoreCase(nuevoDato.getNombre())) {
                actual.setDato(nuevoDato);
                return true; // Modificación exitosa
            }
            actual = actual.getSiguiente();
        }

        return false; // Elemento no encontrado
    }
}
