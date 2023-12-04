/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.api.entites;

import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author caleb
 */

@XmlRootElement
public class ProduitAchete {
    long id;
    private double remise;
    private Achat achat;
    private Produit produit;

    public ProduitAchete(){
    }
    
    public ProduitAchete(double remise, Achat achat) {
        this.remise = remise;
        this.achat = achat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public Achat getAchat() {
        return achat;
    }

    public void setAchat(Achat achat) {
        this.achat = achat;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProduitAchete other = (ProduitAchete) obj;
        return this.id == other.id;
    }


    
    @Override
    public String toString() {
        return "ProduitAchete{" + "remise=" + remise + ", achat=" + achat + ", prouduit=" + produit + '}';
    }
    
       
}
