package com.jamiltonquintero.solid.L.casoUno;

public class PatoDeHule2 implements Nadador, Caminador {

    @Override
    public void nadar() {
        System.out.println("nadando");
    }

    @Override
    public void caminar() {
        System.out.println("No puedo caminar");
    }
}
