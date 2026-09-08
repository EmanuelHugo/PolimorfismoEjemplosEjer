package Tarea2408;

public class Supervisor extends Empleado {
    private int bonificacion = 15;

    public Supervisor(String nombre, int cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (sueldoBase * bonificacion)/100;
    }

    @Override
    public void obtenerDetalles() {
        System.out.printf(nombre + " - Supervisor" + " - " + "%.2f%n", calcularSueldo());
    }
}
