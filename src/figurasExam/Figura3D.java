package figurasExam;
// MUÑOZ TAPIA ARELY SINAI
// HERNANDEZ ZAMBRANO AXEL JOSUE

abstract class Figura3D extends Figura {
    public Figura3D(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularPerimetro() {
        return 0; // Las figuras 3D no tienen perímetro
    }
}

// FIGURAS Y SUS METODOS
class Esfera extends Figura3D {
    private double radio;

    public Esfera(double radio) {
        super("Esfera");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularVolumen() {
        return (4/3) * Math.PI * Math.pow(radio, 3);
    }
}

class Cubo extends Figura3D {
    private double lado;

    public Cubo(double lado) {
        super("Cubo");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }
}

class Cilindro extends Figura3D {
    private double radio, altura;

    public Cilindro(double radio, double altura) {
        super("Cilindro");
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 2 * Math.PI * radio * (radio + altura);
    }

    @Override
    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }
}

class Piramide extends Figura3D {
    private double base, altura;

    public Piramide(double base, double altura) {
        super("Piramide");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        // Área aproximada de una pirámide cuadrada
        return base * base + 2 * base * Math.sqrt((base / 2) * (base / 2) + altura * altura);
    }

    @Override
    public double calcularVolumen() {
        return (base * base * altura) / 3;
    }
}