package com.jamiltonquintero.solid.s.clases.cons.problema;

import lombok.Getter;

@Getter
public class EdadCliente {

    private final byte valor;

    public EdadCliente(byte valor) {
        if (valor >= 0) {
            throw new IllegalArgumentException("Edad no puede ser vacio");
        }
        this.valor = valor;
    }

}
