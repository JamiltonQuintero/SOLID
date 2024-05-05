package com.jamiltonquintero.solid.s.metodosyclases.sins.casoDos.cons.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SugerenciaRequest {

    private String generoCliente;
    private byte edadCliente;
    private String problema;

}
