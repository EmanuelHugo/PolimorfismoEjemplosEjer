package PolimorfismoEjemplos;

class Figura {
    public void dibujar() {
        System.out.println("Dibujando una figura");
    }
}

class Circulo extends Figura {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }
}

class Triangulo extends Figura {
    public void dibujar() {
        System.out.println("Dibujando un triangulo");
    }
}

class Cuadro extends Figura {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }
}