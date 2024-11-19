package grafos;

import arbolBinarioBusqueda.Ciudad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrafoMatriz {
    int numVertices;
    Vertice[] verts;
    int[][] matAd;


    public GrafoMatriz(int mx) {
        matAd = new int[mx][mx];
        verts = new Vertice[mx];
        for (int i = 0; i < mx; i++) {
            for (int j = 0; j < mx; j++) {
                matAd[i][j] = 0;
            }
        }
        numVertices = 0;
    }

    // encontrar un vertice
    public int buscarCiudad(String nombreCiudad) {
        for (int i = 0; i < numVertices; i++) {
            if (verts[i] != null && verts[i].nomVertice().equals(nombreCiudad)) {
                return i;
            }
        }
        return -1; // Retorna -1 si no se encuentra la ciudad
    }

    public void eliminarCiudad(String nombreCiudad) {
        int indiceCiudad = buscarCiudad(nombreCiudad);

        if (indiceCiudad == -1) {
            System.out.println("Ciudad no encontrada.");
            return;
        }

        // Eliminar las conexiones en la matriz de adyacencia
        for (int i = 0; i < numVertices; i++) {
            matAd[indiceCiudad][i] = 0;
            matAd[i][indiceCiudad] = 0;
        }

        // Desplazar los vértices para llenar el hueco del vértice eliminado
        for (int i = indiceCiudad; i < numVertices - 1; i++) {
            verts[i] = verts[i + 1];
        }
        verts[numVertices - 1] = null;
        numVertices--;
    }



    // añadir un vertice
    public void nuevoVertice(Ciudad nombre) { // crear nuvo Vértice
        boolean existe = buscarCiudad(nombre.getNombre()) >= 0;
        if (!existe) {
            Vertice v = new Vertice(nombre);
            v.asigVertice(numVertices);
            verts[numVertices++] = v;
        }
    }

    // unir 2 vertices
    public void nuevoArco(String nombreCiudadA, String nombreCiudadB){
        int va = buscarCiudad(nombreCiudadA);
        int vb = buscarCiudad(nombreCiudadB);
        if (va == -1 || vb == -1) System.out.println("Una o ambas ciudades no existen.");
        matAd[va][vb] = 1;
        matAd[vb][va] = 1; // Si el grafo es no dirigido
    }

    // determinar una ruta entre los vertices
    public List<String> determinarRuta(String origenNombre, String destinoNombre) {
        int origen = buscarCiudad(origenNombre);
        int destino = buscarCiudad(destinoNombre);

        if (origen == -1 || destino == -1) {
            System.out.println("Una o ambas ciudades no existen.");
            return null;
        }

        boolean[] visitado = new boolean[numVertices];
        List<String> ruta = new ArrayList<>();
        if (dfs(origen, destino, visitado, ruta)) {
            System.out.println("Ruta encontrada: " + String.join(" -> ", ruta));  // Aquí se imprime la ruta
            return ruta;
        } else {
            System.out.println("No hay ruta entre las ciudades.");
            return null; // No hay ruta entre las dos ciudades
        }
    }

    private boolean dfs(int u, int destino, boolean[] visitado, List<String> ruta) {
        visitado[u] = true;
        ruta.add(verts[u].nomVertice());

        if (u == destino) {
            return true; // Se ha encontrado el destino
        }

        for (int v = 0; v < numVertices; v++) {
            if (!visitado[v] && matAd[u][v] != 0) {
                if (dfs(v, destino, visitado, ruta)) {
                    return true; // Si se encontró la ruta en la recursión
                }
            }
        }

        // Si no se encuentra la ruta, se elimina el vértice de la ruta
        ruta.remove(ruta.size() - 1);
        return false;
    }

    // encontrar camino mas corto
    public int caminoMasCorto(String origenNombre, String destinoNombre) {
        int origen = buscarCiudad(origenNombre);
        int destino = buscarCiudad(destinoNombre);

        if (origen == -1 || destino == -1) {
            System.out.println("Una o ambas ciudades no existen.");
            return Integer.MAX_VALUE; // Devuelve un valor que indica que no se puede alcanzar
        }

        int[] distancia = new int[numVertices];
        boolean[] visitado = new boolean[numVertices];
        Arrays.fill(distancia, Integer.MAX_VALUE);
        distancia[origen] = 0;

        for (int i = 0; i < numVertices; i++) {
            int u = seleccionarVerticeMinDistancia(distancia, visitado);
            if (u == -1) break; // Todos los vértices alcanzables han sido visitados
            visitado[u] = true;

            for (int v = 0; v < numVertices; v++) {
                if (!visitado[v] && matAd[u][v] != 0 &&
                        distancia[u] != Integer.MAX_VALUE &&
                        distancia[u] + matAd[u][v] < distancia[v]) {
                    distancia[v] = distancia[u] + matAd[u][v];
                }
            }
        }

        if (distancia[destino] == Integer.MAX_VALUE) {
            System.out.println("No hay camino posible entre las ciudades.");
            return -1;
        } else {
            System.out.println("Distancia más corta: " + distancia[destino]);
            return distancia[destino];
        }
    }


    private int seleccionarVerticeMinDistancia(int[] distancia, boolean[] visitado) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < numVertices; v++) {
            if (!visitado[v] && distancia[v] <= min) {
                min = distancia[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    public void mostrarGrafo() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(verts[i].toString() + " conectado a: ");
            for (int j = 0; j < numVertices; j++) {
                if (matAd[i][j] != 0) {
                    System.out.print(verts[j].toString() + " ");
                }
            }
            System.out.println();
        }
    }

    public void vaciarGrafo() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                matAd[i][j] = 0;
            }
            verts[i] = null;
        }
        numVertices = 0;

    }


}
