package pruebas;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/*
* @author MUÑOZ TAPIA ARELY SINAI
*
* */
public class TestVehiculo {
    public static void main(String[] args) {
        // hacer el menu ciclado
        int opcion =0;
        Scanner sc = new Scanner(System.in);
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

    }

    public static void crearObjeto3Datos(){

    }

    public static void crearObjeto5Datos(){

    }

    public static void mostrarDatos() {

    }

    public static void modificarDatos(){

    }

    public static void borrarDatos() {

    }

    public static void destruirObjeto(){

    }
}
