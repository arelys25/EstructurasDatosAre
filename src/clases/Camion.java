package clases;

import java.util.Objects;

public class Camion extends Vehiculo{

    String tonelaje;
    public Camion(String matricula, String marca, String anio, String modelo, String color, String tonelaje) {
        super(matricula, marca, anio, modelo, color);
        this.tonelaje = tonelaje;
    }

    public String getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(String tonelaje) {
        this.tonelaje = tonelaje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Camion camion = (Camion) o;
        return Objects.equals(tonelaje, camion.tonelaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tonelaje);
    }

    @Override
    public String toString() {
        return "Camion{" +
                "tonelaje='" + tonelaje + '\'' +
                '}';
    }
}
