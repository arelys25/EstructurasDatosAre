package clases;

import java.util.Objects;
// MUÑOZ TAPIA ARELY SINAI
// HERNANDEZ ZAMBRANO AXEL JOSUE
public class Moto extends Vehiculo {

    String cilindrada;
    public Moto(String matricula, String marca, String anio, String modelo, String color, String cilindrada) {
        super(matricula, marca, anio, modelo, color);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Moto moto = (Moto) o;
        return Objects.equals(cilindrada, moto.cilindrada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cilindrada);
    }

    @Override
    public String toString() {
        return "Vehiculo{\n" +
                "Matricula: '" + matricula + '\'' +
                "\nMarca: '" + marca + '\'' +
                "\nModelo: '" + modelo + '\'' +
                "\nAño: '" + anio + '\'' +
                "\nColor: '" + color + '\'' +
                "\nCilindrada: "+cilindrada+
                '}';
    }
}
