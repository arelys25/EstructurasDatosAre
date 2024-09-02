package figurasExam;
// HERNANDEZ ZAMBRANO AXEL JOSUE
// MUÑOZ TAPIA ASRELY SINAI

abstract class Figura {

    // ATRIBUTOS
    protected String nombre;
    // nombre de la figura que el usuario desea ingresar

    // METODOS GET Y SET
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // METODOS
    public abstract double calcularPerimetro();
    public abstract double calcularArea();
    public abstract double calcularVolumen();
}