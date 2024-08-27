package poo;
/*
 @author MUÑOZ TAPIA ARELY SINAI
        *******************************************************************************/


import java.util.Scanner;
public class Main extends Persona
{

    // se tiene que hacer static el obj porque estoy accediendo a Persona dentro de un main
    private static Scanner teclado=new Scanner(System.in);
    private static Scanner scanner = new Scanner(System.in); // scanner para que la persona pueda ingresar los datos

    // se crea por defecto un objeto vacío
    private static Persona persona = null;

    public static void main(String[] args) {
        System.out.println("MUÑOZ TAPIA ARELY SINAI");
        System.out.println("INICIO DE PROGRAMA");
        System.out.println("");

        int opcion= -1;
        do{
            System.out.println("\n0 Salir");
            System.out.println("1 Crear objeto vacio");
            System.out.println("2 Capturar datos");
            System.out.println("3 Mostrar datos");
            System.out.println("4 Modificar datos");
            System.out.println("5 Borrar datos");
            System.out.println("6 Destruir objeto\n");

            // Pedir al usuario que ingrese una opción
            System.out.print("Seleccione una opción:\n");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            switch(opcion){
                case 0: salir(); break;
                case 1: crear(); break;
                case 2: capturar(); break;
                case 3: mostrar(); break;
                case 4: modificar(); break;
                case 5: borrar(); break;
                case 6: destruir(); break;
                default: noValido(); break;
            }

        }while(opcion!=0);

        System.out.println("");
        System.out.println("FIN DE PROGRAMA");
        System.out.println("MUÑOZ TAPIA ARELY SINAI");
    }

    private static void salir(){
        System.out.println("Hasta pronto \n");
    }
    private static void crear(){
        System.out.println("Opcion de crear: \n");
        if (persona == null) {
            persona = new Persona();
            System.out.println("Objeto Persona creado.");
        } else {
            System.out.println("El objeto Persona ya existe.");
        }

    }
    private static void capturar(){
        System.out.println("Opcion de capturar: \n");
        if (persona != null){
            // llenamos los datos llamando al constructor de la clase Persona y usamos set porque es el que asigna los valores nuevos
            System.out.println("Ingrese su CURP:\n");
            persona.setCurp(scanner.nextLine());
            System.out.println("Ingrese sus apellidos:\n");
            persona.setApellidos(scanner.nextLine());
            System.out.println("Ingrese su nombre(s):\n");
            persona.setNombres(scanner.nextLine());
            System.out.println("Ingrese su fecha de nacimiento (ej: 25 de junio de 2005):\n");
            persona.setNacimiento(scanner.nextLine());
            System.out.println("Ingrese su edad:\n");
            persona.setEdad(scanner.nextInt());

        } else {
            System.out.println("Primero debe crear el objeto persona\n");
        }
    }
    private static void mostrar(){
        System.out.println("Opcion de mostrar: \n");
        if (persona != null) {
            // el usuario ingresará su curp como una contraseña para poder entrar al sistema
            System.out.println("Ingrese la CURP");
            String curpIngresada = scanner.nextLine();

            if (persona.getCurp().equals(curpIngresada)) { // usamos el método equals para comparar la curp ingresada por el usuario y la original
                System.out.println("Datos:\n"+persona);
            } else {
                System.out.println("Error. Los datos no coinciden");
            }
        } else {
            System.out.println("Debe crear el objeto persona primero");
        }
    }
    private static void modificar(){
        System.out.println("Opcion de modificar: \n");
        if (persona != null) {
            // el usuario ingresará su curp como una contraseña para poder entrar al sistema
            System.out.println("Ingrese la CURP");
            String curpIngresada = scanner.nextLine();

            if (persona.getCurp().equals(curpIngresada)) { // usamos el método equals para comparar la curp ingresada por el usuario y la original
                System.out.println("Datos actuales:\n"+persona);

                System.out.println("¿Qué dato desea modificar?\n1 - CURP\n2 - Apellidos\n3 - Nombres\n4 - Fecha de nacimiento\n5 - Edad");
                int eleccion = scanner.nextInt();
                switch (eleccion) {
                    case 1:
                        System.out.println("Ingrese la nueva CURP:\n");
                        scanner.nextLine(); // se tiene que añadir otro scanner para que se haga el espacio en el que el usuario pueda responder
                        persona.setCurp(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Ingrese los apellidos a modificar:\n");
                        scanner.nextLine(); // se tiene que añadir otro scanner para que se haga el espacio en el que el usuario pueda responder
                        persona.setApellidos(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Ingrese los nombres a modificar:\n");
                        scanner.nextLine(); // se tiene que añadir otro scanner para que se haga el espacio en el que el usuario pueda responder
                        persona.setNombres(scanner.nextLine());
                        break;
                    case 4:
                        System.out.println("Ingrese la fecha de nacimiento a modificar:\n");
                        scanner.nextLine(); // se tiene que añadir otro scanner para que se haga el espacio en el que el usuario pueda responder
                        persona.setNacimiento(scanner.nextLine());
                        break;
                    case 5:
                        System.out.println("Ingrese la edad nueva:\n");
                        scanner.nextLine(); // se tiene que añadir otro scanner para que se haga el espacio en el que el usuario pueda responder
                        persona.setEdad(scanner.nextInt());
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }

                System.out.println("Datos modificados:\n"+persona);

            } else {
                System.out.println("Error. Los datos no coinciden");
            }
        } else {
            System.out.println("Debe crear el objeto persona primero");
        }

    }
    private static void borrar(){
        System.out.println("Opcion de borrar: \n");
        if (persona != null) {
            // el usuario ingresará su curp como una contraseña para poder entrar al sistema
            System.out.println("Ingrese la CURP");
            String curpIngresada = scanner.nextLine();

            if (persona.getCurp().equals(curpIngresada)) { // usamos el método equals para comparar la curp ingresada por el usuario y la original
                System.out.println("Datos:\n"+persona);
                persona = null; // borrar los datos
                System.out.println("Datos borrados con éxito.");
                System.out.println("Datos:\n"+persona);

            } else {
                System.out.println("Error. Los datos no coinciden");
            }
        } else {
            System.out.println("Debe crear el objeto persona primero");
        }
    }
    private static void destruir(){
        System.out.println("Opcion de destruir: \n");
        if (persona != null) {
            persona = null;
            System.out.println("Objeto destruido con éxito");
        } else {
            System.out.println("No hay objeto al cual destruir. Crea un objeto.");
        }
    }
    private static void noValido(){
        System.out.println("Opcion no valida \n");
    }

}