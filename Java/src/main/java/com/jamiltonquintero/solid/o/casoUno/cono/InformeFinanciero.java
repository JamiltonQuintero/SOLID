package com.jamiltonquintero.solid.o.casoUno.cono;

import com.jamiltonquintero.solid.o.casoUno.InformeEnum;

import java.util.List;

public interface InformeFinanciero {

    InformeEnum tipo();
    void calcularInteresMensual(List<Long> interesesAcumulados);
}
