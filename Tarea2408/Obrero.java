package Tarea2408;

public class Obrero extends Empleado {
    private int Bonificacion = 0;

    public Obrero(String nombre, int cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (sueldoBase * Bonificacion)/100;
    }

    @Override
    public void obtenerDetalles() {
        System.out.printf(nombre + " - Obrero" + " - " + "%.2f%n", calcularSueldo());
        
    }
}