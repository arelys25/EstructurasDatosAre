package pruebas;
import clases.Vehiculo;
import clases.Coche;
import clases.Moto;
import clases.Camion;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
* @author MUÑOZ TAPIA ARELY SINAI
* @author HERNANDEZ ZAMBRANO AXEL JOSUE
*
* */
public class TestVehiculo {

    private static Scanner sc = new Scanner(System.in);

    private static Vehiculo v; // valor por default = null
    private static Coche c;
    private static Moto m;
    private static Camion t;
    private static int cont, contVehiculo;

    public static void main(String[] args) {
        // hacer el menu ciclado
        int opcion =0;
        int opcCoche =0;
        int opcMoto = 0;
        int opcCamion = 0;
        System.out.println("\nMUÑOZ TAPIA ARELY SINAI\nHERNANDEZ ZAMBRANO AXEL JOSUE\n");

        do {

            System.out.println("0 - Salir");
            System.out.println("1 - objeto tipo coche");
            System.out.println("2 - objeto tipo moto");
            System.out.println("3 - objeto tipo camion\n");

            System.out.println("Seleccione una oción:\n");
            opcion = sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Fin del programa");
                    break;
                case 1: // Coche
                    System.out.println("1 - Crear objeto con 6 datos (Matrícula, marca, año, modelo, carroceria y color)");
                    System.out.println("2 - Mostrar datos del coche");
                    System.out.println("3 - Modificar datos el coche");
                    System.out.println("4 - Borrar datos del coche");
                    System.out.println("5 - Destruir objeto\n");
                    opcCoche = sc.nextInt();
                    contVehiculo = 1;
                    switch (opcCoche){
                        case 1:
                            crearObjeto5Datos();
                            break;
                        case 2:
                            mostrarDatos();
                            break;
                        case 3:
                            modificarDatos();
                            break;
                        case 4:
                            borrarDatos();
                            break;
                        case 5:
                            destruirObjeto();
                            break;

                        default:
                            System.out.println("Opción no valida");
                            break;
                    }
                    break;
                case 2: // Moto
                    contVehiculo = 2;
                    System.out.println("1 - Crear objeto con 6 datos (Matrícula, marca, año, modelo, cilindrada y color)");
                    System.out.println("2 - Mostrar datos de la moto");
                    System.out.println("3 - Modificar datos de la moto");
                    System.out.println("4 - Borrar datos del vehículo");
                    System.out.println("5 - Destruir objeto\n");

                    opcMoto = sc.nextInt();
                    switch (opcMoto){
                        case 1:
                            crearObjeto5Datos();
                            break;
                        case 2:
                            mostrarDatos();
                            break;
                        case 3:
                            modificarDatos();
                            break;
                        case 4:
                            borrarDatos();
                            break;
                        case 5:
                            destruirObjeto();
                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }
                    break;
                case 3: // Camion
                    contVehiculo = 3;
                    System.out.println("1 - Crear objeto con 6 datos (Matrícula, marca, año, modelo, tonelaje y color)");
                    System.out.println("2 - Mostrar datos del camion");
                    System.out.println("3 - Modificar datos del camion");
                    System.out.println("4 - Borrar datos del camion");
                    System.out.println("5 - Destruir objeto\n");
                    opcCamion = sc.nextInt();
                    switch (opcCamion){
                        case 1:
                            crearObjeto5Datos();
                            break;
                        case 2:
                            mostrarDatos();
                            break;
                        case 3:
                            modificarDatos();
                            break;
                        case 4:
                            borrarDatos();
                            break;
                        case 5:
                            destruirObjeto();
                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;

                    }
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
            switch (contVehiculo) {
                case 1:

                    System.out.println("Introduce la matrícula:\n");
                    String matricula = sc.next();

                    System.out.println("Introduce la marca:\n");
                    String marca = sc.next();

                    System.out.println("Introduce el año:\n");
                    String anio = sc.next();
                    int anioInt = 0;

                    // validar que el año sea un número y que no sea negativo
                    try {
                        anioInt = Integer.parseInt(anio);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: el año no es un numero valido.");
                    }

                    System.out.println("Introduce el modelo:\n");
                    String modelo = sc.next();

                    System.out.println("Introduce el color:\n");
                    String color = sc.next();

                    System.out.println("Introduce el tipo de carroceria: \n");
                    String carroceria = sc.next();

                    if(matricula != null && anioInt > 0   ) {
                        //v = new Vehiculo(matricula, marca, anio, modelo, color); // crear el objeto
                        //  c = new Coche(matricula, marca, anio, modelo, color);
                        c = new Coche(matricula,marca,anio,modelo,color, carroceria);
                        System.out.println("Objeto creado\n");
                    }
                    break;

                case 2:
                    System.out.println("Introduce la matrícula:\n");
                    String matriculaMoto = sc.next();

                    System.out.println("Introduce la marca:\n");
                    String marcaMoto = sc.next();

                    System.out.println("Introduce el año:\n");
                    String anioMoto = sc.next();
                    int anioIntMoto = 0;

                    // validar que el año sea un número y que no sea negativo
                    try {
                        anioIntMoto = Integer.parseInt(anioMoto);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: el año no es un numero valido.");
                    }

                    System.out.println("Introduce el modelo:\n");
                    String modeloMoto = sc.next();

                    System.out.println("Introduce el color:\n");
                    String colorMoto = sc.next();

                    System.out.println("Introduce la cilindrada de la moto:\n");
                    String cilindrada = sc.next();

                    // carroceria = "";


                    if(matriculaMoto != null && anioIntMoto > 0) {
                        //v = new Vehiculo(matriculaMoto, marcaMoto, anioMoto, modeloMoto, colorMoto); // crear el objeto
                        //  c = new Coche(matricula, marca, anio, modelo, color);
                        m = new Moto(matriculaMoto,marcaMoto,anioMoto,modeloMoto,colorMoto,cilindrada);
                        System.out.println("Objeto creado\n");
                    }


                    break;

                case 3: // camion
                    System.out.println("Introduce la matrícula:\n");
                    String matriculaCamion = sc.next();

                    System.out.println("Introduce la marca:\n");
                    String marcaCamion = sc.next();

                    System.out.println("Introduce el año:\n");
                    String anioCamion = sc.next();
                    int anioIntCamion = 0;

                    // validar que el año sea un número y que no sea negativo
                    try {
                        anioIntCamion = Integer.parseInt(anioCamion);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: el año no es un numero valido.");
                    }

                    System.out.println("Introduce el modelo:\n");
                    String modeloCamion = sc.next();

                    System.out.println("Introduce el color:\n");
                    String colorCamion = sc.next();

                    System.out.println("Introduce el tonelaje\n");
                    String tonelaje = sc.next();


                    // carroceria = "";


                    if(matriculaCamion != null && anioIntCamion > 0   ) {
                        //v = new Vehiculo(matricula, marca, anio, modelo, color); // crear el objeto
                        //  c = new Coche(matricula, marca, anio, modelo, color);
                        t = new Camion(matriculaCamion,marcaCamion,anioCamion,modeloCamion,colorCamion,tonelaje);
                        System.out.println("Objeto creado\n");

                    }

                    break;
            }


        }
    }

