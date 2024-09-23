package colas;

public class MiColaProceso implements ColaProceso {

    private class NodoProceso {
        public Trabajo trabajo;
        public NodoProceso siguiente;

        public NodoProceso(Trabajo trabajo) {
            this.trabajo = trabajo;
        }
    }

    private NodoProceso cabeza, ultimo;

    @Override
    public void encolar(Trabajo t) {
        NodoProceso nuevoNodo = new NodoProceso(t);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            ultimo = nuevoNodo; // Asegúrate de asignar también el último
            System.out.println("\nLa cola se ha creado con éxito.");
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo; // Actualiza el último nodo
        }
    }

    @Override
    public void eliminar() {
        if (cabeza != null) {
            NodoProceso eliminar = cabeza;
            cabeza = cabeza.siguiente;
            eliminar.siguiente = null;
            if (cabeza == null) {
                ultimo = null;
                System.out.println("\nLa cola quedó vacía.");
            }
        } else {
            System.out.println("\nLa cola está vacía, no hay nada que eliminar.");
        }
    }

    @Override
    public Trabajo obtener() {
        if (cabeza == null) {
            System.out.println("La cola está vacía o ha sido destruida.");
            return null;
        } else {
            return cabeza.trabajo;
        }
    }

    @Override
    public void mostrarCola() {
        if (cabeza == null) {
            System.out.println("No existe cola, ya ha sido borrada o destruida.");
        } else {
            NodoProceso actual = cabeza;
            while (actual != null) {
                System.out.println(actual.trabajo);
                actual = actual.siguiente;
            }
        }
    }

    @Override
    public void vaciarCola() {
        if (cabeza == null) {
            System.out.println("No existe cola, ya ha sido borrada o destruida.");
        } else {
            while (cabeza != null) {
                eliminar();
            }
            System.out.println("La cola ha sido borrada con éxito.");
        }
    }

    @Override
    public void destruirCola() {
        vaciarCola(); // Llama al método vaciarCola
    }
}
