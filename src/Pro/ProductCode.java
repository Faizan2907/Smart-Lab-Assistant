/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
@Table(name = "PRODUCT_CODE", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "ProductCode.findAll", query = "SELECT p FROM ProductCode p")
    , @NamedQuery(name = "ProductCode.findByProdCode", query = "SELECT p FROM ProductCode p WHERE p.prodCode = :prodCode")
    , @NamedQuery(name = "ProductCode.findByDiscountCode", query = "SELECT p FROM ProductCode p WHERE p.discountCode = :discountCode")
    , @NamedQuery(name = "ProductCode.findByDescription", query = "SELECT p FROM ProductCode p WHERE p.description = :description")})
public class ProductCode implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROD_CODE")
    private String prodCode;
    @Basic(optional = false)
    @Column(name = "DISCOUNT_CODE")
    private Character discountCode;
    @Column(name = "DESCRIPTION")
    private String description;

    public ProductCode() {
    }

    public ProductCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public ProductCode(String prodCode, Character discountCode) {
        this.prodCode = prodCode;
        this.discountCode = discountCode;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        String oldProdCode = this.prodCode;
        this.prodCode = prodCode;
        changeSupport.firePropertyChange("prodCode", oldProdCode, prodCode);
    }

    public Character getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(Character discountCode) {
        Character oldDiscountCode = this.discountCode;
        this.discountCode = discountCode;
        changeSupport.firePropertyChange("discountCode", oldDiscountCode, discountCode);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodCode != null ? prodCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCode)) {
            return false;
        }
        ProductCode other = (ProductCode) object;
        if ((this.prodCode == null && other.prodCode != null) || (this.prodCode != null && !this.prodCode.equals(other.prodCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pro.ProductCode[ prodCode=" + prodCode + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
