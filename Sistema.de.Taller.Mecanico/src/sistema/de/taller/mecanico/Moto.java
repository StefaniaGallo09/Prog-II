package sistema.de.taller.mecanico;

public class Moto extends Vehiculo implements Reparable {

    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void reparar() {
        System.out.println("Reparando moto de la marca " + marca);
    }
}
