package arbolBinarioBusqueda;

import java.util.Objects;

public class Hospital implements Nombrable, Comparable<Hospital>{
    private String nombre;
    private String especialidad;
    private int numInternos;

    public Hospital(String nombre, String especialidad, int numInternos) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.numInternos = numInternos;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumInternos() {
        return numInternos;
    }

    public void setNumInternos(int numInternos) {
        this.numInternos = numInternos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Objects.equals(nombre, hospital.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", numInternos=" + numInternos +
                '}';
    }

    @Override
    public int compareTo(Hospital o) {
        return 0;
    }
}
