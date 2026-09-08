package Tarea2408;

public abstract class Empleado {
    protected String nombre;
    protected int cedula;
    protected double sueldoBase;
    protected int id;
    protected static int totalEmpleados = 0;
    public static int proximoid = 1001;

    Empleado(String nombre, int cedula, double sueldoBase){
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldoBase = sueldoBase;
        this.id = proximoid++;
        totalEmpleados++;
    }

    abstract public double calcularSueldo();
    abstract public void obtenerDetalles();

    public static int obtenerTotalEmpleados() {
        return totalEmpleados;
    }
    public static void mostrarEstadisticas() {
        System.out.println("Total de empleados: " + totalEmpleados);
    }

}

