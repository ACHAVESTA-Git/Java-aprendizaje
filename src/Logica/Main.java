package Logica;

//sesion de aprendizaje para aprender Polimorfismo
public class Main {
    public static void main(String[] args) {

        Persona vector [] = new Persona[4];
        vector [0] = new Persona();
        vector [1] = new Consultor();
        vector [2] = new Trabajador();
        vector [3] = new Jefe();

        Persona perso = new Persona();
        perso.hablar();
    }
}