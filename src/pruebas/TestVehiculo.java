package pruebas;
import clases.Vehiculo;

import java.util.Scanner;

/*
* @author MUÑOZ TAPIA ARELY SINAI
*
* */
public class TestVehiculo {

    private static Scanner sc = new Scanner(System.in);

    private static Vehiculo v; // valor por default = null

    public static void main(String[] args) {
        // hacer el menu ciclado
        int opcion =0;
        System.out.println("MUÑOZ TAPIA ARELY SINAI\n");

        do {
            System.out.println("0 - Salir");
            System.out.println("1 - Crear objeto con matrícula");
            System.out.println("2 - Crear objeto con 3 datos");
            System.out.println("3 - Crear objeto con 5 datos");
            System.out.println("4 - Mostrar datos del vehículo");
            System.out.println("5 - Modificar datos el vehículo");
            System.out.println("6 - Borrar datos del vehículo");
            System.out.println("7 - Destruir objeto");

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

        System.out.println("\nMUÑOZ TAPIA ARELY SINAI");
    }

    // METODOS PARA EL SWITCH QUE CONTENDRAN LAS FUNCIONES
    // static porque el Main es static y void porque no va a retornar ningún valor
    public static void crearObjetoMatricula(){
        if (v != null){
            System.out.println("Referencia no está vacía, usted ya creó el objeto.\n");
        } else {
            System.out.println("Introduce la matrícula");
            String matricula = sc.nextLine();

            v = new Vehiculo(matricula); // crear el objeto
            System.out.println("Objeto creado\n");
        }
    }

    public static void crearObjeto3Datos(){
        if (v != null){
            System.out.println("Referencia no está vacía, usted ya creó el objeto.\n");
        } else {
            System.out.println("Introduce la matrícula:\n");
            String matricula = sc.next();

            System.out.println("Introduce la marca:\n");
            String marca = sc.next();

            System.out.println("Introduce el año:\n");
            String año = sc.next();

            v = new Vehiculo(matricula,marca,año); // crear el objeto
            System.out.println("Objeto creado\n");
        }
    }

    public static void crearObjeto5Datos(){
        if (v != null){
            System.out.println("Referencia no está vacía, usted ya creó el objeto.\n");
        } else {
            System.out.println("Introduce la matrícula:\n");
            String matricula = sc.next();

            System.out.println("Introduce la marca:\n");
            String marca = sc.next();

            System.out.println("Introduce el año:\n");
            String modelo = sc.next();

            System.out.println("Introduce el año:\n");
            String año = sc.next();

            System.out.println("Introduce el año:\n");
            String color = sc.next();

            v = new Vehiculo(matricula,marca,modelo,año,color); // crear el objeto
            System.out.println("Objeto creado\n");
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

                // alsijfoiahfioa
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

                System.out.println(v+"\n");
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

                System.out.println(v+"\n");
            } else {
                System.out.println("Error. Las matrículas no coinciden.\n");
            }
        }
    }
}
