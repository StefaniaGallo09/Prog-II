
package sistemadecursos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear cursos
        Curso curso1 = new Curso("Programacion en Java", 6);
        Curso curso2 = new Curso("Bases de Datos", 4);

        // Crear estudiantes
        Estudiante est1 = new Estudiante("Daira", "Santillan", 12345678, 1001, curso1);
        Estudiante est2 = new Estudiante("Ana", "Gomez", 87654321, 1002, curso2);
        Estudiante est3 = new Estudiante("Luis", "Martinez", 11223344, 1003, curso1);

        // Almacenar estudiantes en un ArrayList
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(est1);
        estudiantes.add(est2);
        estudiantes.add(est3);

        // Mostrar información
        for (Estudiante e : estudiantes) {
            System.out.println(e.getInformacion());
        }
    }
}

