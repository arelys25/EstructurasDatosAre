package colas;

import java.util.Scanner;

public class TestCola {
    private static Scanner sc = new Scanner(System.in);
    private static int opc;
    private static MiColaProceso cola;//instancia de la cola

    public static void main(String []args){
        String titulo, autor,isbn;
        do{
            System.out.println("MENU DE OPCIONES");
            System.out.println("0- SALIR");
            System.out.println("1- CREAR FILA");
            System.out.println("2- ENCOLAR");
            System.out.println("3- DESENCOLAR");
            System.out.println("4- MOSTRAR CABEZA DE FILA");
            System.out.println("5- MOSTRAR FILA");
            System.out.println("6- VACIAR FILA");
            System.out.println("7- DESTRUIR FILA");
            System.out.println("ingrese la opcion deseada: ");
            opc = sc.nextInt();


            switch(opc){
                case 1:
                    cola = new MiColaProceso();
                    break;
                case 2:
                    if(cola == null){
                        System.out.println("Primero debe crear la cola");
                    }else {
                        sc.nextLine();
                        System.out.println("Ingrese el titulo: ");
                        titulo = sc.nextLine();
                        System.out.println("ingrese el autor: ");
                        autor = sc.nextLine();
                        System.out.println("Ingresa el codigo del libro");
                        isbn = sc.nextLine();
                        Trabajo trabajo = new Trabajo(titulo, autor,isbn);
                        cola.encolar(trabajo);
                    }
                    break;
                case 3:
                    if(cola != null){
                        cola.eliminar();
                    }else{
                        System.out.println("la cola no ha sido creada");
                    }
                    break;
                case 4:
                    if(cola != null){
                        Trabajo trabajoCabeza = cola.obtener();
                        if(trabajoCabeza != null){
                            System.out.println("Cabeza de la cola" + trabajoCabeza);
                        }
                    }else{
                        System.out.println("la cola no ha sido creada");
                    }
                    break;
                case 5:
                    if(cola != null){
                        cola.mostrarCola();
                    }else {
                        System.out.println("la cola no ha sido creada");
                    }

                    break;
                case 6:
                    if(cola != null){
                        cola.vaciarCola();
                    }else{
                        System.out.println("La cola no ha sido creada");
                    }
                    break;
                case 7:
                    if(cola!= null){
                        cola.destruirCola();
                        cola = null;
                    }else{
                        System.out.println("la cola no ha sido creada");
                    }

                    break;
                default:
                    if(opc!=0){
                        System.out.println("la opcion ingresada no es correcta");
                    }
            }

        }while(opc != 0);

    }

}

