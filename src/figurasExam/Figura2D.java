package figurasExam;
// MUÑOZ TAPIA ARELY SINAI
// HERNANDEZ ZAMBRANO AXEL JOSUE

abstract class Figura2D extends Figura {
    public Figura2D(String nombre) {
        super(nombre); // llama al constructor de la clase padre
    }

    @Override
    public double calcularVolumen() {
        return 0; // figuras 2D no tienen volumen
    }
}

// FIGURAS Y SUS FUNCIONES
class Circulo extends Figura2D {
    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

class Cuadrado extends Figura2D {
    private double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}

class Triangulo extends Figura2D {
    private double base, altura;

    public Triangulo(double base, double altura) {
        super("Triángulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        // Suponiendo un triángulo equilátero
        return 3 * base;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

class Rectangulo extends Figura2D {
    private double largo, ancho;

    public Rectangulo(double largo, double ancho) {
        super("Rectángulo");
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }
}