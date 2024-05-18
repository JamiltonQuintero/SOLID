package com.jamiltonquintero.solid.L.casoUno;

public class Main {

    public static void main(String[] args) {

        Pato patoHule = new PatoDeHule();
        patoHule.caminar();
        patoHule.nadar();
        patoHule.cuac(20);

        System.out.println();

        Pato pato = new PatoNormal();
        pato.caminar();
        pato.nadar();
        pato.cuac(null);
    }
}