    public static void mostrarDatos() {
        if (c == null && m == null && t == null){
            System.out.println("Error. Aún no se ha creado el objeto vehículo\n");
        } else {
            System.out.println("Introduce la matrícula a buscar:\n");
            String mat = sc.next();

            Vehiculo auxiliar = new Vehiculo(mat);
            //Coche auxiliarC = new Coche(mat);
            if (auxiliar.equals(v)){ // comparar el dato ingresado con el usuario con el v original
                System.out.println("Los datos del vehículo son:\n");
                System.out.println(v+"\n");
            } else if (c != null) {
                System.out.println("Los datos del coche son:\n");
                System.out.println(c+"\n");
            } else if (m!=null) {
                System.out.println("Los datos de la moto son:\n");
                System.out.println(m+"\n");
            } else if (t != null) {
                System.out.println("Los datos del camion son:\n");
                System.out.println(t+"\n");
            }else {
                System.out.println("las matriculas no coinciden");
            }

        }
    }

    public static void modificarDatos(){
        cont = 5;
        if (v != null){
            System.out.println("Referencia no está vacía, usted ya creó el objeto.\n");
        } else {
            switch (contVehiculo) {
                case 1:

                    System.out.println("Introduce la matrícula:\n");
                    String matricula = sc.next();

                    System.out.println("Introduce la marca:\n");
                    String marca = sc.next();

                    System.out.println("Introduce el año:\n");
                    String anio = sc.next();
                    int anioInt = 0;

                    // validar que el año sea un número y que no sea negativo
                    try {
                        anioInt = Integer.parseInt(anio);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: el año no es un numero valido.");
                    }

                    System.out.println("Introduce el modelo:\n");
                    String modelo = sc.next();

                    System.out.println("Introduce el color:\n");
                    String color = sc.next();

                    System.out.println("Introduce el tipo de carroceria: \n");
                    String carroceria = sc.next();

                    if(matricula != null && anioInt > 0   ) {
                        //v = new Vehiculo(matricula, marca, anio, modelo, color); // crear el objeto
                        //  c = new Coche(matricula, marca, anio, modelo, color);
                        c = new Coche(matricula,marca,anio,modelo,color, carroceria);
                        System.out.println("Objeto creado\n");
                    }
                    break;

                case 2:
                    System.out.println("Introduce la matrícula:\n");
                    String matriculaMoto = sc.next();

                    System.out.println("Introduce la marca:\n");
                    String marcaMoto = sc.next();

                    System.out.println("Introduce el año:\n");
                    String anioMoto = sc.next();
                    int anioIntMoto = 0;

                    // validar que el año sea un número y que no sea negativo
                    try {
                        anioIntMoto = Integer.parseInt(anioMoto);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: el año no es un numero valido.");
                    }

                    System.out.println("Introduce el modelo:\n");
                    String modeloMoto = sc.next();

                    System.out.println("Introduce el color:\n");
                    String colorMoto = sc.next();

                    System.out.println("Introduce la cilindrada de la moto:\n");
                    String cilindrada = sc.next();

                    // carroceria = "";


                    if(matriculaMoto != null && anioIntMoto > 0) {
                        //v = new Vehiculo(matriculaMoto, marcaMoto, anioMoto, modeloMoto, colorMoto); // crear el objeto
                        //  c = new Coche(matricula, marca, anio, modelo, color);
                        m = new Moto(matriculaMoto,marcaMoto,anioMoto,modeloMoto,colorMoto,cilindrada);
                        System.out.println("Objeto creado\n");
                    }


                    break;

                case 3: // camion
                    System.out.println("Introduce la matrícula:\n");
                    String matriculaCamion = sc.next();

                    System.out.println("Introduce la marca:\n");
                    String marcaCamion = sc.next();

                    System.out.println("Introduce el año:\n");
                    String anioCamion = sc.next();
                    int anioIntCamion = 0;

                    // validar que el año sea un número y que no sea negativo
                    try {
                        anioIntCamion = Integer.parseInt(anioCamion);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: el año no es un numero valido.");
                    }

                    System.out.println("Introduce el modelo:\n");
                    String modeloCamion = sc.next();

                    System.out.println("Introduce el color:\n");
                    String colorCamion = sc.next();

                    System.out.println("Introduce el tonelaje\n");
                    String tonelaje = sc.next();


                    // carroceria = "";


                    if(matriculaCamion != null && anioIntCamion > 0   ) {
                        //v = new Vehiculo(matricula, marca, anio, modelo, color); // crear el objeto
                        //  c = new Coche(matricula, marca, anio, modelo, color);
                        t = new Camion(matriculaCamion,marcaCamion,anioCamion,modeloCamion,colorCamion,tonelaje);
                        System.out.println("Objeto creado\n");

                    }

                    break;
            }


        }

        // --------------------------------------------------------------------------------------------



    }

    public static void borrarDatos() {
        if (c == null && m == null && t == null){
            System.out.println("El objeto ya ha sido destruido o borrado.\n");
        } else {
            System.out.println("Introduce la matrícula a buscar:\n");
            String mat = sc.next();

            if (contVehiculo == 1) {
                c = null;
            } else if (contVehiculo == 2) {
                m = null;
            } else if (contVehiculo == 3) {
                t = null;
            }

            System.out.println("Los datos han sido borrados con éxito.\n");

        }
    }

    public static void destruirObjeto(){
        if (c == null && m == null && t == null){
            System.out.println("El objeto ya ha sido destruido o borrado.\n");
        } else {
            System.out.println("Introduce la matrícula a buscar:\n");
            String mat = sc.next();

            if (contVehiculo == 1) {
                c = null;
            } else if (contVehiculo == 2) {
                m = null;
            } else if (contVehiculo == 3) {
                t = null;
            }

            System.out.println("El objeto ha sido destruido con éxito.\n");
        }
    }
}