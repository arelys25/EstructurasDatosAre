package arbolBinarioBusqueda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestArbolBST {
    private static ArbolBST arbol = null;  // Instancia del árbol de ciudades
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Crear un nuevo árbol de ciudades.");
            System.out.println("2. Agregar una nueva ciudad al árbol.");
            System.out.println("3. Eliminar una ciudad del árbol.");
            System.out.println("4. Balancear el árbol.");
            System.out.println("5. Buscar una ciudad en el árbol.");
            System.out.println("6. Mostrar todas las ciudades en orden.");
            System.out.println("7. Mostrar todas las ciudades en preorden.");
            System.out.println("8. Mostrar todas las ciudades en postorden.");
            System.out.println("9. Calcular la amplitud del árbol.");
            System.out.println("10. Calcular la profundidad del árbol.");
            System.out.println("11. Vaciar el árbol de ciudades.");
            System.out.println("12. Destruir el árbol.");
            System.out.println("13. Salir.");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar buffer de entrada

            switch (opcion) {
                case 1:
                    crearArbol();
                    break;
                case 2:
                    agregarCiudad();
                    break;
                case 3:
                    eliminarCiudad();
                    break;
                case 4:
                    balancearArbol();
                    break;
                case 5:
                    buscarCiudad();
                    break;
                case 6:
                    mostrarInOrden();
                    break;
                case 7:
                    mostrarPreOrden();
                    break;
                case 8:
                    mostrarPostOrden();
                    break;
                case 9:
                    calcularAmplitud();
                    break;
                case 10:
                    calcularProfundidad();
                    break;
                case 11:
                    vaciarArbol();
                    break;
                case 12:
                    destruirArbol();
                    break;
                case 13:
                    System.out.println("¡Chao!");
                    break;
                default:
                    System.out.println("Error. Opción no válida.");
            }
        } while (opcion != 13);

        sc.close();
    }

    // Métodos estáticos

    public static void crearArbol() {
        if (arbol == null){
            arbol = new ArbolBST();
            System.out.println("Árbol creado exitosamente.");
        }else {
            System.out.println("El arbol ya ha sido creado.");
        }

    }

    public static void agregarCiudad() {
        if (arbol != null){
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

            // Crear la ciudad con el nombre y la población válidos
            Ciudad ciudad = new Ciudad(nombre,pais, poblacion);
            arbol.insertar(ciudad);
            System.out.println("Ciudad agregada al árbol.");

        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }

    }

    public static void eliminarCiudad() {
        if (arbol != null){
            System.out.print("Ingrese el nombre de la ciudad a eliminar: ");
            String nombre = sc.nextLine();

            arbol.eliminar(nombre);
            System.out.println("Ciudad eliminada del árbol.");
        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }


    }

    public static void balancearArbol() {
        if (arbol != null){
            arbol.balancear();
            System.out.println("El árbol ha sido balanceado.");
        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }


    }

    public static void buscarCiudad() {
        if (arbol != null){
            System.out.print("Ingrese el nombre de la ciudad a buscar: ");
            String nombre = sc.nextLine();

            Ciudad ciudad = arbol.buscar(nombre);
            if (ciudad != null) {
                System.out.println("Ciudad encontrada: " + ciudad);
            } else {
                System.out.println("Ciudad no encontrada.");
            }
        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }


    }

    public static void mostrarInOrden() {
        if (arbol != null){
            System.out.println("Ciudades en orden:");
            arbol.inOrden();
        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }


    }

    public static void mostrarPreOrden() {
        if (arbol != null){
            System.out.println("Ciudades en preorden:");
            arbol.preOrden();
        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }


    }

    public static void mostrarPostOrden() {
        if (arbol != null){
            System.out.println("Ciudades en postorden:");
            arbol.postOrden();
        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }


    }

    public static void calcularAmplitud() {
        if (arbol != null){
            int amplitud = arbol.amplitud();
            System.out.println("La amplitud del árbol es: " + amplitud);
        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }


    }

    public static void calcularProfundidad() {
        if (arbol != null){
            int profundidad = arbol.profundidad();
            System.out.println("La profundidad del árbol es: " + profundidad);
        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }


    }

    public static void vaciarArbol() {
        if (arbol != null){
            arbol.vaciar();
            System.out.println("El árbol ha sido vaciado.");
        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }


    }

    public static void destruirArbol() {
        if (arbol != null){
            arbol = null;
            System.out.println("El árbol ha sido destruido.");
        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }

    }
}

