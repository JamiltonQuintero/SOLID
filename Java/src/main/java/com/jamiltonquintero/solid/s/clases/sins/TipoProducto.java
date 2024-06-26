package com.jamiltonquintero.solid.s.clases.sins;

import lombok.Getter;

@Getter
public class TipoProducto {

    private final String valor;

    public TipoProducto(String valor) {
        if (valor == null || valor.isEmpty()) {
            throw new IllegalArgumentException("Tipo Producto no puede ser vacio");
        }
        this.valor = valor;
    }

}
