package grafos;

import arbolBinarioBusqueda.Ciudad;

public class Vertice {

    Ciudad dato;
    int numVertice;

    public Vertice(Ciudad x) {
        dato = x;
        numVertice = -1;
    }

    public String nomVertice(){ // devuelve el nombre del vértice
        return dato.getNombre();
    }

    public boolean equals(Vertice n) { // devuelve true si dos vértices son iguales
        return dato.equals(n.dato);
    }

    public void asigVertice(int n) { // establece el número de vértices
        numVertice = n;
    }

    public String toString() { // caracteristicas del vértice
        return dato + " (" + numVertice + ")";
    }
}
