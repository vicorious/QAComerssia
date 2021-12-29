import javax.management.monitor.StringMonitor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ld_det") 
@NamedQuery



public class Ld_det implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "ld_domain")
    @Size(max=50)
    private String ld_domain;
    @Size(max =50)
    @Column(name = "ld_site")
    private String ld_site;
    @Size(max=50)
    @column(name = "ld_loc")
    private String ld_loc;
    @Size(size=50)
    @column(name="ld_qty_oh")
    private String ld_qty_oh;
    @OneToMany (cascade = CascadeType.All, mappedBy = "ld_domain")
    private Collection<Pt_mstr> pt_mstrCollection;
    

    public Ld_det(){
    }

    public String getLd_domain()
    {
        return ld_domain;
    }

    public void setLd_domain(String ld_domain)
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
    
 /*   public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("ld_domain: " + ld_domain + ";");
        buffer.append("ld_site: " + ld_site + ";");
        buffer.append("ld_loc: " + ld_loc + ";");
        buffer.append("ld_qty_oh: " + ld_qty_oh + ";");
        return buffer.toString();
    }*/

    @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Ld_det))
      return false;
      Ld_det employee = (Ld_det) o;
    return Objects.equals(this.ld_domain, ld_det.ld_domain) && Objects.equals(this.ld_site, ld_det.ld_site)
    && Objects.equals(this.ld_loc, ld_det.ld_loc) && Objects.equals(this.ld_qty_oh, ld_det.ld_qty_oh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.ld_domain, this.ld_site, this.ld_loc, this.ld_qty_oh);
  }

  @Override
  public String toString() {
    return "Ld_det{" + "ld_domain=" + this.ld_domain + ", ld_site='" + this.ld_site + ", ld_loc='" + this.ld_loc + '\'' + ", ld_qty_oh='" + this.ld_qty_oh + '\'' + '}';
  }
}
