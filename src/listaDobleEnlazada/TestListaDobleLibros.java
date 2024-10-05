package listaDobleEnlazada;
import colas.Trabajo;
import listas.Nodo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestListaDobleLibros {

    private static Scanner sc = new Scanner(System.in);
    private static int opc;
    private static ListaDobleLibros listaDoble;
    private static Trabajo libro;
    private static Nodo nodo;
    public static void main(String[] args) {
        System.out.println("\nAxel Josue Hernandez Zambrano\nArely Sinai Muñoz Tapia\n");

        do {

            System.out.println("\nMenu:");
            System.out.println("0 - Salir");
            System.out.println("1 - Crear lista doble");
            System.out.println("2 - Mostrar todos los libros de la lista");
            System.out.println("3 - Agregar un libro al inicio de la lista");
            System.out.println("4 - Agregar un libro al final de la lista");
            System.out.println("5 - Agregar un libro en una posicion especifica");
            System.out.println("6 - Eliminar libro al inicio de la lista");
            System.out.println("7 - Eliminar libro al final de la lista");
            System.out.println("8 - Eliminar libro en una posicion especifica");
            System.out.println("9 - Modificar un libro en una posicion especifica");
            System.out.println("10 - Mostrar la cantidad de libros en la lista");
            System.out.println("11 - Vaciar la lista de libros");
            System.out.println("12 - Destruir la lista de libros");

            opc = sc.nextInt();

            switch (opc){
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                case 1:
                    crearListaDoble();
                    break;
                case 2:
                    mostrarLista();
                    break;
                case 3:
                    agregarAlInicio();
                    break;
                case 4:
                    agregarAlFinal();
                    break;
                case 5:
                    agregarPosicionEspecifica();
                    break;
                case 6:
                    eliminarAlInicio();
                    break;
                case 7:
                    eliminarAlFinal();
                    break;
                case 8:
                    eliminarPosicionEspecifica();
                    break;
                case 9:
                    modificarPosicionEspecifica();
                    break;
                case 10:
                    mostrarCantidad();
                    break;
                case 11:
                    vaciarLista();
                    break;
                case 12:
                    destruirLista();
                    break;
                default:
                    System.out.println("Error. Opcion invalida");
                    break;
            }

        } while (opc != 0);

        System.out.println("\nAxel Josue Hernandez Zambrano\nArely Sinai Muñoz Tapia\n");
    }

    private static void crearListaDoble() {
        if (listaDoble == null){
            listaDoble = new ListaDobleLibros();
            System.out.println("Lista creada con exito.\n");
        } else {
            System.out.println("La lista ya ha sido creada.\n");
        }
    }

    private static void mostrarLista() {
        if (listaDoble == null){
            System.out.println("Aun no se ha creado la lista.\n");
        } else {
            System.out.println(listaDoble.mostrarLibros());
        }

    }

    private static void agregarAlInicio() {
        if (listaDoble != null) {
            System.out.println("Ingresa el titulo del libro:");
            String titulo = sc.next();

            System.out.println("\nIngresa el autor del libro:");
            String autor = sc.next();

            System.out.println("\nIngresa el anio de publicacion del libro:");

            try {
                int anio = sc.nextInt();

                libro = new Trabajo(titulo,autor,anio);

                // agregar el libro a la lsita doble
                listaDoble.agregarAlInicio(libro);
                System.out.println("Elemento agregardo\n");

                // mostrar la lista para ver que el libro se haya guardado
                mostrarLista();

            } catch (InputMismatchException e) {
                System.out.println("Error. Numero invalido");
                sc.nextLine(); // limpia el bufer del scanner en caso de que haya respondido mal el usuario
            }

        } else {
            System.out.println("La lista aun no ha sido creada.\n");
        }
    }

    private static void agregarAlFinal() {
        if (listaDoble != null) {
            System.out.println("Ingresa el titulo del libro:");
            String titulo = sc.next();

            System.out.println("\nIngresa el autor del libro:");
            String autor = sc.next();

            System.out.println("\nIngresa el anio de publicacion del libro:");

            try {
                int anio = sc.nextInt();

                libro = new Trabajo(titulo,autor,anio);

                // agregar el libro a la lsita doble
                listaDoble.agregarAlFinal(libro);
                System.out.println("Elemento agregardo\n");

                // mostrar la lista para ver que el libro se haya guardado
                mostrarLista();

            } catch (InputMismatchException e) {
                System.out.println("Error. Numero invalido");
                sc.nextLine(); // limpia el bufer del scanner en caso de que haya respondido mal el usuario
            }

        } else {
            System.out.println("La lista aun no ha sido creada.\n");
        }
    }

    private static void agregarPosicionEspecifica() {
        if (listaDoble != null) {
            System.out.println("Ingresa el titulo del libro:");
            String titulo = sc.next();

            System.out.println("\nIngresa el autor del libro:");
            String autor = sc.next();

            int anio = 0;
            boolean entrada = false;

            while (!entrada){
                try {
                    System.out.println("\nIngresa el anio de publicacion del libro:");
                    anio = sc.nextInt();
                    entrada = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error. Numero invalido");
                    sc.nextLine(); // limpia el bufer del scanner en caso de que haya respondido mal el usuario
                }
            }

            int posicion = 0;
            entrada = false;

            while (!entrada){
                try {
                    System.out.println("Puedes agregar libros desde la posicion 0 a la posicion "+listaDoble.getCantidad());
                    System.out.println("\nIngresa la posicion en la que deseas introducir el libro:");
                    posicion = sc.nextInt();

                    if (posicion > listaDoble.getCantidad() || posicion < 0){
                        System.out.println("Error. Posicion invalida\n");
                    } else {
                        entrada = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error. Numero invalido");
                    sc.nextLine(); // limpia el bufer del scanner en caso de que haya respondido mal el usuario
                }
            }

            libro = new Trabajo(titulo,autor,anio);

            // agregar el libro a la lsita doble
            listaDoble.agregarPuntoEspecifico(libro,posicion);
            System.out.println("Elemento agregardo\n");

            // mostrar la lista para ver que el libro se haya guardado
            mostrarLista();

        } else {
            System.out.println("La lista aun no ha sido creada.\n");
        }
    }

    private static void eliminarAlInicio() {
        if (listaDoble == null) {
            System.out.println("La lista aun no ha sido creada.\n");
        } else {
            listaDoble.eliminarElementoDelInicio();
            System.out.println("Libro del inicio eliminado correctamente\n");
            mostrarLista();
        }

    }

    private static void eliminarAlFinal() {
    }

    private static void eliminarPosicionEspecifica() {
    }

    private static void modificarPosicionEspecifica() {
    }

    private static void mostrarCantidad() {
        if (listaDoble == null){
            System.out.println("Aun no se ha creado la lista.\n");
        } else {
            System.out.println("\nCantidad de libros en la lista: "+listaDoble.getCantidad());
        }
    }

    private static void vaciarLista() {

    }

    private static void destruirLista() {

    }
}
