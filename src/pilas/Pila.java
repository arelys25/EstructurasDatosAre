package pilas;

public interface Pila {
    void apilar (URL url);

    void desapilar ();

    URL obtener();

    int longitud ();

    boolean vacia ();
}

