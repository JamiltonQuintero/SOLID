package com.jamiltonquintero.solid.s.metodosyclases.sins.casoDos.cons.entity;

import lombok.Getter;

@Getter
public class SolucionComponenteQuimico {

    private final String valor;

    public SolucionComponenteQuimico(String valor) {
        if (valor == null || valor.isEmpty()) {
            throw new IllegalArgumentException("Componente Quimico no puede ser vacio");
        }
        this.valor = valor;
    }

}
