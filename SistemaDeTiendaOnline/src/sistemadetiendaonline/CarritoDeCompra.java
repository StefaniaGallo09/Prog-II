package sistemadetiendaonline;

import java.util.ArrayList;

public class CarritoDeCompra {

    private ArrayList<Producto> productos;

    public CarritoDeCompra() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularPrecioFinal();
        }
        return total;
    }

    public void mostrarProductos() {
        for (Producto p : productos) {
            System.out.println(p.getNombre() + " - Precio Final: $" + p.calcularPrecioFinal());
        }
    }
}
