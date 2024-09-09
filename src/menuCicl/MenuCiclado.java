package menuCicl;

import clases.Vehiculo;

import java.util.Scanner;

public class MenuCiclado {
    private static Scanner sc = new Scanner(System.in);
    private static int opc;

    // arreglo
    private static Vehiculo estacionamiento[]; // por default su valor es null

    public static void main(String[] args) {


        do {
            System.out.println("\nMENU:");
            System.out.println("0 - Salir");
            System.out.println("1 - Crear");
            System.out.println("2 - Insertar");
            System.out.println("3 - Eliminar");
            System.out.println("4 - Buscar");
            System.out.println("5 - Posicion");
            System.out.println("6 - Tamaño");
            System.out.println("7 - Vaciar");
            System.out.println("8 - Destruir\n");
            System.out.println("Ingrese la opcion: ");

            opc = sc.nextInt();

            switch (opc){
                case 1:
                    crear();
                    break;
                case 2:
                    insertar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    buscar();
                    break;
                case 5:
                    posicion();
                    break;
                case 6:
                    tamano();
                    break;
                case 7:
                    vaciar();
                    break;
                case 8:
                    destruir();
                    break;
            }

        } while (opc != 0);

    }
    public static void crear(){
        // validar que no exista
        System.out.println("\nIndica un tamaño de 3 a 5\n");
        int tam = sc.nextInt();

        // validar esa cantidad
        estacionamiento = new Vehiculo[tam];

        System.out.println("Estacionamiento creado\n");
        mostrarCajones(); // mostrara los cajones
    }

    public static void insertar (){
        // validar si esta creado

        // validar si hay espacio
        Vehiculo vehi = new Vehiculo();
        System.out.println("Ingrese matricula:");
        vehi.setMatricula(sc.next());
        System.out.println("Ingrese marca:");
        vehi.setMarca(sc.next());
        System.out.println("Ingrese Modelo:");
        vehi.setModelo(sc.next());

        System.out.println("");
        System.out.println("¿En que posicion quieres colocarlo?");
        System.out.println("Disponibles:");
        for (int i = 0; i < estacionamiento.length; i++){
            if (estacionamiento[i] == null) {
                System.out.println("cajon "+i+" -> "+estacionamiento[i]);
            }
        }

        System.out.println("");
        System.out.println("Introduce la posicion:");
        int posicion = sc.nextInt();

        // validar que la posicion exista y que este disponible
        estacionamiento[posicion] = vehi;

        mostrarCajones();

    }

    public static void eliminar (){

    }

    public static void buscar (){

    }

    public static void posicion (){

    }

    public static void tamano (){

    }

    public static void vaciar (){

    }

    public static void destruir (){

    }

    private static void mostrarCajones(){
        /*
        // sirve para mostrar la informacion
        for (Vehiculo v : estacionamiento){
            System.out.println(v);
        }
         */

        // for para que se muestren los cajones enumerados
        for (int i = 0; i < estacionamiento.length; i++){
            System.out.println("\ncajon "+ i+" " +estacionamiento[i]);
        }
    }

}
