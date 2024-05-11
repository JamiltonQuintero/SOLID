package com.jamiltonquintero.solid.o.casoUno.cono;

import com.jamiltonquintero.solid.o.casoUno.InformeEnum;

import java.util.List;

public class InformeCuentasDeAhorro implements InformeFinanciero {
    private static final double INTERESES = 1.1;
    @Override
    public InformeEnum tipo() {
        return InformeEnum.CUENTA_AHORROS;
    }

    @Override
    public void calcularInteresMensual(List<Long> interesesAcumulados) {

        var totalIntereses =interesesAcumulados.stream().map(aLong -> aLong * INTERESES).reduce((double) 0, Double::sum);
        System.out.println("Total Intereses: " + totalIntereses);
        actualizarTotalInterese(totalIntereses);

    }

    private void actualizarTotalInterese(Double totalIntereses) {
        System.out.println("Enviando a microservicio de cuentas ahorro");

    }
}
