package pilas;

import java.util.Scanner;

public class Ejemplo {
    private static Scanner sc = new Scanner(System.in);
    private static int opc ;
    private static String nomTrabajo,puestoTrabajo;
    public static void main(String[] args) {
        URL google = new URL("http://www.google.es");
        URL makigas = new URL("http://www.makigas.es");
        Pila pila = new MiPila();


/*
        Pila pila = new MiPila();
        imprimirEstado(pila);
        pila.apilar(google);
        imprimirEstado(pila);
        pila.apilar(makigas);
        imprimirEstado(pila);
        while(!pila.vacia()){
            pila.desapilar();
            imprimirEstado(pila);
        }
        }
*/
        // Menu
        do{
            System.out.println("0- SALIR");
            System.out.println("1- CREAR PILA");
            System.out.println("2- Apilar");
            System.out.println("3- DESAPILAR");
            System.out.println("4- MOSTRAR CIMA");
            System.out.println("5- MOSTRAR PILA");
            System.out.println("6- VACIAR PILA");
            System.out.println("7- DESTRUIR PILA");
            System.out.println("ingrese la opcion deseada: ");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    if(pila.vacia()){
                        System.out.println("Pila creada");
                    }else{
                        System.out.println("La pila ya ha sido creada");
                    }
                    break;

                case 2:
                    if(pila == null){
                        System.out.println("no es posible insertar debido a que no se ha creado");
                    }else{
                        System.out.println("ingrese el nombre de su trabajo: ");
                        nomTrabajo = sc.nextLine();
                        sc.nextLine();
                        URL trabajo = new URL  ("nombre: "+ nomTrabajo);

                        System.out.println("ingrese el nombre de su puesto");
                        puestoTrabajo = sc.nextLine();
                        URL puesto = new URL  ("puesto: "+ puestoTrabajo);

                        pila.apilar(trabajo);
                        pila.apilar(puesto);

                    }
                    break;
                case 3:
                    if(pila.vacia()){
                        System.out.println("no es posible desapilar debido a que no se ha creado");
                    }else{
                        pila.desapilar();
                    }
                    break;


                case 4:
                    if(pila.vacia()){
                        System.out.println("pila vacia");
                    }else{
                        URL cima = pila.obtener();
                        System.out.println("Cima: " + cima.getUrl());
                    }
                    break;

                case 5:
                    imprimirEstado(pila);
                    break;

                case 6:
                    if(pila.vacia()){
                        System.out.println("la pila esta vacia");
                    }else{
                        while(!pila.vacia()){
                            pila.desapilar();
                        }
                        System.out.println("la pila se ha vaciado");
                    }

                    break;

                case 7:
                    if(pila == null){
                        System.out.println("pila nula, imposible destruirla");
                    }else{
                        pila = null;
                        System.out.println("pila destruida con exito");
                    }
                    break;
                default:
                    if(opc != 0){
                        System.out.println("la opcion elegida no es correcta");
                    }
            }


        }while (opc != 0);

    }

    private static void imprimirEstado(Pila pila){
        if(pila.vacia()){
            System.out.println("L=0 no hay nada en la pila");

        }
        else {
            System.out.println("L=" + pila.longitud() +" "+pila.obtener().getUrl());

        }
    }
}
