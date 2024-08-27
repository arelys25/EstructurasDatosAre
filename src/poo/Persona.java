package poo;

import java.util.Objects;

/**
 * @author Muñoz Tapia Arely Sinai
 */
public class Persona {

    // 1. atributos de una clase
    private String curp;
    private String apellidos;
    private String nombres;
    private String nacimiento;
    private Integer edad;

    // 2. constructor:

    public Persona (){
        // constructor vacío para crear el objeto persona de la opción 1 del menú
    }

    // constructor con datos:
    public Persona (String curp, String apellidos, String nombres, String nacimiento, Integer edad){
        // establecer variables anteriores para que puedan quedar registradas cuando el usuario ingrese los datos
        this.curp = curp;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.nacimiento = nacimiento;
        this.edad = edad;

    }


    // 3. set y get

    // los métodos set son de tipo void
    public void setCurp(String curp){
        this.curp = curp;

    }

    // public + tipo de dato y el get
    public String getCurp(){
        return curp;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    // 4. equals y hash code
    // equals compara 2 objetos entre sí para que sean únicas e irrepetibles
    // hash code es una secuencia de valores numéricos que diferencían un valor. Es un cifrado o una llave para hacer el dato más único

    @Override // significa sobreescritura, aplicamos polimorfismo
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.curp);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // todos los valores de la clase (this)
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.curp, other.curp);
    }


    // 5. toString
    // sirve para convertir a string el estado del objeto (los valores que se guardan)
    // se seleccionan los datos a mostrar, si hubiera una contaseña, no se tendría que mostrar

    // en este caso, usaré el método toString para mostrar el menú con los datos ya ingresados por el usuario
    @Override
    public String toString() {
        return "Persona {" + "\nCURP: " + curp + "\nApellidos: " + apellidos + "\nNombres: " + nombres + "\nNacimiento: " + nacimiento + "\nEdad: " + edad + '}';
    }

}