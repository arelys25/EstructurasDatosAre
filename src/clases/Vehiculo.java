package clases;

import java.util.Objects;

public final class Vehiculo {

    // ATRIBUTOS
    private String matricula;
    private String marca;
    private String modelo;
    private String anio;
    private String color;



    // CONSTRUCTORES aplicando sobrecarga
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public Vehiculo(String matricula, String marca, String anio) {
        // this.matricula = matricula;
        this(matricula); // utilizar el primer contructor mandando a llamar la función
        this.marca = marca;
        this.anio = anio;
    }

    public Vehiculo(String matricula, String marca,String anio, String modelo,  String color) {
        //this.matricula = matricula;
        //this.marca = marca;
        //this.año = año;
        this(matricula, marca, anio);
        this.modelo = modelo;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // EQUALS Y HASHCODE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    // TOSTRING


    @Override
    public String toString() {
        return "Vehiculo{\n" +
                "Matricula: '" + matricula + '\'' +
                "\nMarca: '" + marca + '\'' +
                "\nModelo: '" + modelo + '\'' +
                "\nAño: '" + anio + '\'' +
                "\nColor: '" + color + '\'' +
                '}';
    }
}
