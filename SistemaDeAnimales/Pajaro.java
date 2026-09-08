package SistemaDeAnimales;

public class Pajaro extends Animal {
    private double envergaduraAlas;

    public Pajaro(String nombre, double envergaduraAlas) {
        super(nombre);
        this.envergaduraAlas = envergaduraAlas;
    }

    public void hacerSonido() {
        System.out.println("El pájaro " + nombre + " hace 'Pío Pío'.");
    }

    public void volar() {
        System.out.println("El pájaro " + nombre     + " está volando.");
    }

    public void Moverse() {
        System.out.println("El pájaro " + nombre + " se mueve volando.");
    }
}
