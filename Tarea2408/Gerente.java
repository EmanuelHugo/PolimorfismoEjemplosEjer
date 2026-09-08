package Tarea2408;

public class Gerente extends Empleado {
    private int bonificacion = 25;

    public Gerente(String nombre, int cedula, double sueldoBase) {
    super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (sueldoBase * bonificacion)/100;
    }

    @Override
    public void obtenerDetalles() {
        System.out.printf(nombre + " - Gerente" + " - " + "%.2f%n", calcularSueldo());
        
    }


}
