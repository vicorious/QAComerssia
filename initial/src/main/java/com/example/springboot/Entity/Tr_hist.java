import javax.management.monitor.StringMonitor;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collections;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TemporalType;

@Entity
@Table(name="tr_hist") 
public class Tr_hist implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Temporal(TemporalType.Date)
   
    @Column(name = "tr_domain")
    @Size(max=50)
    private String tr_domain;
    @Size(max=50)
    @Column(name = "pt_part")
    private String tr_part;
    @Size(max=50)
    @Column(name = "tr_site")
    private String tr_site;
    @Size(max=50)
    @Column(name = "tr_loc")
    private String tr_loc;
    @Column(name = "tr_effdate")
    @Temporal(TemporalType.Date)
    private Date tr_effdate;
    @Size(max=50)
    @Column(name = "tr_qty_oh")
    private String tr_qty_oh;
    @Size(max=50)
    @Column(name = "tr_nbr")
    private String tr_nbr;
    @Size(max=50)
    @Column(name = "tr_tmbr")
    private String tr_tmbr;
    @OneToMany (cascade = CascadeType.All, mappedBy = "tr_domain")
    private Collection<Ld_det> ld_detCollection;
    @OneToMany (cascade = CascadeType.All, mappedBy = "tr_domain")
    private Collection<Pt_mstr> pt_mstrCollection;
   
    public Tr_hist(){       
    }

    public String getTr_domain()
    {
        return tr_domain;
    }

    public void setTr_domain(String tr_domain)
    {
        this.tr_domain = tr_domain;
    } 

    public String getTr_part() {
        return tr_part;
    }
    
    public void setTr_part(String tr_part) {
        this.tr_part = tr_part;
    }
    
    public String getTr_site() {
        return tr_site;
    }
    
    public void setTr_site(String tr_site) {
        this.tr_site = ptr_site;
    }

    public String getTr_loc() {
        return tr_loc;
    }

    public void setTr_loc(String tr_loc) {
        this.tr_loc = tr_loc;
    }

    public Date getTr_effdate() {
        return tr_effdate;
    }
    public void setTr_effdate(Date tr_effdate) {
        this.tr_effdate = tr_effdate;
    }
    public String getTr_qty_oh() {
        return tr_qty_oh;
    }
    public void setTr_qty_oh(String tr_qty_oh) {
        this.tr_qty_oh = tr_qty_oh;
    }

    public String getTr_nbr() {
        return tr_nbr;
    }
    public void setTr_nbr(String tr_nbr) {
        this.tr_nbr = tr_nbr;
    }
    
    public String getTr_tmbr() {
        return tr_tmbr;
    }
    public void setTr_tmbr(String tr_tmbr) {
        this.tr_tmbr = tr_tmbr;
    }
    /*public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("tr_domain: " + tr_domain + ";");
        buffer.append("tr_part: " + tr_part + ";");
        buffer.append("tr_site: " + tr_site + ";");
        buffer.append("tr_loc: " + tr_loc + ";");
        buffer.append("tr_effdate: " + tr_effdate + ";"); 
        buffer.append("tr_qty_oh: " + tr_qty_oh + ";");
        buffer.append("tr_nbr: " + tr_nbr + ";");
        buffer.append("tr_tmbr: " + tr_tmbr + ";");
        return buffer.toString();
    }*/

    @Override
    public boolean equals(Object o) {
  
      if (this == o)
        return true;
      if (!(o instanceof Tr_hist))
        return false;
        Tr_hist tr_hist = (Tr_hist) o;
      return Objects.equals(this.tr_domain, tr_hist.tr_domain) && Objects.equals(this.tr_part, tr_hist.tr_part)
      && Objects.equals(this.tr_site, tr_hist.tr_site) && Objects.equals(this.tr_loc, tr_hist.tr_loc) 
      && Objects.equals(this.tr_effdate, tr_hist.tr_effdate)&& Objects.equals(this.tr_qty_oh, tr_hist.tr_qty_oh)
      && Objects.equals(this.tr_nbr, tr_hist.tr_nbr)&& Objects.equals(this.tr_tmbr, tr_hist.tr_tmbr);
    }
  
    @Override
    public int hashCode() {
      return Objects.hash(this.tr_domain, this.tr_part, this.tr_site, this.tr_loc,this.tr_effdate,this.tr_qty_oh,
      this.tr_nbr,this.tr_tmbr);
    }
  
    @Override
    public String toString() {
    return "Tr_hist{" + "tr_domain=" + this.tr_domain + "tr_part=" + this.tr_part +"tr_site=" + this.tr_site +", tr_loc='" + this.tr_loc + 
    ", tr_effdate='" + this.tr_effdate + ", tr_qty_oh='" + this.tr_qty_oh + ", tr_nbr='" + this.tr_nbr + '\'' + ", tr_tmbr='" + this.tr_tmbr + '\'' + '}';
    }
}
}
