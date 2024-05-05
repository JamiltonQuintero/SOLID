package com.jamiltonquintero.solid.s.metodosyclases.sins.casoUno;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Id;
import java.math.BigDecimal;

public class GestorDeCuentaAhorro {

    @Value("calculo-interes-anual")
    public  String valorInteres;
    @Id
    private Long id;

    private String numero;

    private String titular;

    private BigDecimal saldo;
    private String usuario;

    public void calcularIntereses(String valorInteres) {
        BigDecimal interes = saldo.multiply(new BigDecimal(valorInteres));
        saldo = saldo.add(interes);
    }

    public void descontarSaldoPorTransferencia(BigDecimal transferencia) {
        if (transferencia.compareTo(saldo) <= 0){
            throw new RuntimeException("No tienes saldo suficiente para esta transaccion");
        }
        saldo = saldo.subtract(transferencia);
    }

}
