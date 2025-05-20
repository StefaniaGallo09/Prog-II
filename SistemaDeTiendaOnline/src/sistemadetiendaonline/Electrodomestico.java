package sistemadetiendaonline;

public class Electrodomestico extends Producto {

    public Electrodomestico(String nombre, int precioBase, String marca) {
        super(nombre, precioBase, marca);
    }

    @Override
    public double calcularPrecioFinal() {
        //le aplico el 21% de IVA al producto en cuestion
        return precioBase * (1.21);
    }
}
