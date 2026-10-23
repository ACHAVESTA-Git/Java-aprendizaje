package Logica;

public class Trabajador extends Persona{
    String profesion;
    String empresa;
    String puesto;

    public Trabajador (){
    }

    public Trabajador(String profesion, String empresa, String puesto, int id,
                      String nombre, String apellido, int edad, String sexo){
        super(id, nombre, apellido, edad, sexo);
        this.profesion = profesion;
        this.empresa = empresa;
        this.puesto = puesto;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
