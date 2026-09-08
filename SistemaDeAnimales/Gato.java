package SistemaDeAnimales;

public class Gato extends Animal {
    private String color;

    public Gato(String nombre, String color){
        super(nombre);
        this.color = color;
    }
    @Override
    public void hacerSonido() {
        System.out.println("El gato " + nombre + " hace 'Miau'.");
    }
    public void Rasguniar(){
        System.out.println("El gato " + nombre + " está rasguñando.");
    }

    public void Moverse() {
        System.out.println("El gato " + nombre + " se mueve ágilmente.");
    }
}
