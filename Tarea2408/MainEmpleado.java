package Tarea2408;

import java.util.ArrayList;

public class MainEmpleado {
    public static void main(String[] args) {
        double total = 0.0;

        ArrayList<Empleado> empleados = new ArrayList<>();

        Empleado Laura = new Gerente("Juan", 123456, 4000.0);
        Empleado Roberto = new Gerente("Maria", 654321, 4500.00);
        Empleado Ana = new Supervisor("Pedro", 987654, 2500.00);
        Empleado Pedro = new Supervisor("Juan", 123456, 2700.0);
        Empleado Carlos = new Obrero("Maria", 654321, 1500.0);
        Empleado Maria = new Obrero("Pedro", 987654, 1600.0);
        Empleado Juan = new Obrero("Maria", 654321, 1550.0);
        Empleado Sofia = new Obrero("Pedro", 987654, 1580.0);

        empleados.add(Laura);
        empleados.add(Roberto);
        empleados.add(Ana);
        empleados.add(Pedro);
        empleados.add(Carlos);
        empleados.add(Maria);
        empleados.add(Juan);
        empleados.add(Sofia);

        for (Empleado empleado : empleados) {
            System.out.print(empleado.id + " - ");
            empleado.obtenerDetalles();
            total += empleado.calcularSueldo();
        }
        System.out.println("_".repeat(150));
        System.out.println("Total de sueldos: " + total);
        Empleado.mostrarEstadisticas();
    }
}
