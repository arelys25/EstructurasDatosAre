package practica2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private String matricula;
    private String numMotor;


    // constructor base
    public Vehiculo(String marca, String modelo, int anio, String color, String matricula){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.matricula = matricula;
        this.numMotor = "";

    }


    // contructor con numMotor
    public Vehiculo(String marca, String modelo, int anio, String color,String matricula,String numMotor){
        this(marca, modelo, anio, color,"xxxx-xxxx");
        this.numMotor = numMotor;


    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
