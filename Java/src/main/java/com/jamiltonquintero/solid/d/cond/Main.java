package com.jamiltonquintero.solid.d.cond;

import java.util.LinkedList;
import java.util.List;

// Interface que define el comportamiento de una sartén
interface InstrumentoDeCocina {
    void calentar();
    void cocinar();
}
interface EntragaPedido
{
    void entregarPedido();
}

// Implementación de la sartén que sigue la interfaz
class Sarten implements InstrumentoDeCocina {
    public void calentar() {
        System.out.println("Calentando la sartén...");
    }

    public void cocinar() {
        System.out.println("Cocinando arepa en la sartén...");
    }
}

// Otra implementación que podría ser una parrilla
class Parrilla implements InstrumentoDeCocina {
    public void calentar() {
        System.out.println("Calentando la parrilla...");
    }

    public void cocinar() {
        System.out.println("Cocinando arepa en la parrilla...");
    }
}

class Domiciliario implements EntragaPedido
{
    public void entregarPedido() {
        System.out.println("Pedido entregado");
    }
}

// Clase Cocinero que depende de la interfaz InstrumentoDeCocina
class Cocinero {
    private InstrumentoDeCocina instrumento;
    private EntragaPedido entregaPedido;

    public Cocinero(InstrumentoDeCocina instrumento, EntragaPedido entregaPedido) {
        this.instrumento = instrumento;
this.entregaPedido = entregaPedido;
    }

    public void prepararArepa() {
        instrumento.calentar();
        instrumento.cocinar();
        System.out.println("Arepa lista para el desayuno!");
    }

    public void finalizarPedido() {
        entregaPedido.entregarPedido();
    }
}

public class Main {
    public static void main(String[] args) {

        List<String> lista = new LinkedList<String>();

        InstrumentoDeCocina sarten = new Sarten();
        EntragaPedido entregaPedido = new Domiciliario();
        Cocinero cocineroConSarten = new Cocinero(sarten, entregaPedido);
        cocineroConSarten.prepararArepa();
        cocineroConSarten.finalizarPedido();

        System.out.println("Cambio de instrumento...");

        InstrumentoDeCocina parrilla = new Parrilla();
        Cocinero cocineroConParrilla = new Cocinero(parrilla, entregaPedido);
        cocineroConParrilla.prepararArepa();
    }
}
