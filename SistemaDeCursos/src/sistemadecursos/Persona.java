package sistemadecursos;

public class Persona {

    private String nombre;
    private String apellido;
    private int dni;

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String mostrarInfo() {
        return "Nombre: " + nombre
                + "\nApellido: " + apellido
                + "\n dni: " + dni;
    }

    public String getInformacion() {
        return "NOmbre: " + nombre + " " + apellido + " DNI: " + dni;
    }
}
