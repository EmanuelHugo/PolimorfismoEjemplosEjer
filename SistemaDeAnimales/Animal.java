package SistemaDeAnimales;

public class Animal {
    protected String nombre;
    protected int energia;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }

    public void Moverse() {
        System.out.println("El animal se mueve de manera genérica.");
    }

    public void Comer() {
        System.out.println("El animal está comiendo.");
    }
    
    

}
