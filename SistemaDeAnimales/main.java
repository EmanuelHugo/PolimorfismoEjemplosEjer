package SistemaDeAnimales;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        
        Gato Morris = new Gato("Morris", "Gris");
        Perro Chocoreta = new Perro("Chocoreta", "Caramelo");
        Pajaro Cocorro = new Pajaro("cocorro", 11.10);
        Vaca Lola = new Vaca("Lola", 4);
        
        ArrayList<Animal> Animales = new ArrayList<>();
        Animales.add(Morris);
        Animales.add(Chocoreta);
        Animales.add(Cocorro);
        Animales.add(Lola);

        for (Animal animal : Animales) {
            animal.hacerSonido();
            animal.Moverse();
            System.out.println("_".repeat(100));
        }
    }
}
