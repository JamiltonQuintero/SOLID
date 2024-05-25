package com.jamiltonquintero.solid.i.sini;

class ImpresoraMultifuncional implements Impresora {
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