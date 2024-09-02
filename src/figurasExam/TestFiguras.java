package figurasExam;
// MUÑOZ TAPIA ARELY SINAI
// HERNANDEZ ZAMBRANO AXEL JOSUE

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestFiguras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figura figura = null;

        System.out.println("\nHERNANDEZ ZAMBRANO AXEL JOSUE");
        System.out.println("MUÑOZ TAPIA ARELY SINAI\n");

        while (true) {
            int opcion;
            System.out.println("Seleccione una figura:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Esfera");
            System.out.println("6. Cubo");
            System.out.println("7. Cilindro");
            System.out.println("8. Pirámide");
            System.out.println("9. Salir\n");
            System.out.println("Ingrese la opcion deseada: ");

            try {
                opcion = scanner.nextInt();
                // opcion para salir
                if (opcion == 9) {
                    System.out.println("Fin del programa.\n");
                    System.out.println("MUÑOZ TAPIA ARELY SINAI\nHERNANDEZ ZAMBRANO AXEL JOSUE\n");
                    break;
                }

                // switch para pedirle los datos al usuario
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el radio del círculo: ");
                        // extrae dato
                        double radioCirculo = scanner.nextDouble();
                        // crea obj figura de la clase circulo pasandole el radio como parametro
                        figura = new Circulo(radioCirculo);
                        break;
                    case 2:
                        System.out.print("Ingrese el lado del cuadrado: ");
                        double ladoCuadrado = scanner.nextDouble();
                        figura = new Cuadrado(ladoCuadrado);
                        break;
                    case 3:
                        System.out.print("Ingrese la base del triángulo: ");
                        double baseTriangulo = scanner.nextDouble();
                        System.out.print("Ingrese la altura del triángulo: ");
                        double alturaTriangulo = scanner.nextDouble();
                        figura = new Triangulo(baseTriangulo, alturaTriangulo);
                        break;
                    case 4:
                        System.out.print("Ingrese el largo del rectángulo: ");
                        double largoRectangulo = scanner.nextDouble();
                        System.out.print("Ingrese el ancho del rectángulo: ");
                        double anchoRectangulo = scanner.nextDouble();
                        figura = new Rectangulo(largoRectangulo, anchoRectangulo);
                        break;
                    case 5:
                        System.out.print("Ingrese el radio de la esfera: ");
                        double radioEsfera = scanner.nextDouble();
                        figura = new Esfera(radioEsfera);
                        break;
                    case 6:
                        System.out.print("Ingrese el lado del cubo: ");
                        double ladoCubo = scanner.nextDouble();
                        figura = new Cubo(ladoCubo);
                        break;
                    case 7:
                        System.out.print("Ingrese el radio del cilindro: ");
                        double radioCilindro = scanner.nextDouble();
                        System.out.print("Ingrese la altura del cilindro: ");
                        double alturaCilindro = scanner.nextDouble();
                        figura = new Cilindro(radioCilindro, alturaCilindro);
                        break;
                    case 8:
                        System.out.print("Ingrese la base de la piramide: ");
                        double basePiramide = scanner.nextDouble();
                        System.out.print("Ingrese la altura de la piramide: ");
                        double alturaPiramide = scanner.nextDouble();
                        figura = new Piramide(basePiramide, alturaPiramide);
                        break;
                    default:
                        System.out.println("Opcion no valida\n.");
                        continue; // se utiliza continue en vez de break para que el programa haga otro loop
                }

                System.out.println("\nFigura seleccionada: " + figura.getNombre());
                System.out.println("Perímetro: " + figura.calcularPerimetro());
                System.out.println("Área: " + figura.calcularArea());
                System.out.println("Volumen: " + figura.calcularVolumen());
            } catch (InputMismatchException e) {
                System.out.println("Error: no ingresaste un numero valido.");
                break;
            }

        }

        scanner.close();
    }
}
