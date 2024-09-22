package colas;

public interface ColaProceso {
    // metodos que vamos a usar

    void encolar (Trabajo t);

    void eliminar ();

    Trabajo obtener ();

    void mostrarCola();

    void  vaciarCola ();

    void destruirCola ();


}
