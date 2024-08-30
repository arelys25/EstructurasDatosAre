package pruebas;
import clases.Vehiculo;

import java.util.Scanner;

/*
* @author MUÑOZ TAPIA ARELY SINAI
* @author HERNANDEZ ZAMBRANO AXEL JOSUE
*
* */
public class TestVehiculo {

    private static Scanner sc = new Scanner(System.in);

    private static Vehiculo v; // valor por default = null
    private static int cont;

    public static void main(String[] args) {
        // hacer el menu ciclado
        int opcion =0;
        System.out.println("\nMUÑOZ TAPIA ARELY SINAI\nHERNANDEZ ZAMBRANO AXEL JOSUE\n");

        do {
            System.out.println("0 - Salir");
            System.out.println("1 - Crear objeto con matrícula");
            System.out.println("2 - Crear objeto con 3 datos (Matrícula, marca y año)");
            System.out.println("3 - Crear objeto con 5 datos (Matrícula, marca, año, modelo y color)");
            System.out.println("4 - Mostrar datos del vehículo");
            System.out.println("5 - Modificar datos el vehículo");
            System.out.println("6 - Borrar datos del vehículo");
            System.out.println("7 - Destruir objeto\n");

            System.out.println("Seleccione una oción:\n");
            opcion = sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Fin del proframa");
                    break;
                case 1:
                    crearObjetoMatricula();
                    break;
                case 2:
                    crearObjeto3Datos();
                    break;
                case 3:
                    crearObjeto5Datos();
                    break;
                case 4:
                    mostrarDatos();
                    break;
                case 5:
                    modificarDatos();
                    break;
                case 6:
                    borrarDatos();
                    break;
                case 7:
                    destruirObjeto();
                    break;
                default:
                    System.out.println("Error. Opción no válida ");
                    break;
            }



        }while (opcion != 0);

