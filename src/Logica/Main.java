package Logica;

//sesion de aprendizaje para aprender Herencia
public class Main {
    public static void main(String[] args) {

        Trabajador tbj1 = new Trabajador();
        tbj1.setProfesion("Ingeniero");
        tbj1.setEmpresa("Google");
        tbj1.setPuesto("Desarrollador");
        tbj1.setNombre("Anthony");
        tbj1.setApellido("Chavesta");

        System.out.println("-----------------------------------");
        System.out.println("La profesion de mi trabajador es: "+tbj1.getProfesion());
        System.out.println("La empresa de mi trabajador es: "+tbj1.getEmpresa());
        System.out.println("El puesto de mi trabajador es: "+tbj1.getPuesto());
        System.out.println("El nombre de mi trabajador es: "+tbj1.getNombre());
        System.out.println("El apellido de mi trabajador es: "+tbj1.getApellido());

        System.out.println("-----------------------------------");

        Alumno alu1 = new Alumno();
        alu1.setEdad(24);
        alu1.setNombre("Anthony");
        alu1.setApellido("Chavesta");

        System.out.println("-----------------------------------");
        System.out.println("El nombre de mi alumno 2 es :"+alu1.getNombre());
        System.out.println("La edad de mi alumno 2 es :"+alu1.getEdad());
        System.out.println("El Apellido de mi alumno 2 es :"+alu1.getApellido());

        System.out.println("-----------------------------------");

    }
}
