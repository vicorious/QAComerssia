import javax.management.monitor.StringMonitor;

import java.io.Serializable;
import java.sql.Date;

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
    @Column(name = "tr_domain")
    @Temporal(TemporalType.Date)
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String tr_domain;
    private String tr_part;
    private String tr_site;
    private String tr_loc;
    private String tr_effdate; 
    private String tr_qty_oh;
    private String tr_nbr;
    private String tr_tmbr;
    

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
    public String toString() {
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
    }
}
