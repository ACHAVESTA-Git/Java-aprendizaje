package Logica;

public class Consultor extends Persona{

    int id_consultor;
    String departamento_consultor;

    public Consultor (){
    };

    public Consultor(int id_consultor, String departamento_consultor) {
        this.id_consultor = id_consultor;
        this.departamento_consultor = departamento_consultor;
    }

    public int getId_consultor() {
        return id_consultor;
    }

    public void setId_consultor(int id_consultor) {
        this.id_consultor = id_consultor;
    }

    public String getDepartamento_consultor() {
        return departamento_consultor;
    }

    public void setDepartamento_consultor(String departamento_consultor) {
        this.departamento_consultor = departamento_consultor;
    }
}
