package com.jamiltonquintero.solid.s.clases.sins;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Problema {

    private Long id;
    private Descripcion descripcion;
    private EdadCliente edadCliente;
    private GeneroCliente generoCliente;
    private TipoProducto tipoProducto;
    private SolucionComponenteQuimico solucionComponenteQuimico;
    private SolucionRutina solucionRutina;
    private UrlAudio urlAudio;
    private IdsProductos idsProductos;

    public Problema(
            String problema,
            byte edadCliente,
            String generoCliente,
            String tipo,
            String solucionComponenteQuimico,
            String solucionRutina,
            String urlAudio,
            String idsProductos) {
        this.descripcion = new Descripcion(problema);
        this.edadCliente = new EdadCliente(edadCliente);
        this.generoCliente = new GeneroCliente(generoCliente);
        this.tipoProducto = new TipoProducto(tipo);
        this.solucionComponenteQuimico = new SolucionComponenteQuimico(solucionComponenteQuimico);
        this.solucionRutina = new SolucionRutina(solucionRutina);
        this.urlAudio = new UrlAudio(urlAudio);
        this.idsProductos = new IdsProductos(idsProductos);
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

    public Problema(String problema,
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
    public String getSolucionComponenteQuimico() {
        return solucionComponenteQuimico.getValor();
    }

    public String getSolucionRutina() {
        return solucionRutina.getValor();
    }

    public String getUrlAudio() {
        return urlAudio.getValor();
    }

    public String getIdsProductos() {
        return idsProductos.getValor();
    }
}
