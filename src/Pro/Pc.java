/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author sansk
 */
@Entity
@Table(name = "PC", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Pc.findAll", query = "SELECT p FROM Pc p")
    , @NamedQuery(name = "Pc.findByPcNo", query = "SELECT p FROM Pc p WHERE p.pcNo = :pcNo")
    , @NamedQuery(name = "Pc.findByProcessor", query = "SELECT p FROM Pc p WHERE p.processor = :processor")
    , @NamedQuery(name = "Pc.findByMemory", query = "SELECT p FROM Pc p WHERE p.memory = :memory")
    , @NamedQuery(name = "Pc.findByGraphics", query = "SELECT p FROM Pc p WHERE p.graphics = :graphics")
    , @NamedQuery(name = "Pc.findByPrimaryHardDisk", query = "SELECT p FROM Pc p WHERE p.primaryHardDisk = :primaryHardDisk")})
public class Pc implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PC_NO")
    private BigDecimal pcNo;
    @Column(name = "PROCESSOR")
    private String processor;
    @Column(name = "MEMORY")
    private String memory;
    @Column(name = "GRAPHICS")
    private String graphics;
    @Column(name = "PRIMARY_HARD_DISK")
    private String primaryHardDisk;

    public Pc() {
    }

    public Pc(BigDecimal pcNo) {
        this.pcNo = pcNo;
    }

    public BigDecimal getPcNo() {
        return pcNo;
    }

    public void setPcNo(BigDecimal pcNo) {
        BigDecimal oldPcNo = this.pcNo;
        this.pcNo = pcNo;
        changeSupport.firePropertyChange("pcNo", oldPcNo, pcNo);
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        String oldProcessor = this.processor;
        this.processor = processor;
        changeSupport.firePropertyChange("processor", oldProcessor, processor);
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        String oldMemory = this.memory;
        this.memory = memory;
        changeSupport.firePropertyChange("memory", oldMemory, memory);
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        String oldGraphics = this.graphics;
        this.graphics = graphics;
        changeSupport.firePropertyChange("graphics", oldGraphics, graphics);
    }

    public String getPrimaryHardDisk() {
        return primaryHardDisk;
    }

    public void setPrimaryHardDisk(String primaryHardDisk) {
        String oldPrimaryHardDisk = this.primaryHardDisk;
        this.primaryHardDisk = primaryHardDisk;
        changeSupport.firePropertyChange("primaryHardDisk", oldPrimaryHardDisk, primaryHardDisk);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pcNo != null ? pcNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pc)) {
            return false;
        }
        Pc other = (Pc) object;
        if ((this.pcNo == null && other.pcNo != null) || (this.pcNo != null && !this.pcNo.equals(other.pcNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pro.Pc[ pcNo=" + pcNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
