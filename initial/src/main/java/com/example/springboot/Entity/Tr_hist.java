package com.example.springboot.entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;

import java.io.Serializable;

@Entity
public class Tr_hist implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id   
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "tr_IdSec")
    private String tr_IdSec;
    @Column(name = "tr_reg")
    private String tr_reg;
    @Column(name = "tr_part")
    private String tr_part;
    @Column(name = "tr_date")
    private String tr_date;    
    @Column(name = "tr_type")
    private String tr_type;
    @Column(name = "tr_loc")
    private Date tr_loc;
    @Column(name = "tr_qty_loc")
    private String tr_qty_loc;
    @Column(name = "tr_um")
    private String tr_um;  
    @Column(name = "tr_nbr")
    private String tr_nbr;
    @Column(name = "tr_addr")
    private String tr_addr;
    @Column(name = "tr_rmks")
    private String tr_rmks;
    @Column(name = "tr_site")
    private String tr_site;
    @Column(name = "tr_ref_site")
    private String tr_ref_site;
    @Column(name = "tr_fechasync")
    private String tr_fechasync;
    @Column(name = "tr_dtcr")
    private String tr_dtcr;
    @Column(name = "tr_domain")
    private String tr_domain;

    public Tr_hist() {
    }

    public Tr_hist(String tr_IdSec, String tr_reg, String tr_part, String tr_date, String tr_type, Date tr_loc, String tr_qty_loc, String tr_um, String tr_nbr, String tr_addr, String tr_rmks, String tr_site, String tr_ref_site, String tr_fechasync, String tr_dtcr, String tr_domain) {
        this.tr_IdSec = tr_IdSec;
        this.tr_reg = tr_reg;
        this.tr_part = tr_part;
        this.tr_date = tr_date;
        this.tr_type = tr_type;
        this.tr_loc = tr_loc;
        this.tr_qty_loc = tr_qty_loc;
        this.tr_um = tr_um;
        this.tr_nbr = tr_nbr;
        this.tr_addr = tr_addr;
        this.tr_rmks = tr_rmks;
        this.tr_site = tr_site;
        this.tr_ref_site = tr_ref_site;
        this.tr_fechasync = tr_fechasync;
        this.tr_dtcr = tr_dtcr;
        this.tr_domain = tr_domain;
    }

    public String getTr_IdSec() {
        return tr_IdSec;
    }

    public void setTr_IdSec(String tr_IdSec) {
        this.tr_IdSec = tr_IdSec;
    }

    public String getTr_reg() {
        return tr_reg;
    }

    public void setTr_reg(String tr_reg) {
        this.tr_reg = tr_reg;
    }

    public String getTr_part() {
        return tr_part;
    }

    public void setTr_part(String tr_part) {
        this.tr_part = tr_part;
    }

    public String getTr_date() {
        return tr_date;
    }

    public void setTr_date(String tr_date) {
        this.tr_date = tr_date;
    }

    public String getTr_type() {
        return tr_type;
    }

    public void setTr_type(String tr_type) {
        this.tr_type = tr_type;
    }

    public Date getTr_loc() {
        return tr_loc;
    }

    public void setTr_loc(Date tr_loc) {
        this.tr_loc = tr_loc;
    }

    public String getTr_qty_loc() {
        return tr_qty_loc;
    }

    public void setTr_qty_loc(String tr_qty_loc) {
        this.tr_qty_loc = tr_qty_loc;
    }

    public String getTr_um() {
        return tr_um;
    }

    public void setTr_um(String tr_um) {
        this.tr_um = tr_um;
    }

    public String getTr_nbr() {
        return tr_nbr;
    }

    public void setTr_nbr(String tr_nbr) {
        this.tr_nbr = tr_nbr;
    }

    public String getTr_addr() {
        return tr_addr;
    }

    public void setTr_addr(String tr_addr) {
        this.tr_addr = tr_addr;
    }

    public String getTr_rmks() {
        return tr_rmks;
    }

    public void setTr_rmks(String tr_rmks) {
        this.tr_rmks = tr_rmks;
    }

    public String getTr_site() {
        return tr_site;
    }

    public void setTr_site(String tr_site) {
        this.tr_site = tr_site;
    }

    public String getTr_ref_site() {
        return tr_ref_site;
    }

    public void setTr_ref_site(String tr_ref_site) {
        this.tr_ref_site = tr_ref_site;
    }

    public String getTr_fechasync() {
        return tr_fechasync;
    }

    public void setTr_fechasync(String tr_fechasync) {
        this.tr_fechasync = tr_fechasync;
    }

    public String getTr_dtcr() {
        return tr_dtcr;
    }

    public void setTr_dtcr(String tr_dtcr) {
        this.tr_dtcr = tr_dtcr;
    }

    public String getTr_domain() {
        return tr_domain;
    }

    public void setTr_domain(String tr_domain) {
        this.tr_domain = tr_domain;
    }
}