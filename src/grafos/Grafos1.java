package grafos;

import arbolBinarioBusqueda.Ciudad;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Grafos1 {

    private static GrafoMatriz matriz;
    private static Ciudad ciudad;
    private static Scanner sc = new Scanner(System.in);
    private static int contVertices = 0;
    private static int numVertices;
    public static void main(String[] args){
        int opc;
        do {
            System.out.println("\nMENU:");
            System.out.println("\n1 - Crear grafo");
            System.out.println("2 - Agregar ciudad al grafo");
            System.out.println("3 - Eliminar ciudad del grafo");
            System.out.println("4 - Agregar conexion entre ciudades");
            System.out.println("5 - Determinar las rutas entre ciudades");
            System.out.println("6 - Encontrar el camino mas corto entre ciudades");
            System.out.println("7 - Mostrar todas las ciudades y conexiones");
            System.out.println("8 - Vaciar el grafo de ciudades");
            System.out.println("9 - Destruir el grafo");
            System.out.println("10 - Salir del programa");
            System.out.println("\nIntroduzca su opción:\n");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    crearGrafo();
                    break;
                case 2:
                    agregarCiudad();
                    break;
                case 3:
                    eliminarCiudad();
                    break;
                case 4:
                    agregarConexion();
                    break;
                case 5:
                    rutas();
                    break;
                case 6:
                    caminoMasCorto();
                    break;
                case 7:
                    mostrarGrafos();
                    break;
                case 8:
                    vaciarGrafo();
                    break;
                case 9:
                    destruirGrafo();
                    break;
                case 10:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opc != 10);

    }

    private static void crearGrafo() {
        if (matriz == null){
            numVertices = 4;
            matriz = new GrafoMatriz(numVertices);
            System.out.println("Grafo creado exitosamente. Tiene espacio para "+numVertices+" vertices.");
        } else {
            System.out.println("El grafo ya ha sido creado.");
        }
    }

    private static void agregarCiudad() {
        if (matriz != null){
            if (contVertices <= numVertices-1) {
                System.out.print("Ingrese el nombre de la ciudad: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese el país de la ciudad: ");
                String pais = sc.nextLine();

                int poblacion = 0;
                boolean poblacionValida = false;

                // Bucle para asegurarse que el usuario ingresa un número válido para la población
                while (!poblacionValida) {
                    try {
                        System.out.print("Ingrese la población de la ciudad: ");
                        poblacion = sc.nextInt();  // Intentar convertir la entrada a entero
                        poblacionValida = true;  // Si no se lanza excepción, la población es válida
                    } catch (InputMismatchException e) {
                        System.out.println("Error: La población debe ser un número entero. Intente de nuevo.");
                        sc.nextLine();  // Limpiar buffer de entrada
                    }
                }

                ciudad = new Ciudad(nombre,pais,poblacion);
                matriz.nuevoVertice(ciudad);
                contVertices ++;

                System.out.println("Ciudad agragada exitosamente.");
            } else {
                System.out.println("Numero maximo de vertices alcanzado.");
            }

        } else {
            System.out.println("Debe crear el grafo primero.");
        }
    }

    private static void eliminarCiudad() {
        if (matriz != null){
            if (contVertices > 0) {
                System.out.println("Ingresa el nombre de la ciudad a eliminar:\n");
                String nombre = sc.nextLine();

                matriz.eliminarCiudad(nombre);
                System.out.println("Ciudad eliminada del grafo exitosamente.");
                contVertices --;
                mostrarGrafos();

            } else {
                System.out.println("No hay vertices.");
            }

        } else {
            System.out.println("Debe crear el grafo primero.");
        }
    }

    private static void agregarConexion(){
        if (matriz != null){
            System.out.println("Ingresa el nombre de la ciudad 1 para hacer la conexion:\n");
            String ciudad1 = sc.nextLine();
            System.out.println("Ingresa el nombre de la ciudad 2 para hacer la conexion:\n");
            String ciudad2 = sc.nextLine();

            matriz.nuevoArco(ciudad1,ciudad2);
            System.out.println("Conexion realizada exitosamente.");
            mostrarGrafos();

        } else {
            System.out.println("Debe crear el grafo primero.");
        }
    }

    private static void rutas() {
        if (matriz != null) {
            System.out.println("Ingresa el nombre de la ciudad 1 para ver la ruta:\n");
            String ciudad1 = sc.nextLine();
            System.out.println("Ingresa el nombre de la ciudad 2 para ver la ruta:\n");
            String ciudad2 = sc.nextLine();

            List<String> ruta = matriz.determinarRuta(ciudad1, ciudad2);
            if (ruta != null) {
                System.out.println("Ruta encontrada: " + String.join(" -> ", ruta)); // Mostrar la ruta
            }
        } else {
            System.out.println("Debe crear el grafo primero.");
        }
    }

    private static void caminoMasCorto() {
        if (matriz != null) {
            System.out.println("Ingresa el nombre de la ciudad 1 para ver la ruta más corta:\n");
            String ciudad1 = sc.nextLine();
            System.out.println("Ingresa el nombre de la ciudad 2 para ver la ruta más corta:\n");
            String ciudad2 = sc.nextLine();

            int distancia = matriz.caminoMasCorto(ciudad1, ciudad2);
            if (distancia != -1) {
                System.out.println("Distancia más corta: " + distancia);
            }
        } else {
            System.out.println("Debe crear el grafo primero.");
        }
    }

    private static void mostrarGrafos() {
        if (matriz != null){
            System.out.println("\nMatriz:");
            matriz.mostrarGrafo();
        } else {
            System.out.println("Debe crear el grafo primero.");
        }
    }

    private static void vaciarGrafo() {
        if (matriz != null){

            matriz.vaciarGrafo();
            contVertices = 0;
            System.out.println("Grafo vaciado correctamente.");
        } else {
            System.out.println("Debe crear el grafo primero.");
        }
    }

    private static void destruirGrafo() {
        if (matriz != null){
            matriz = null;
            System.out.println("Grafo destruido correctamente.");
        } else {
            System.out.println("Debe crear el grafo primero.");
        }
    }
}
