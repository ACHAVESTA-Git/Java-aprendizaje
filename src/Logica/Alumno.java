package Logica;

public class Alumno extends Persona{
    String grado;
    String colegio;
    String materia;

    public Alumno() {
    }

    public Alumno(String grado, String colegio, String materia, int id, String nombre, String Apellido, int edad, String sexo) {
        super(id, nombre, Apellido, edad, sexo);
        this.grado = grado;
        this.colegio = colegio;
        this.materia = materia;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
