package com.jamiltonquintero.solid.i.coni;

class ImpresoraSimple implements Imprimible {
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo...");
    }
}

class ImpresoraMultifuncional implements Imprimible, Escaneable, Faxeable {
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo...");
    }

    @Override
    public void escanear() {
        System.out.println("Escaneando...");
    }

    @Override
    public void enviarFax() {
        System.out.println("Enviando fax...");
    }
}