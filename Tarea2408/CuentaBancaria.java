package Tarea2408;

import java.util.ArrayList;

public class CuentaBancaria {
    protected String titular;
    protected double saldo;
    final protected int id;

    public static double contador = 0;
    protected static int proximoid = 1;

    
    protected static ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
        this.id = proximoid++;
        contador += saldo;
        cuentas.add(this);
    }

    public static double obtenerTotalCuentas(){
        return contador;
    }
    
    public static int obtenerProximoid(){
       return cuentas.size();
    }
    
    public static void reporteGlobal(){
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println("["+ cuenta.id + "]" + " - " + cuenta.titular + " - " + cuenta.saldo);

        }
    }
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Maria", 2000);
        CuentaBancaria cuenta3 = new CuentaBancaria("Pedro", 1500);
        CuentaBancaria cuenta4 = new CuentaBancaria("Ana", 4000);
        CuentaBancaria cuenta5 = new CuentaBancaria("Luis", 2555);

        System.out.println("Total de cuentas: " + CuentaBancaria.obtenerProximoid());
        System.out.println("Total de saldo en todas las cuentas: " + CuentaBancaria.obtenerTotalCuentas());

        CuentaBancaria.reporteGlobal();
    }

}
