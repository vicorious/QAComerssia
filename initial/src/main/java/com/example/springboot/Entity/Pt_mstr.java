package com.example.springboot.Entity;
//import javax.management.monitor.StringMonitor;

import java.io.Serializable;
import java.util.Collection;
//import java.util.Collections;
//import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.constraints.Size;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="pt_mstr") 
public class Pt_mstr implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    
    @Column(name = "pt_domain")
    private int pt_domain;
    
    @Column(name = "pt_part")
    private String pt_part;

    @Column(name = "pt_desc1")
    private String pt_desc1;
 
    @Column(name = "pt_desc2")
    private String pt_desc2;
  
    @Column(name = "pt_status")
    private String pt_status;

    @Column(name = "pt_article")
    private String pt_article;
    
    @Column(name = "tr_hist")
    private int tr_hist;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "pt_domain")
    private Collection<Tr_hist> tr_histCollection;

    public Pt_mstr(){      
    }

    public int getPt_domain(){
        return pt_domain;
    }

    public void setPt_domain(int pt_domain){
        this.pt_domain = pt_domain;
    } 

    public String getPt_part() {
        return pt_part;
    }
    
    public void setPt_part(String pt_part) {
        this.pt_part = pt_part;
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
    public String getPt_article() {
        return pt_article;
    }
    public void setPt_article(String pt_article) {
        this.pt_article = pt_article;
    }
    
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("pt_domain: " + pt_domain + ";");
        buffer.append("pt_part: " + pt_part + ";");
        buffer.append("pt_desc1: " + pt_desc1 + ";");
        buffer.append("pt_desc2: " + pt_desc2 + ";");
        buffer.append("pt_status: " + pt_status + ";"); 
        buffer.append("pt_article: " + pt_article + ";");
        return buffer.toString();
    }}