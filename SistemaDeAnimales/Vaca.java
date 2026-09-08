package SistemaDeAnimales;

public class Vaca extends Animal {
    private int patas;
    
    public Vaca(String nombre, int patas) {
    super(nombre);
    this.patas = patas;
    }

    @Override
    public void hacerSonido() {
        System.out.println("La vaca " + nombre + " hace 'muuuu'.");
    }

    public void Caminar() {
        System.out.println("La vaca " + nombre + " camina sobre sus " + patas + " patas.");
    }

    @Override
    public void Moverse() {
        System.out.println("La vaca " + nombre + " corre y salta.");
    }
    
}
