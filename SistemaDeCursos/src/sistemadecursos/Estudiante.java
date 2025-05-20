package sistemadecursos;

public class Estudiante extends Persona {

    private int legajo;
    private Curso curso;

    public Estudiante(String nombre, String apellido, int dni, int legajo, Curso curso) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
        this.curso = curso;
    }

    @Override
    public String getInformacion() {
        return super.getInformacion() + ", Legajo: " + legajo + ", " + curso.getInformacion();
    }

}
