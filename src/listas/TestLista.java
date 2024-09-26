package listas;
import java.util.Scanner;
import colas.Trabajo;

public class TestLista {
     private static Scanner sc = new Scanner(System.in);
     private static int opc;
     private static ListaSimple lista;
     private static Trabajo libro;
     private static Nodo nodo;

     public static void main (String [] args){

         do {
             System.out.println("\nMenu:");
             System.out.println("0 - Salir");
             System.out.println("1 - Crear lista");
             System.out.println("2 - Agregar nuevo libro sl final de la lista");
             System.out.println("3 - Agregar nuevo libro en una posicion especifica");
             System.out.println("4 - Eliminar un libro del final de la lista");
             System.out.println("5 - Eliminar un libro en una posicion especifica");
             System.out.println("6 - Mostrar lista");
             System.out.println("7 - Vaciar lista");
             System.out.println("8 - Destruir lista\n");
             System.out.println("Ingrese la opcion:");

             opc = sc.nextInt();

             switch (opc) {
                 case 0:
                     System.out.println("Fin del programa");
                     break;
                 case 1:
                     crearListaSimple();
                     break;
                 case 2:
                     agregarLibro();
                     break;
                 case 3:
                     agregarLibroEspecifico();
                     break;
                 case 4:
                     eliminarLibroFinal();
                     break;
                 case 5:
                     eliminarLibroEspecifico();
                     break;
                 case 6:
                     System.out.println(lista.mostrarLibros());
                     break;
                 case 7:
                     vaciarLista();
                     break;
                 case 8:
                     destruirLista();
                     break;
                 default:
                     System.out.println("Error. Opcion invalida.\n");
             }

         } while (opc != 0);
     }

    private static void destruirLista(){

    }
     private static void vaciarLista(){

    }
     private static void eliminarLibroEspecifico() {
    }

    private static void eliminarLibroFinal() {
        if (lista == null) {
            System.out.println("La lista no ha sido creada\n");
        } else {
            // agregar el objeto a la lista
            lista.quitar();
            System.out.println("Elemento borrado con exito\n.");
            System.out.println(lista.mostrarLibros());

        }
    }

    private static void agregarLibroEspecifico() {
        if (lista == null) {
            System.out.println("La lista no ha sido creada\n");
        } else {
            System.out.println("Introduce el titulo:");
            String titulo = sc.next();
            System.out.println("Introduce el autor:");
            String autor = sc.next();
            System.out.println("Introduce el codigo del libro:");
            String isbn = sc.next();

            System.out.println("Lugares disponibles: \n0 y "+(lista.getCantidad()));
            System.out.println("Introduce la posicion donde deseas colocar el libro:");
            int posicion = sc.nextInt();

            if (posicion >= 0 && posicion <= lista.getCantidad()) {
                libro = new Trabajo(titulo,autor,isbn);

                // agregar el objeto a la lista
                if (lista.agregarEnPosicion(libro,posicion)) {
                    System.out.println("Elemento agregado\n");
                    System.out.println(lista.mostrarLibros());
                    System.out.println("");
                }

            } else {
                System.out.println("Error. La posicion ingresada es invalida o esta fuera de rango.\n");
                System.out.println("Lugares disponibles: \n0 y "+(lista.getCantidad()));
            }

        }
    }


    private static void agregarLibro() {
        if (lista == null) {
            System.out.println("La lista no ha sido creada\n");
        } else {
            System.out.println("Introduce el titulo:");
            String titulo = sc.next();
            System.out.println("Introduce el autor:");
            String autor = sc.next();
            System.out.println("Introduce el codigo del libro:");
            String isbn = sc.next();

            libro = new Trabajo(titulo,autor,isbn);

            // agregar el objeto a la lista
            if (lista.agregar(libro)) {
                System.out.println("Elemento agregado\n");
                System.out.println(lista.mostrarLibros());
                System.out.println("");
            }

        }
    }

    private static void crearListaSimple() {
        if (lista == null) {
            lista = new ListaSimple();
            System.out.println("Lista creada\n");
        } else {
            System.out.println("La lista ya ha sido creada");
        }
    }

}
