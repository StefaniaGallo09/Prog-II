package sistemadetiendaonline;

public class Producto implements Vendible {

    protected String nombre;
    protected double precioBase;
    protected String marca;

    public Producto(String nombre, int precioBase, String marca) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.marca = marca;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase;
    }

    public String getNombre() {
        return nombre;
    }
}
