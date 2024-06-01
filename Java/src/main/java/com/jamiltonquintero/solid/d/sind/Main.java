package com.jamiltonquintero.solid.d.sind;

// Clase que representa una sartén específica
class Sarten {
    public void calentar() {
        System.out.println("Calentando la sartén...");
    }

    public void cocinarArepa() {
        System.out.println("Cocinando arepa en la sartén...");
    }
}

// Clase Cocinero que depende de la clase Sarten
class Cocinero {
    private Sarten sarten;

    public Cocinero() {
        this.sarten = new Sarten();
    }

    public void prepararArepa() {
        sarten.calentar();
        sarten.cocinarArepa();
        System.out.println("Arepa lista para el desayuno!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cocinero cocinero = new Cocinero();
        cocinero.prepararArepa();
    }
}