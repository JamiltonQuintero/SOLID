package com.jamiltonquintero.solid.L.casoUno;

public class PatoDeHule implements Pato {

    private byte bateria = 100;

    @Override
    public void nadar() {
        System.out.println("nadando");
    }

    @Override
    public void cuac(Integer bateria) {
        if (bateria < 0){
            System.out.println("No puedo hacer cuac");
        } else {
            System.out.println("Cuac cuac!");
        }
    }

    @Override
    public void caminar() {
        System.out.println("No puedo caminar");
    }
}
