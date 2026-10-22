package Logica;

public class Alumno {
    int edad;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(int edad, String nombre, String apellido) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Usaremos los getters y setters
    //Getter : Obtener - Traer
    //Setter: Mostrar - Colocar


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
