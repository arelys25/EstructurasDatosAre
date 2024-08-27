package practica2;
import java.util.Scanner;
public class TestVehiculo {

    private static Scanner sc = new Scanner(System.in); // scanner para que la persona pueda ingresar los datos

    public static void main(String[] args){
        /**
         * 1 - Crear vehículo
         * 2 - Ver si el usuario quiere el contructor con o sin matrícula
         * 2 - Mostrar información
         * 3 - Modificar información
         * 4 - Borrar datos de un vehículo
         * 5 - Destruir vehículo
         * 6 - Salir del programa
         */

        int salida = 1;
        while(salida == 1) {
             System.out.println("1- Crear vehiculo");
             System.out.println("2- ");
             System.out.println("3- Modificar datos ");
             System.out.println("4- Modificar datos del vehículo");
             System.out.println("5- Borrar datos del vehiculo");
             System.out.println("6- Destruir vehiculo");
             System.out.println("7- Salir del programa\n");

             int opcion;
             // Pedir al usuario que ingrese una opción
            System.out.print("Seleccione una opción:\n");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea pendiente


            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }


        }

    }
}
