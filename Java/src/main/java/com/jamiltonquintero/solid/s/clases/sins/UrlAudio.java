package com.jamiltonquintero.solid.s.clases.sins;

import lombok.Getter;

@Getter
public class UrlAudio {

    private final String valor;

    public UrlAudio(String valor) {
        if (valor == null || valor.isEmpty()) {
            throw new IllegalArgumentException("Rutina no puede ser vacio");
        }
        this.valor = valor;
    }

}
