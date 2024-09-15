package menuCicl;

import clases.Vehiculo;

import java.util.Scanner;

public class MenuCiclado {
    private static Scanner sc = new Scanner(System.in);
    private static int opc;

    // arreglo
    private static Vehiculo estacionamiento[]; // por default su valor es null

    private static int tam;

    public static void main(String[] args) {
        System.out.println("ARELY SINAI MUÑOZ TAPIA\n");

        do {
            System.out.println("\nMENU:");
            System.out.println("0 - Salir");
            System.out.println("1 - Abrir estacionamiento");
            System.out.println("2 - Ingresar un vehiculo");
            System.out.println("3 - Retirar un vehiculo");
            System.out.println("4 - Buscar vehiculo");
            System.out.println("5 - Mover vehiculo de cajon");
            System.out.println("6 - Cambiar datos del vehiculo");
            System.out.println("7 - Cerrar estacionamiento");
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
                    moverVehiculo();
                    break;
                case 6:
                    cambiarDatosVehi();
                    break;
                case 7:
                    vaciar();
                    break;
            }

        } while (opc != 0);

        System.out.println("\nFin del programa. Bye :)");
        System.out.println("ARELY SINAI MUÑOZ TAPIA");

    }
    public static void crear(){
        // validar que no exista
        if (estacionamiento != null) {
            System.out.println("Error. Usted ya ha abierto el estacionamiento.\n");
        } else {
            System.out.println("\nIndica el num de cajones que tendra el estacionamiento (de 3 a 7)\n");
            tam = sc.nextInt();

            if (tam >= 3 && tam <= 7){
                // validar esa cantidad
                estacionamiento = new Vehiculo[tam];

                System.out.println("Estacionamiento creado\n");
                mostrarCajones(); // mostrara los cajones
            } else {
                System.out.println("Error. Numero de cajones invalido\n");
            }

        }

    }

    public static void insertar (){

        // validar si esta creado
        if (estacionamiento == null){
            System.out.println("Error. Usted no ha abierto el estacionamiento.\n");
        } else {

            // que el contador aumente si el estacionamiento esta ocupado para marcar un limite
            int cont = 0;
            for (int i = 0; i < estacionamiento.length; i++){
                if (estacionamiento[i] != null) {
                    cont ++;
                }

            }

            // validar si hay espacio
            if (cont >= estacionamiento.length) {
                System.out.println("Error. Tu estacionamiento ya esta lleno.\n");

            } else {
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

                // validar que la posicion existe
                if (posicion >= 0 && posicion < estacionamiento.length){
                    // validar que la posicion esta disponible
                    if (estacionamiento[posicion] != null){
                        System.out.println("El espacio ya esta ocupado.\n");

                    }else {
                        Vehiculo vehi = new Vehiculo();
                        System.out.println("Ingrese matricula:");
                        vehi.setMatricula(sc.next());
                        System.out.println("Ingrese marca:");
                        vehi.setMarca(sc.next());
                        System.out.println("Ingrese Modelo:");
                        vehi.setModelo(sc.next());
                        System.out.println("Ingrese Año:");
                        vehi.setAnio(sc.next());
                        System.out.println("Ingrese color:");
                        vehi.setColor(sc.next());

                        estacionamiento[posicion] = vehi;

                        mostrarCajones();

                    }

                } else {
                    System.out.println("Error. Numero de espacio no valido\n");
                }

            }

        }

    }

    public static void eliminar (){

        // validar que el arreglo exista
        if (estacionamiento == null){
            System.out.println("Error. Usted no ha abierto el estacionamiento.\n");
        } else {
            boolean encontrado = false;
            System.out.println("¿Cual es la mastricula de tu vehiculo?\n");
            String mat = sc.next();

            for (int i = 0; i < estacionamiento.length; i++) {
                Vehiculo vehi = estacionamiento[i];

                if (vehi != null){
                    // equalsIgnoreCase ignora si el usuario escribio mayusculas, minusculas etc
                    if (vehi.getMatricula().equalsIgnoreCase(mat)) {
                        System.out.println("Vehiculo encontrado\n");
                        System.out.println(vehi);

                        System.out.println("\n¿Es el vehiculo que desea retirar? \n1 = si \n2 = no\n");
                        int respuesta = sc.nextInt();

                        if (respuesta == 1){
                            estacionamiento[i] = null;
                            System.out.println("Vehiculo borrado.\n");
                            encontrado = true;
                            mostrarCajones();
                            break; // si lo encontro, que deje de buscar y que salga del ciclo
                        } else if (respuesta == 2){
                            System.out.println("Buscando...");
                        } else {
                            System.out.println("Error. Caracter no valido.");
                            break;
                        }
                    }
                }
            }

            if (encontrado == false){
                System.out.println("Error. Vehiculo NO encontrado.\n");
            }
            System.out.println("");
        }


    }

    public static void buscar (){

        // validar que el arreglo exista
        if (estacionamiento == null){
            System.out.println("Error. Usted no ha abierto el estacionamiento.\n");
        } else {
            boolean encontrado = false;
            System.out.println("¿Cual es la mastricula de tu vehiculo?\n");
            String mat = sc.next();

            for (int i = 0; i < estacionamiento.length; i++) {
                Vehiculo vehi = estacionamiento[i];

                if (vehi != null){
                    // equalsIgnoreCase ignora si el usuario escribio mayusculas, minusculas etc
                    if (vehi.getMatricula().equalsIgnoreCase(mat)) {
                        System.out.println("Vehiculo encontrado\n");
                        System.out.println(vehi);
                        encontrado = true;
                        break; // si lo encontro, que deje de buscar y que salga del ciclo
                    }
                }
            }

            if (encontrado == false){
                System.out.println("Error. Vehiculo NO encontrado.\n");
            }
            System.out.println("");
        }

    }

    public static void moverVehiculo (){
        if (estacionamiento == null){
            System.out.println("Error. Usted no ha abierto el estacionamiento.\n");
        } else {
            boolean encontrado = false;
            System.out.println("¿Cual es la mastricula deL vehiculo que deseas cambiar?\n");
            String mat = sc.next();

            for (int i = 0; i < estacionamiento.length; i++) {
                Vehiculo vehi = estacionamiento[i];

                if (vehi != null){
                    // equalsIgnoreCase ignora si el usuario escribio mayusculas, minusculas etc
                    if (vehi.getMatricula().equalsIgnoreCase(mat)) {
                        System.out.println("Vehiculo encontrado\n");
                        System.out.println(vehi);
                        encontrado = true;

                        System.out.println("¿A qué espacio desea moverlo?");
                        System.out.println("Disponibles:");
                        for (int u = 0; u < estacionamiento.length; u++){
                            if (estacionamiento[u] == null) {
                                System.out.println("cajon "+u+" -> "+estacionamiento[u]);
                            }
                        }

                        System.out.println("");
                        System.out.println("Introduce el cajon a donde quieres mover el vehiculo:");
                        int posicion = sc.nextInt();

                        if (posicion >= 0 && posicion < estacionamiento.length){
                            if (estacionamiento[posicion] == null) {
                                System.out.println("Espacio disponible.");
                                estacionamiento[posicion] = estacionamiento[i];
                                estacionamiento[i] = null;
                                System.out.println("Vehiculo movido con exito.");
                                mostrarCajones();

                            } else {
                                System.out.println("Error. Ese cajon ya esta ocupado\n.");
                                System.out.println("Disponibles:");
                                for (int u = 0; u < estacionamiento.length; u++){
                                    if (estacionamiento[u] == null) {
                                        System.out.println("cajon "+u+" -> "+estacionamiento[u]);
                                    }
                                }

                            }
                        } else {
                            System.out.println("Error. Cajon invalido.\n");
                        }

                        break; // si lo encontro, que deje de buscar y que salga del ciclo
                    }
                }
            }

            if (encontrado == false){
                System.out.println("Error. Vehiculo NO encontrado.\n");
            }
            System.out.println("");
        }
    }

    public static void cambiarDatosVehi (){
        // validar que el arreglo exista
        if (estacionamiento == null){
            System.out.println("Error. Usted no ha abierto el estacionamiento.\n");
        } else {
            boolean encontrado = false;
            System.out.println("¿Cual es la mastricula de tu vehiculo?\n");
            String mat = sc.next();

            for (int i = 0; i < estacionamiento.length; i++) {
                Vehiculo vehi = estacionamiento[i];

                if (vehi != null){
                    // equalsIgnoreCase ignora si el usuario escribio mayusculas, minusculas etc
                    if (vehi.getMatricula().equalsIgnoreCase(mat)) {
                        System.out.println("Vehiculo encontrado\n");
                        System.out.println(vehi);
                        encontrado = true;

                        System.out.println("¿Que dato desea modificar?\n1 - Marca\n2 - Modelo\n3 - Año\n4 - Color");
                        int resp = sc.nextInt();

                        switch (resp){
                            case 1:
                                System.out.println("Ingrese la marca nueva:");
                                vehi.setMarca(sc.next());
                                System.out.println("Datos modificados con exito.");
                                System.out.println(vehi);
                                break;
                            case 2:
                                System.out.println("Ingrese el modelo nuevo:");
                                vehi.setModelo(sc.next());
                                System.out.println("Datos modificados con exito.");
                                System.out.println(vehi);
                                break;
                            case 3:
                                System.out.println("Ingrese el año nuevo:");
                                vehi.setAnio(sc.next());
                                System.out.println("Datos modificados con exito.");
                                System.out.println(vehi);
                                break;
                            case 4:
                                System.out.println("Ingrese el color nuevo:");
                                vehi.setColor(sc.next());
                                System.out.println("Datos modificados con exito.");
                                System.out.println(vehi);
                                break;
                            default:
                                System.out.println("Error. Opcion invalida");
                                break;
                        }


                        break; // si lo encontro, que deje de buscar y que salga del ciclo
                    }
                }
            }

            if (encontrado == false){
                System.out.println("Error. Vehiculo NO encontrado.\n");
            }
            System.out.println("");
        }

    }

    public static void vaciar (){
        if (estacionamiento == null){
            System.out.println("Error. Usted no ha abierto el estacionamiento.\n");
        } else {
            System.out.println("Vehiculos que va a retirar:\n");
            mostrarCajones();
            estacionamiento = null;
            System.out.println("Vehiculos retirados con exito.");
            System.out.println("Estacionamiento cerrado.");
        }
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