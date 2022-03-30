package com.example.springboot.entity;

import javax.persistence.*;

@Entity(name = "Commersia_Reportes")
public class ReporteComerssia {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_Commersia_Reportes")
    private String id_Commersia_Reportes;
    @Column(name = "r_BodegaOrigen")
    private String r_Bodega_Origen;
    @Column(name = "r_BodegaDestino")
    private String r_Bodega_Destino;
    @Column(name = "r_Fecha")
    private String r_Fecha;
    @Column(name = "r_CD")
    private String r_CD;
    @Column(name = "r_SKU")
    private String r_sku;
    @Column(name = "r_Descripcion")
    private String r_Descripcion;
    @Column(name = "r_CantidadEnviada")
    private String r_CantidadEnviada;
    @Column(name = "r_FechaRegistroEnvio")
    private String r_FechaRegistroEnvio;
    @Column(name = "r_FechaRecepcion")
    private String r_FechaRecepcion;
    @Column(name = "r_CantidadRecibida")
    private String r_CantidadRecibida;

    public ReporteComerssia() {
    }

    public ReporteComerssia(String id_Commersia_Reportes, String r_Bodega_Origen, String r_Bodega_Destino, String r_Fecha, String r_CD, String r_sku, String r_Descripcion, String r_CantidadEnviada, String r_FechaRegistroEnvio, String r_FechaRecepcion, String r_CantidadRecibida) {
        this.id_Commersia_Reportes = id_Commersia_Reportes;
        this.r_Bodega_Origen = r_Bodega_Origen;
        this.r_Bodega_Destino = r_Bodega_Destino;
        this.r_Fecha = r_Fecha;
        this.r_CD = r_CD;
        this.r_sku = r_sku;
        this.r_Descripcion = r_Descripcion;
        this.r_CantidadEnviada = r_CantidadEnviada;
        this.r_FechaRegistroEnvio = r_FechaRegistroEnvio;
        this.r_FechaRecepcion = r_FechaRecepcion;
        this.r_CantidadRecibida = r_CantidadRecibida;
    }

    public String getId_Commersia_Reportes() {
        return id_Commersia_Reportes;
    }

    public void setId_Commersia_Reportes(String id_Commersia_Reportes) {
        this.id_Commersia_Reportes = id_Commersia_Reportes;
    }

    public String getR_Bodega_Origen() {
        return r_Bodega_Origen;
    }

    public void setR_Bodega_Origen(String r_Bodega_Origen) {
        this.r_Bodega_Origen = r_Bodega_Origen;
    }

    public String getR_Bodega_Destino() {
        return r_Bodega_Destino;
    }

    public void setR_Bodega_Destino(String r_Bodega_Destino) {
        this.r_Bodega_Destino = r_Bodega_Destino;
    }

    public String getR_Fecha() {
        return r_Fecha;
    }

    public void setR_Fecha(String r_Fecha) {
        this.r_Fecha = r_Fecha;
    }

    public String getR_CD() {
        return r_CD;
    }

    public void setR_CD(String r_CD) {
        this.r_CD = r_CD;
    }

    public String getR_sku() {
        return r_sku;
    }

    public void setR_sku(String r_sku) {
        this.r_sku = r_sku;
    }

    public String getR_Descripcion() {
        return r_Descripcion;
    }

    public void setR_Descripcion(String r_Descripcion) {
        this.r_Descripcion = r_Descripcion;
    }

    public String getR_CantidadEnviada() {
        return r_CantidadEnviada;
    }

    public void setR_CantidadEnviada(String r_CantidadEnviada) {
        this.r_CantidadEnviada = r_CantidadEnviada;
    }

    public String getR_FechaRegistroEnvio() {
        return r_FechaRegistroEnvio;
    }

    public void setR_FechaRegistroEnvio(String r_FechaRegistroEnvio) {
        this.r_FechaRegistroEnvio = r_FechaRegistroEnvio;
    }

    public String getR_FechaRecepcion() {
        return r_FechaRecepcion;
    }

    public void setR_FechaRecepcion(String r_FechaRecepcion) {
        this.r_FechaRecepcion = r_FechaRecepcion;
    }

    public String getR_CantidadRecibida() {
        return r_CantidadRecibida;
    }

    public void setR_CantidadRecibida(String r_CantidadRecibida) {
        this.r_CantidadRecibida = r_CantidadRecibida;
    }
}
