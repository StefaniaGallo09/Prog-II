public class DVD extends MaterialBiblioteca {
    private int duracionEnMinutos;

    public DVD(String titulo, String autor, int añoPublicacion, int duracionEnMinutos) {
        super(titulo, autor, añoPublicacion);
        this.duracionEnMinutos = duracionEnMinutos;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Duracion: " + duracionEnMinutos + " minutos");
    }
}
