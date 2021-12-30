package com.example.springboot.Entity;

//import javax.management.monitor.StringMonitor;

import java.io.Serializable;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Date;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
import javax.persistence.Table;
//import javax.persistence.*;

@Entity
@Table(name="ld_det") 

public class Ld_det implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.AUTO)

    
    @Column(name = "ld_domain")
    private int ld_domain;
 
    
    @Column(name = "ld_site")
    private String ld_site;
    

    @Column(name = "ld_loc")
    private String ld_loc;

    
    @Column(name = "pt_mstr")
    private String Pt_mstr;
  
  
    @Column(name="ld_qty_oh")
    private String ld_qty_oh;

  
    @Column(name="t_mstr")
    private String t_mstr;
    
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "ld_domain")
    private Collection<Pt_mstr> pt_mstrCollection;*/
    

    public Ld_det(){
    }

    public int getLd_domain()
    {
        return ld_domain;
    }

    public void setLd_domain(int ld_domain)
    {
        this.ld_domain = ld_domain;
    } 

    public String getLd_site() {
        return ld_site;
    }
    
    public void setLd_site(String ld_site) {
        this.ld_site = ld_site;
    }
    
    public String getLd_loc() {
        return ld_loc;
    }
    
    public void setLd_loc(String ld_loc) {
        this.ld_loc = ld_loc;
    }

    public String getLd_qty_oh() {
        return ld_qty_oh;
    }
    
    public void setLd_qty_oh(String ld_qty_oh) {
        this.ld_qty_oh = ld_qty_oh;
    }
    
   public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("ld_domain: " + ld_domain + ";");
        buffer.append("ld_site: " + ld_site + ";");
        buffer.append("ld_loc: " + ld_loc + ";");
        buffer.append("ld_qty_oh: " + ld_qty_oh + ";");
        return buffer.toString();
   }

        }