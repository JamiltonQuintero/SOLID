package com.jamiltonquintero.solid.o.casoUno.sin;


import com.jamiltonquintero.solid.o.casoUno.InformeEnum;

public class Main {


    public static void main(String[] args) {


        InformeFinanciero informeFinanciero = new InformeFinanciero();
        informeFinanciero.generarInformeFinancieroMensual(InformeEnum.CUENTA_CREDITO);
    }
}