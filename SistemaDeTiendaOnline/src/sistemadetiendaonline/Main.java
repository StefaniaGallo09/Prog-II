package sistemadetiendaonline;

public class Main {

    public static void main(String[] args) {
        CarritoDeCompra carrito = new CarritoDeCompra();

        carrito.agregarProducto(new Electrodomestico("Heladera", 1000000, "Samsung"));
        carrito.agregarProducto(new Electrodomestico("Frezzer", 500000, "Drean"));
        carrito.agregarProducto(new Ropa("Remera", 35000, "Lacoste"));
        carrito.agregarProducto(new Ropa("Pantalon Baggi", 65000, "Cosmic"));

        carrito.mostrarProductos();
        System.out.println("Total de la compra: $" + carrito.calcularTotal());

    }
}
