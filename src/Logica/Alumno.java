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

    public void mostrarNombre() {
        System.out.println("Mi nombre es: "+nombre);
    }
}
