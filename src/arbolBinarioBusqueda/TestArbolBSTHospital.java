package arbolBinarioBusqueda;

import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TestArbolBSTHospital {
    private static ArbolBST<Hospital> arbol = null;  // Instancia del árbol de elementos
    private static Hospital hospital;
    private static List<Hospital> listaHospitales = new ArrayList<>(); // Lista para guardar los hospitales
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Crear un nuevo árbol de elementos.");
            System.out.println("2. Agregar un nuevo elemento al árbol.");
            System.out.println("3. Eliminar un elemento del árbol.");
            System.out.println("4. Balancear el árbol.");
            System.out.println("5. Buscar un elemento en el árbol.");
            System.out.println("6. Mostrar todas los elementos en orden.");
            System.out.println("7. Mostrar todas los elementos en preorden.");
            System.out.println("8. Mostrar todas los elemenetos en postorden.");
            System.out.println("9. Calcular la amplitud del árbol.");
            System.out.println("10. Calcular la profundidad del árbol.");
            System.out.println("11. Vaciar el árbol de hospitales.");
            System.out.println("12. Destruir el árbol.");
            System.out.println("13. Graficar el árbol.");
            System.out.println("14. Salir.");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar buffer de entrada

            switch (opcion) {
                case 1:
                    crearArbol();
                    break;
                case 2:
                    agregarElemento();
                    break;
                case 3:
                    eliminarElemento();
                    break;
                case 4:
                    balancearArbol();
                    break;
                case 5:
                    buscarElemento();
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
                    iniciarInterfazGrafica(listaHospitales);
                    break;
                case 14:
                    System.out.println("¡Chao!");
                    break;
                default:
                    System.out.println("Error. Opción no válida.");
            }
        } while (opcion != 14);

        sc.close();
    }

    // Métodos estáticos
    public static void iniciarInterfazGrafica(List<Hospital> hospitales) {
        ArbolBST<Hospital> arbolGrafico = new ArbolBST<>();

        // Insertar cada elemento de la lista en el árbol gráfico
        for (Hospital hospital : hospitales) {
            arbolGrafico.insertar(hospital);
        }

        // Crear la interfaz gráfica y mostrarla
        GuiBST<Hospital> gui = new GuiBST<>(arbolGrafico);
        gui.setSize(600, 600);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }
    public static void crearArbol() {
        if (arbol == null){
            arbol = new ArbolBST();
            System.out.println("Árbol creado exitosamente.");
        }else {
            System.out.println("El arbol ya ha sido creado.");
        }

    }

    public static void agregarElemento() {
        if (arbol != null){
            System.out.print("Ingrese el nombre del hospital: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese la especialidad del hospital: ");
            String especialidad = sc.nextLine();

            int numInternos = 0;
            boolean numExtValido = false;

            // Bucle para asegurarse que el usuario ingresa un número válido para la población
            while (!numExtValido) {
                try {
                    System.out.print("Ingrese el numero de internos del hospital: ");
                    numInternos = sc.nextInt();  // Intentar convertir la entrada a entero
                    numExtValido = true;  // Si no se lanza excepción, la población es válida
                } catch (InputMismatchException e) {
                    System.out.println("Error: El numero exterior debe ser un número entero. Intente de nuevo.");
                    sc.nextLine();  // Limpiar buffer de entrada
                }
            }


            hospital = new Hospital(nombre,especialidad,numInternos);
            arbol.insertar(hospital);
            listaHospitales.add(hospital);  // Añadir elemento a la lista
            System.out.println("Elemento agregado al árbol.");

        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }

    }

    public static void eliminarElemento() {
        if (arbol != null){
            System.out.print("Ingrese el nombre del hospital a eliminar: ");
            String nombre = sc.nextLine();

            arbol.eliminar(nombre);
            System.out.println("Elemento eliminado del árbol.");
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

    public static void buscarElemento() {
        if (arbol != null){
            System.out.print("Ingrese el nombre del hospital a buscar: ");
            String nombre = sc.nextLine();

            hospital = arbol.buscar(nombre);
            if (hospital != null) {
                System.out.println("Elemento encontrado: " + hospital);
            } else {
                System.out.println("Elemento no encontrado.");
            }
        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }


    }

    public static void mostrarInOrden() {
        if (arbol != null){
            System.out.println("Elementos en orden:");
            arbol.inOrden();
        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }


    }

    public static void mostrarPreOrden() {
        if (arbol != null){
            System.out.println("Elementos en preorden:");
            arbol.preOrden();
        } else {
            System.out.println("Error. Debe crear el arbol primero.");
        }


    }

    public static void mostrarPostOrden() {
        if (arbol != null){
            System.out.println("Elementos en postorden:");
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

