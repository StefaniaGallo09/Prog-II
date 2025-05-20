package sistema.de.taller.mecanico;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Reparable> taller = new ArrayList<>();
        
        taller.add(new Auto("Toyota"));
        taller.add(new Auto("Fiat"));
        taller.add(new Moto("Guerrero"));
        taller.add(new Moto("Corven"));

        // Polimorfismo: todos los elementos son reparables
        for (Reparable r : taller) {
            r.reparar(); // Se llama al método reparar() de Auto o Moto según el tipo real
        }
    }   
}
