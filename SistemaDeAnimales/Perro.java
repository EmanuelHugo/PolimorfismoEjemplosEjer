package SistemaDeAnimales;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro " + nombre + " hace 'Guau'.");
    }

    public void traerObjeto() {
        System.out.println("El perro " + nombre + " trae un objeto.");
    }

    @Override
    public void Moverse() {
        System.out.println("El perro " + nombre + " corre y salta.");
    }
}
