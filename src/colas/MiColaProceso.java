package colas;

public class MiColaProceso implements  ColaProceso{

    // nodo dentro de la cola de proceso
    private class NodoProceso {
        // puntero de Trabajo
        public Trabajo trabajo;
        // puntero de siguiente
        public NodoProceso siguente;

        public NodoProceso (Trabajo trabajo) {
            this.trabajo = trabajo;
        }
    }

    // crear punteros
    private NodoProceso cabeza,ultimo;

    @Override
    public void encolar(Trabajo t) {
        NodoProceso nuevoNodo = new NodoProceso(t);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            System.out.println("\nLa cola se ha creado con exito");
        } else {
            ultimo.siguente = nuevoNodo;
        }

        ultimo = nuevoNodo;
    }

    @Override
    public void eliminar() {
        if (cabeza != null){
            NodoProceso eliminar = cabeza;
            cabeza = cabeza.siguente;
            eliminar.siguente = null;
            if (cabeza == null) {
                ultimo = null;
                System.out.println("\nLa cola quedo vacia.");
            }
        } else {
            System.out.println("\nLa cola esta vacia, no hay nada que eliminar.");
        }
    }

    @Override
    public Trabajo obtener() {
        if (cabeza == null){
            System.out.println("La cola esta vacia o ha sido destruida");
            return null;
        } else  {
            return cabeza.trabajo;
        }
    }

    @Override
    public void mostrarCola() {
        if (cabeza == null) {
            System.out.println("No existe cola, ya ha sido borrada o destruida.");
        } else {

            System.out.println(toString());
        }
    }

    @Override
    public void vaciarCola() {
        if (cabeza == null) {
            System.out.println("No existe cola, ya ha sido borrada o destruida.");
        } else {
            while (cabeza != null){
                NodoProceso eliminar = cabeza;
                cabeza = cabeza.siguente;
                eliminar.siguente = null;
            }
            System.out.println("La cola ha sido borrada con exito.");
        }
    }

    @Override
    public void destruirCola() {
        if (cabeza == null) {
            System.out.println("No existe cola, ya ha sido borrada o destruida.");
        } else {
            while (cabeza != null){
                NodoProceso eliminar = cabeza;
                cabeza = cabeza.siguente;
                eliminar.siguente = null;
            }
            System.out.println("La cola ha sido borrada con exito.");
        }
    }
}
