package listaDobleGui;

import java.util.Objects;

public class Hospital implements Nombrable, Comparable<Hospital>{
    private String nombre;
    private String especialidad;
    private String direccion;
    private int numDoctores;
    private int numPacientes;

    public Hospital(String nombre, String especialidad, String direccion, int numDoctores, int numPacientes) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.direccion = direccion;
        this.numDoctores = numDoctores;
        this.numPacientes = numPacientes;
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

    public int getNumDoctores() {
        return numDoctores;
    }

    public void setNumDoctores(int numDoctores) {
        this.numDoctores = numDoctores;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumPacientes() {
        return numPacientes;
    }

    public void setNumPacientes(int numPacientes) {
        this.numPacientes = numPacientes;
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
                ", direccion='" + direccion + '\'' +
                ", numDoctores=" + numDoctores +
                ", numPacientes=" + numPacientes +
                '}';
    }

    @Override
    public int compareTo(Hospital o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }
}
