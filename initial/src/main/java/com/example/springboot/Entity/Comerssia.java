package com.example.springboot.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Commersia_Despachos")
public class Comerssia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id_Despachos_Ods")
    private String id_Despachos_Ods;
    @Column(name = "Consecutivo")
    private String consecutivo;
    @Column(name = "pt_domain")
    private String pt_domain;
    @Column(name = "pt_part")
    private String pt_part;
    @Column(name = "pt_article")
    private String pt_article;
    @Column(name = "pt_desc1")
    private String pt_desc1;
    @Column(name = "pt_desc2")
    private String pt_desc2;
    @Column(name = "pt_status")
    private String pt_status;
    @Column(name = "ld_domain")
    private String e_ld_domain;
    @Column(name = "ld_site")
    private String e_ld_site;
    @Column(name = "ld_loc")
    private String e_ld_loc;
    @Column(name = "ld_qty_oh")
    private String e_ld_qty_oh;
    @Column(name = "Cantidad")
    private String cantidad;
    @Column(name = "tr_type")
    private String tr_type;    
    @Column(name = "tr_effdate")
    private String tr_effdate;   
    @Column(name = "tr_nbr")
    private String tr_nbr;        

    public Comerssia() {
    }

    public Comerssia(String id_Despachos_Ods, String consecutivo, String pt_domain, String pt_part, String pt_article, String pt_desc1, String pt_desc2, String pt_status, String e_ld_domain, String e_ld_site, String e_ld_loc, String e_ld_qty_oh, String cantidad) {
        this.id_Despachos_Ods = id_Despachos_Ods;
        this.consecutivo = consecutivo;
        this.pt_domain = pt_domain;
        this.pt_part = pt_part;
        this.pt_article = pt_article;
        this.pt_desc1 = pt_desc1;
        this.pt_desc2 = pt_desc2;
        this.pt_status = pt_status;
        this.e_ld_domain = e_ld_domain;
        this.e_ld_site = e_ld_site;
        this.e_ld_loc = e_ld_loc;
        this.e_ld_qty_oh = e_ld_qty_oh;
        this.cantidad = cantidad;
    }

    public String getId_Despachos_Ods() {
        return id_Despachos_Ods;
    }

    public void setId_Despachos_Ods(String id_Despachos_Ods) {
        this.id_Despachos_Ods = id_Despachos_Ods;
    }

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPt_domain() {
        return pt_domain;
    }

    public void setPt_domain(String pt_domain) {
        this.pt_domain = pt_domain;
    }

    public String getPt_part() {
        return pt_part;
    }

    public void setPt_part(String pt_part) {
        this.pt_part = pt_part;
    }

    public String getPt_article() {
        return pt_article;
    }

    public void setPt_article(String pt_article) {
        this.pt_article = pt_article;
    }

    public String getPt_desc1() {
        return pt_desc1;
    }

    public void setPt_desc1(String pt_desc1) {
        this.pt_desc1 = pt_desc1;
    }

    public String getPt_desc2() {
        return pt_desc2;
    }

    public void setPt_desc2(String pt_desc2) {
        this.pt_desc2 = pt_desc2;
    }

    public String getPt_status() {
        return pt_status;
    }

    public void setPt_status(String pt_status) {
        this.pt_status = pt_status;
    }

    public String getE_ld_domain() {
        return e_ld_domain;
    }

    public void setE_ld_domain(String e_ld_domain) {
        this.e_ld_domain = e_ld_domain;
    }

    public String getE_ld_site() {
        return e_ld_site;
    }

    public void setE_ld_site(String e_ld_site) {
        this.e_ld_site = e_ld_site;
    }

    public String getE_ld_loc() {
        return e_ld_loc;
    }

    public void setE_ld_loc(String e_ld_loc) {
        this.e_ld_loc = e_ld_loc;
    }

    public String getE_ld_qty_oh() {
        return e_ld_qty_oh;
    }

    public void setE_ld_qty_oh(String e_ld_qty_oh) {
        this.e_ld_qty_oh = e_ld_qty_oh;
    }
}