        System.out.println("\nMUÑOZ TAPIA ARELY SINAI\nHERNANDEZ ZAMBRANO AXEL JOSUE\n");
    }

    // METODOS PARA EL SWITCH QUE CONTENDRAN LAS FUNCIONES
    // static porque el Main es static y void porque no va a retornar ningún valor
    public static void crearObjetoMatricula(){
        cont = 1;
        if (v != null){
            System.out.println("Referencia no está vacía, usted ya creó el objeto.\n");
        } else {
            System.out.println("Introduce la matrícula");
            String matricula = sc.next();

            if(matricula != null){

            v = new Vehiculo(matricula); // crear el objeto
            System.out.println("Objeto creado\n");

            } else{
                System.out.println("la matricula es nula");
            }
        }
    }

    public static void crearObjeto3Datos(){
        cont = 3;
        if (v != null){
            System.out.println("Referencia no está vacía, usted ya creó el objeto.\n");
        } else {
            System.out.println("Introduce la matrícula:\n");
            String matricula = sc.next();



            System.out.println("Introduce la marca:\n");
            String marca = sc.next();

            System.out.println("Introduce el año:\n");
            String anio = sc.next();
            int anioInt = 0;
            try {
                anioInt = Integer.parseInt(anio);
            } catch (NumberFormatException e) {
                System.out.println("Error: el año no es un numero valido.");
            }
            if(matricula != null && anioInt > 0   ) {
                v = new Vehiculo(matricula, marca, anio); // crear el objeto
                System.out.println("Objeto creado\n");
            }
        }
    }

    public static void crearObjeto5Datos(){
        cont = 5;
        if (v != null){
            System.out.println("Referencia no está vacía, usted ya creó el objeto.\n");
        } else {
            System.out.println("Introduce la matrícula:\n");
            String matricula = sc.next();

            System.out.println("Introduce la marca:\n");
            String marca = sc.next();

            System.out.println("Introduce el año:\n");
            String anio = sc.next();
            int anioInt = 0;
            try {
                anioInt = Integer.parseInt(anio);
            } catch (NumberFormatException e) {
                System.out.println("Error: el año no es un numero valido.");
            }

            System.out.println("Introduce el modelo:\n");
            String modelo = sc.next();


            System.out.println("Introduce el color:\n");
            String color = sc.next();

            if(matricula != null && anioInt > 0   ) {
                v = new Vehiculo(matricula, marca, anio, modelo, color); // crear el objeto
                System.out.println("Objeto creado\n");
            }
        }
    }

    public static void mostrarDatos() {
        if (v == null){
            System.out.println("Error. Aún no se ha creado el objeto vehículo\n");
        } else {
            System.out.println("Introduce la matrícula a buscar:\n");
            String mat = sc.next();

            Vehiculo auxiliar = new Vehiculo(mat);
            if (auxiliar.equals(v)){ // comparar el dato ingresado con el usuario con el v original
                System.out.println("Los datos del vehículo son:\n");
                System.out.println(v+"\n");
            } else {
                System.out.println("Error. Las matrículas no coinciden.\n");
            }
        }
    }

    public static void modificarDatos(){
        if (v == null){
            System.out.println("Error. Aún no se ha creado el objeto vehículo\n");
        } else {
            System.out.println("Introduce la matrícula a buscar:\n");
            String mat = sc.next();

            Vehiculo auxiliar = new Vehiculo(mat);
            if (auxiliar.equals(v)){ // comparar el dato ingresado con el usuario con el v original
                System.out.println("Los datos actuales del vehículo son:\n");
                System.out.println(v+"\n");

                System.out.println("Introduce los nuevos datos:\n");
                // mostrar datos originales y pedir los nuevos
                switch (cont) {
                    case 1:
                        System.out.println("Ingrese matrícula nueva:\n ");
                        sc.nextLine(); // se tiene que añadir otro scanner para que se haga el espacio en el que el usuario pueda responder
                        v.setMatricula(sc.nextLine());
                        break;
                    case 3:
                        System.out.println("¿Qué dato desea modificar?\n");
                        System.out.println("1 - Matrícula\n2 - Marca\n3 - año\n");
                        int opc = sc.nextInt();

                        switch (opc) {
                            case 1:
                                System.out.println("Ingrese matrícula nueva:\n ");
                                sc.nextLine(); // se tiene que añadir otro scanner para que se haga el espacio en el que el usuario pueda responder
                                v.setMatricula(sc.nextLine());
                                break;
                            case 2:
                                System.out.println("Ingrese marca nueva:\n ");
                                sc.nextLine(); // se tiene que añadir otro scanner para que se haga el espacio en el que el usuario pueda responder
                                v.setMarca(sc.nextLine());
                                break;

                            case 3:
                                System.out.println("Ingrese nuevo año:\n ");
                                sc.nextLine(); // se tiene que añadir otro scanner para que se haga el espacio en el que el usuario pueda responder
                                v.setAnio(sc.nextLine());
                                break;

                        }

                    break;

                    case 5:
                        System.out.println("¿Qué dato desea modificar?\n");
                        System.out.println("1 - Matrícula\n2 - Marca\n3 - Año\n4 - Modelo\n5 - Color\n");
                        int opc2 = sc.nextInt();

                        switch (opc2) {
                            case 1:
                                System.out.println("Ingrese matrícula nueva:\n ");
                                sc.nextLine(); // se tiene que añadir otro scanner para que se haga el espacio en el que el usuario pueda responder
                                v.setMatricula(sc.nextLine());
                                break;
                            case 2:
                                System.out.println("Ingrese marca nueva:\n ");
                                sc.nextLine(); // se tiene que añadir otro scanner para que se haga el espacio en el que el usuario pueda responder
                                v.setMarca(sc.nextLine());
                                break;

                            case 3:
                                System.out.println("Ingrese año nueva:\n ");
                                sc.nextLine(); // se tiene que añadir otro scanner para que se haga el espacio en el que el usuario pueda responder
                                v.setAnio(sc.nextLine());
                                break;

                            case 4:
                                System.out.println("Ingrese modelo nuevo:\n ");
                                sc.nextLine(); // se tiene que añadir otro scanner para que se haga el espacio en el que el usuario pueda responder
                                v.setModelo(sc.nextLine());
                                break;

                            case 5:
                                System.out.println("Ingrese color nuevo:\n ");
                                sc.nextLine(); // se tiene que añadir otro scanner para que se haga el espacio en el que el usuario pueda responder
                                v.setColor(sc.nextLine());
                                break;
                        }
                    break;
                }

                System.out.println("\nDatos modificados correctamente.\n");
                System.out.println(v+"\n");

            } else {
                System.out.println("Error. Las matrículas no coinciden.\n");
            }
        }
    }

    public static void borrarDatos() {
        if (v == null){
            System.out.println("El objeto ya ha sido destruido o borrado.\n");
        } else {
            System.out.println("Introduce la matrícula a buscar:\n");
            String mat = sc.next();

            Vehiculo auxiliar = new Vehiculo(mat);
            if (auxiliar.equals(v)){ // comparar el dato ingresado con el usuario con el v original
                v = null;
                System.out.println("Los datos han sido borrados con éxito.\n");

                System.out.println("Objeto: "+v+"\n");
            } else {
                System.out.println("Error. Las matrículas no coinciden.\n");
            }
        }
    }

    public static void destruirObjeto(){
        if (v == null){
            System.out.println("El objeto ya ha sido destruido.\n");
        } else {
            System.out.println("Introduce la matrícula a buscar:\n");
            String mat = sc.next();

            Vehiculo auxiliar = new Vehiculo(mat);
            if (auxiliar.equals(v)){ // comparar el dato ingresado con el usuario con el v original
                v = null;
                System.out.println("El objeto ya ha sido destruido.\n");

                System.out.println("Objeto: "+v+"\n");
            } else {
                System.out.println("Error. Las matrículas no coinciden.\n");
            }
        }
    }
}