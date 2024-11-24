package listaDobleGui;

import java.util.Objects;

public class Paciente implements Nombrable, Comparable<Paciente>{
    private String nombre;
    private String enfermedad;
    private String tratamiento;
    private String alergias;
    private int edad;

    public Paciente(String nombre, String enfermedad, String tratamiento, String alergias, int edad) {
        this.nombre = nombre;
        this.enfermedad = enfermedad;
        this.tratamiento = tratamiento;
        this.alergias = alergias;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toStringNombre() {
        return null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(nombre, paciente.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", enfermedad='" + enfermedad + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", alergias='" + alergias + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Paciente o) {
        return 0;
    }
}
