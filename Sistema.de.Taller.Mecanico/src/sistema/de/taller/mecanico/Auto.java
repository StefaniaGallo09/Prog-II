
package sistema.de.taller.mecanico;

public class Auto extends Vehiculo implements Reparable{

    public Auto(String marca) {
        super(marca);
    }

    @Override
    public void reparar() {
        System.out.println("Reparando auto de la marca " + marca);
    }
    
}
