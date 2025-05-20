package sistemadetiendaonline;

public class Ropa extends Producto {

    public Ropa(String nombre, int precioBase, String marca) {
        super(nombre, precioBase, marca);
    }

    @Override
    public double calcularPrecioFinal() {
        //le aplico el 10% de DESCEUNTO al producto en cuestion
        return precioBase * (0.90);
    }
}
