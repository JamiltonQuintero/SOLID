package com.jamiltonquintero.solid.L.casoUno;

public class PatoNormal implements Pato{
    @Override
    public void nadar() {
        System.out.println("nadando");
    }

    @Override
    public void cuac(Integer bateria) {
        System.out.println("Cuac cuac!");
    }

    @Override
    public void caminar() {
        System.out.println("caminando");
    }

}
