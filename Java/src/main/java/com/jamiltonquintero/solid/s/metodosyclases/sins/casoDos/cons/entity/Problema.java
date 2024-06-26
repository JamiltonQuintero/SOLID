package com.jamiltonquintero.solid.s.metodosyclases.sins.casoDos.cons.entity;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Problema {

    private Long id;
    private Descripcion descripcion;
    private EdadCliente edadCliente;
    private GeneroCliente generoCliente;
    private TipoProducto tipoProducto;

    public Problema(
            String problema,
            byte edadCliente,
            String generoCliente,
            String tipo) {
        this.descripcion = new Descripcion(problema);
        this.edadCliente = new EdadCliente(edadCliente);
        this.generoCliente = new GeneroCliente(generoCliente);
        this.tipoProducto = new TipoProducto(tipo);
    }

    public Problema(
            Long id,
            String problema,
            byte edadCliente,
            String generoCliente,
            String tipo) {
        this.descripcion = new Descripcion(problema);
        this.edadCliente = new EdadCliente(edadCliente);
        this.generoCliente = new GeneroCliente(generoCliente);
        this.tipoProducto = new TipoProducto(tipo);
    }

    public Long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion.getValor();
    }

    public byte getEdadCliente() {
        return edadCliente.getValor();
    }

    public String getGeneroCliente() {
        return generoCliente.getValor();
    }


    public String getTipoProducto() {
        return tipoProducto.getValor();
    }
}
