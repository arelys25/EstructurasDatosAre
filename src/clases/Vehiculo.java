package clases;

import java.util.Objects;

public final class Vehiculo {

    // ATRIBUTOS
    private String matricula;
    private String marca;
    private String modelo;
    private String año;
    private String color;



    // CONSTRUCTORES aplicando sobrecarga
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public Vehiculo(String matricula, String marca, String año) {
        // this.matricula = matricula;
        this(matricula); // utilizar el primer contructor mandando a llamar la función
        this.marca = marca;
        this.modelo = año;
    }

    public Vehiculo(String matricula, String marca, String modelo, String año, String color) {
        //this.matricula = matricula;
        //this.marca = marca;
        //this.año = año;
        this(matricula, marca, año);
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

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
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
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año='" + año + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
