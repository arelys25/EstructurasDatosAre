package listaDobleGui;

import java.util.Objects;

public class Doctor implements Nombrable, Comparable<Doctor>{
    private String nombre;
    private String especialidad;
    private String departamento;
    private String horario;
    private int edad;

    public Doctor(String nombre, String especialidad, String departamento, String horario, int edad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.departamento = departamento;
        this.horario = horario;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
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
        Doctor doctor = (Doctor) o;
        return Objects.equals(nombre, doctor.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", departamento='" + departamento + '\'' +
                ", horario='" + horario + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Doctor o) {
        return 0;
    }
}
