package sistemadecursos;

public class Curso {
    private String nombreCurso;
    private int duracion;

    public Curso(String nombreCurso, int duracion) {
        this.nombreCurso = nombreCurso;
        this.duracion = duracion;
    }

    public String getInformacion() {
        return "Curso: " + nombreCurso + ", Duración: " + duracion + " meses";
    }
}
