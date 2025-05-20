public class MaterialBiblioteca {
    protected String titulo;
    protected String autor;
    protected int anoPublicacion;

    public MaterialBiblioteca(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = añoPublicacion;
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Fecha de publicacion: " + anoPublicacion);
        
    }

    @Override
    public String toString() {
        return "MaterialBiblioteca{" + "titulo=" + titulo + ", autor=" + autor + ", anoPublicacion=" + anoPublicacion + '}';
    }
}
