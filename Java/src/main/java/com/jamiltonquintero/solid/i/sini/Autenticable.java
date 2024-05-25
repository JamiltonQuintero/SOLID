package com.jamiltonquintero.solid.i.sini;

interface Autenticable {
    void iniciarSesion();
    void cerrarSesion();
    boolean cambiarContraseña(String nuevaContraseña);
}