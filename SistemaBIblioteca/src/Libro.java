public class Libro extends MaterialBiblioteca {
    private String isbn;

    public Libro(String titulo, String autor, int añoPublicacion, String isbn) {
        super(titulo, autor, añoPublicacion);
        this.isbn = isbn;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("ISBN: " + isbn);
    }
}
