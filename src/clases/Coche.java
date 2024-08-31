package clases;
import clases.Vehiculo;

import java.util.Objects;


public class Coche extends Vehiculo {
    String carroceria;

    public Coche(String matricula, String marca, String anio, String modelo, String color, String carroceria) {
        super(matricula, marca, anio, modelo, color);
        this.carroceria = carroceria;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coche coche = (Coche) o;
        return Objects.equals(carroceria, coche.carroceria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carroceria);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "carroceria='" + carroceria + '\'' +
                '}';
    }
}
