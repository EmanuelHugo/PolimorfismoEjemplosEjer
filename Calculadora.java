package PolimorfismoEjemplos;

public class Calculadora{
    //Metodo para sumar dos enteros
    public int Sumar(int a, int b){
        return a + b;
    }

    //Metodo para sumar tres numeros enteros
    public int Sumar(int a, int b, int c){
        return a + b + c;
    }

    //Metodo para sumar dos numeros de punto flotante
    public double Sumar(double a, double b){
        return a + b; 
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma de dos enteros: " + calc.Sumar(5, 10));
        System.out.println("Suma de tres enteros: " + calc.Sumar(5, 10, 15));
        System.out.println("Suma de dos numeros de punto flotante: " + calc.Sumar(3.5, 2.0));
    }
}