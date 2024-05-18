package com.jamiltonquintero.solid.s.clases.cons.problema;

import lombok.Getter;

@Getter
public class Descripcion {

    private final String valor;

    public Descripcion(String valor) {
        if (valor == null || valor.isEmpty()) {
            throw new IllegalArgumentException("Descripcion no puede ser vacio");
        }
        this.valor = valor;
    }

}
