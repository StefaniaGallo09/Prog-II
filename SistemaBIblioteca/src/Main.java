import java.util.ArrayList;
//import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<MaterialBiblioteca> materiales = new ArrayList<>();

        materiales.add(new Libro("El Quijote", "Miguel de Cervantes", 1605, "978-3-16-148410-0"));
        materiales.add(new Revista("National Geographic", "Varios", 2023, 198));
        materiales.add(new DVD("Matrix", "Lana Wachowski", 1999, 136));

        for (MaterialBiblioteca material : materiales) {
            System.out.println("----- Material -----");
//            JOptionPane.showMessageDialog(null, material.mostrarInformacion());
            material.mostrarInformacion();
            System.out.println();
        }
    }
}
