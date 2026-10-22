package Logica;

public class Poo {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno(24, "Anthony", "Chavesta");

        System.out.println("-----------------------------------");
        System.out.println("El nombre de mi alumno 2 es :"+alumno2.getNombre());
        System.out.println("La edad de mi alumno 2 es :"+alumno2.getEdad());
        System.out.println("El Apellido de mi alumno 2 es :"+alumno2.getApellido());

        alumno1.setEdad(20);
        alumno1.setNombre("Juan");
        alumno1.setApellido("Perez");

        System.out.println("-----------------------------------");
        System.out.println("El nombre de mi alumno 1 es: "+alumno1.getNombre());
        System.out.println("La edad de mi alumno 1 es: "+alumno1.getEdad());
        System.out.println("El apellido de mi alumno 1 es: "+alumno1.getApellido());

        alumno2.setEdad(10);
        System.out.println("-----------------------------------");
        System.out.println("El nombre de mi alumno 2 es :"+alumno2.getNombre());
        System.out.println("La edad de mi alumno 2 es :"+alumno2.getEdad());
        System.out.println("El Apellido de mi alumno 2 es :"+alumno2.getApellido());
    }


}
