package figuras;
// Arely Sinai Muñoz Tapia

/*
* @author Muñoz Tapia Arely Sinai
*
* */

// importar escaner para extraer datos a ingresar
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seleccion;

        // Imprime el nombre completo al iniciar
        System.out.println("Nombre: Arely Sinai Muñoz Tapia");

        do {

            // menú de selección al usuario usando un do-while
            System.out.println("Menu:");
            System.out.println("0 Salir");
            System.out.println("1 Circulo");
            System.out.println("2 Cuadrado");
            System.out.println("3 Esfera");
            System.out.println("4 Cubo");
            System.out.println("Ingrese su opcion:");

            seleccion = scanner.nextInt();
            scanner.nextLine(); // salto de línea

            switch (seleccion) { //según el número del usuario
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                case 1:
                    menuCirculo(scanner);
                    break;
                case 2:
                    menuCuadrado(scanner);
                    break;
                case 3:
                    menuEsfera(scanner);
                    break;
                case 4:
                    menuCubo(scanner);
                    break;
                default:
                    System.out.println("Opción no valida. Intente nuevamente.");
            }
        } while (seleccion != 0);

    }

    // calcular el área de la figura
    private static void menuCirculo(Scanner scanner) {
        System.out.println("Ingrese el radio del circulo:");
        double radio = scanner.nextDouble(); //tomar el número del usuario
        Circulo circulo = new Circulo(radio); // llamada a la clase círculo
        System.out.println("Area del circulo: " + circulo.calcularArea()); // llama a la funcion de la clase círculo para calcular el área
    }

    private static void menuCuadrado(Scanner scanner) {
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
    }

    private static void menuEsfera(Scanner scanner) {
        System.out.println("Ingrese el radio de la esfera:");
        double radio = scanner.nextDouble();
        Esfera esfera = new Esfera(radio);
        System.out.println("Volumen de la esfera: " + esfera.calcularVolumen());
    }

    private static void menuCubo(Scanner scanner) {
        System.out.println("Ingrese el lado del cubo:");
        double lado = scanner.nextDouble();
        Cubo cubo = new Cubo(lado);
        System.out.println("Volumen del cubo: " + cubo.calcularVolumen());
    }
}

// clases dentro del main
// se creará una clase por cada figura donde se guardarán los datos para ser calculados y poder sacar el área/volumen de las figuras

class Circulo {
    private double radio; //crear variable para guardar el dato del usuario

    //método para la variable de radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    // métodos get y set para obtener y asignar valores
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // encontrar valores y la clase
    @Override // para la sobreescritura
    public boolean equals(Object o) { // equals para comparación de variables
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return Double.compare(circulo.radio, radio) == 0;
    }

    @Override
    public int hashCode() { // método para comparar objetos
        return Double.hashCode(radio);
    }

    @Override
    public String toString() { // string a objeto
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    public double calcularArea() {
        return Math.PI * radio * radio; // fórmula par acalcular el área con el método math (extraer pi)
    }
}

class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuadrado cuadrado = (Cuadrado) o;
        return Double.compare(cuadrado.lado, lado) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(lado);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }

    public double calcularArea() {
        return lado * lado;
    }
}

class Esfera {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Esfera esfera = (Esfera) o;
        return Double.compare(esfera.radio, radio) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radio);
    }

    @Override
    public String toString() {
        return "Esfera{" +
                "radio=" + radio +
                '}';
    }

    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
}

class Cubo {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cubo cubo = (Cubo) o;
        return Double.compare(cubo.lado, lado) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(lado);
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "lado=" + lado +
                '}';
    }

    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }
}

