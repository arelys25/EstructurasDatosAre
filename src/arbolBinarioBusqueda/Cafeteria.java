package arbolBinarioBusqueda;

import java.util.Objects;

public class Cafeteria implements Nombrable, Comparable<Cafeteria>{
    private String nombre;
    private String ubicacion;
    private int numExt;

    public Cafeteria(String nombre, String ubicacion, int numExt) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.numExt = numExt;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toStringNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumExt() {
        return numExt;
    }

    public void setNumExt(int numExt) {
        this.numExt = numExt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cafeteria cafeteria = (Cafeteria) o;
        return Objects.equals(nombre, cafeteria.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Cafeteria{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", numExt=" + numExt +
                '}';
    }

    @Override
    public int compareTo(Cafeteria o) {
        return 0;
    }
}
