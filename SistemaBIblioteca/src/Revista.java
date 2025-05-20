public class Revista extends MaterialBiblioteca {
    private int numeroEdicion;

    public Revista(String titulo, String autor, int añoPublicacion, int numeroEdicion) {
        super(titulo, autor, añoPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de edicion: " + numeroEdicion);
    }
}
