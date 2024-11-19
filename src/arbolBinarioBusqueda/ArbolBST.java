package arbolBinarioBusqueda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ArbolBST<E extends Nombrable & Comparable<E>> {
    private NodoBST<E> raiz;

    public ArbolBST() {
        this.raiz = null;
    }

    public boolean isEmpty(){
        return raiz == null;
    }
    public void insertar(E element){
        NodoBST<E> nuevo = new NodoBST<>(element);

        if (isEmpty()){
            raiz = nuevo;
        } else {
            insertarRecursivo(raiz, nuevo);
        }
    }

    public void insertarRecursivo(NodoBST<E> nodoActual, NodoBST<E> nuevo){
        if (nuevo.getDato().getNombre().compareToIgnoreCase(nodoActual.getDato().getNombre()) < 0) {
            if (nodoActual.getIzq() == null) {
                nodoActual.setIzq(nuevo);
            } else {
                insertarRecursivo(nodoActual.getIzq(), nuevo);
            }
        } else if (nuevo.getDato().getNombre().compareToIgnoreCase(nodoActual.getDato().getNombre()) > 0) {
            if (nodoActual.getDcho() == null) {
                nodoActual.setDcho(nuevo);
            } else {
                insertarRecursivo(nodoActual.getDcho(), nuevo);
            }
        }
    }

    public E buscar(String nombre) {
        return buscarRecursivo(raiz, nombre);  // Devolvemos el resultado de la búsqueda recursiva
    }

    public E buscarRecursivo(NodoBST<E> nodoActual, String nombre) {
        if (nodoActual == null) {
            return null;  // Si el nodo es null, no encontramos la ciudad
        }

        if (nodoActual.getDato().getNombre().equalsIgnoreCase(nombre)) {
            return nodoActual.getDato();  // Si encontramos la ciudad, devolvemos los datos
        } else if (nombre.compareToIgnoreCase(nodoActual.getDato().getNombre()) < 0) {
            return (E) buscarRecursivo(nodoActual.getIzq(), nombre);  // Buscamos en el subárbol izquierdo
        } else {
            return (E) buscarRecursivo(nodoActual.getDcho(), nombre);  // Buscamos en el subárbol derecho
        }
    }

    public void preOrden() {
        preOrdenRecursivo(raiz, 0);
    }

    private void preOrdenRecursivo(NodoBST<E> nodo, int nivel) {
        if (nodo != null) {
            // Agregar tab según el nivel actual
            System.out.println("\t".repeat(nivel) + nodo.getDato());
            preOrdenRecursivo(nodo.getIzq(), nivel + 1);  // Subárbol izquierdo, incrementa el nivel
            preOrdenRecursivo(nodo.getDcho(), nivel + 1); // Subárbol derecho, incrementa el nivel
        }
    }

    public void inOrden() {
        inOrdenRecursivo(raiz, 0);
    }

    private void inOrdenRecursivo(NodoBST<E> nodo, int nivel) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.getIzq(), nivel + 1);
            System.out.println("\t".repeat(nivel) + nodo.getDato());
            inOrdenRecursivo(nodo.getDcho(), nivel + 1);
        }
    }

    public void postOrden() {
        postOrdenRecursivo(raiz, 0);
    }

    private void postOrdenRecursivo(NodoBST<E> nodo, int nivel) {
        if (nodo != null) {
            postOrdenRecursivo(nodo.getIzq(), nivel + 1);
            postOrdenRecursivo(nodo.getDcho(), nivel + 1);
            System.out.println("\t".repeat(nivel) + nodo.getDato());
        }
    }

    public void eliminar(String nombre) {
        raiz = eliminarRecursivo(raiz, nombre);
    }

    private NodoBST<E> eliminarRecursivo(NodoBST<E> nodo, String nombre) {
        if (nodo == null) {
            return null;
        }

        if (nombre.compareToIgnoreCase(nodo.getDato().getNombre()) < 0) {
            nodo.setIzq(eliminarRecursivo(nodo.getIzq(), nombre));
        } else if (nombre.compareToIgnoreCase(nodo.getDato().getNombre()) > 0) {
            nodo.setDcho(eliminarRecursivo(nodo.getDcho(), nombre));
        } else {
            if (nodo.getIzq() == null) {
                return nodo.getDcho();
            } else if (nodo.getDcho() == null) {
                return nodo.getIzq();
            }

            NodoBST<E> sucesor = obtenerSucesor(nodo.getDcho());
            nodo.setDato(sucesor.getDato());
            nodo.setDcho(eliminarRecursivo(nodo.getDcho(), sucesor.getDato().getNombre()));
        }

        return nodo;
    }

    private NodoBST<E> obtenerSucesor(NodoBST<E> nodo) {
        while (nodo.getIzq() != null) {
            nodo = nodo.getIzq();
        }
        return nodo;
    }

    public void balancear() {
        // ArrayList implementa a una lista dinamica sin tamaño en espoecifico
        ArrayList<NodoBST<E>> nodos = new ArrayList<>();
        almacenarEnOrden(raiz, nodos);
        raiz = crearArbolBalanceado(nodos, 0, nodos.size() - 1);
    }

    private void almacenarEnOrden(NodoBST<E> nodo, ArrayList<NodoBST<E>> nodos) {
        if (nodo != null) {
            almacenarEnOrden(nodo.getIzq(), nodos);
            nodos.add(nodo);
            almacenarEnOrden(nodo.getDcho(), nodos);
        }
    }

    private NodoBST<E> crearArbolBalanceado(ArrayList<NodoBST<E>> nodos, int inicio, int fin) {
        if (inicio > fin) {
            return null;
        }

        int medio = (inicio + fin) / 2;
        NodoBST nodoBalanceado = nodos.get(medio);
        nodoBalanceado.setIzq(crearArbolBalanceado(nodos, inicio, medio - 1));
        nodoBalanceado.setDcho(crearArbolBalanceado(nodos, medio + 1, fin));

        return nodoBalanceado;
    }

    public int amplitud() {
        if (raiz == null) return 0; // Si el árbol está vacío, la amplitud es 0

        // Cola para el recorrido por niveles
        Queue<NodoBST> cola = new LinkedList<>();
        cola.offer(raiz); // Agrega la raíz a la cola

        int amplitudMaxima = 0;

        // Recorrido por niveles
        while (!cola.isEmpty()) {
            int nodosNivel = cola.size(); // Número de nodos en el nivel actual
            amplitudMaxima = Math.max(amplitudMaxima, nodosNivel); // Calcula la amplitud máxima

            // Procesar todos los nodos del nivel actual
            for (int i = 0; i < nodosNivel; i++) {
                NodoBST nodo = cola.poll();
                if (nodo.getIzq() != null) {
                    cola.offer(nodo.getIzq());
                }
                if (nodo.getDcho() != null) {
                    cola.offer(nodo.getDcho());
                }
            }
        }
        return amplitudMaxima; // Retorna la amplitud máxima
    }

    public int profundidad() {
        return calcularProfundidad(raiz);
    }

    private int calcularProfundidad(NodoBST<E> nodo) {
        if (nodo == null) {
            return 0;
        }

        int izqProfundidad = calcularProfundidad(nodo.getIzq());
        int dchoProfundidad = calcularProfundidad(nodo.getDcho());

        // devuelve el valor máximo entre las dos profundidades (izquierda y derecha). +1 representa el nivel adicional que el nodo actual agrega a la profundidad total, porque estamos contando la profundidad desde el nodo actual.
        return Math.max(izqProfundidad, dchoProfundidad) + 1;
    }

    public void vaciar() {
        raiz = null;
    }

    public NodoBST<E> getRaiz() {
        return raiz;
    }

}
