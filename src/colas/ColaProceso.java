package colas;


public interface ColaProceso {
    // metodos que vamos a usar

    void encolar (Trabajo t);

    void eliminar ();

    String obtener ();

    String mostrarCola();

    void  vaciarCola ();

    void destruirCola ();

}
