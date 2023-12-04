/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.api.entites;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

/**
 *
 * @author caleb
 */

@XmlRootElement
public class Produit {

    private long id;
    private String libelle;
    private double prixUnitaire;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate datePeremtion;
    private Categorie caterogie;

    public Produit() {

    }

    public Produit(long id, String libelle, double prixUnitaire, LocalDate datePeremtion, Categorie caterogie) {
        this.id = id;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.datePeremtion = datePeremtion;
        this.caterogie = caterogie;
    }
    
    public Produit(String libelle, double prixUnitaire, LocalDate datePeremtion, Categorie caterogie) {
        this.id = 10;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.datePeremtion = datePeremtion;
        this.caterogie = caterogie;
    }
    
    public Produit(String libelle, double prixUnitaire, LocalDate datePeremtion) {
        this.id = 10;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.datePeremtion = datePeremtion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    @XmlTransient
    public LocalDate getDatePeremtion() {
        return datePeremtion;
    }

    public void setDatePeremtion(LocalDate datePeremtion) {
        this.datePeremtion = datePeremtion;
    }

    public Categorie getCaterogie() {
        return caterogie;
    }

    public void setCaterogie(Categorie caterogie) {
        this.caterogie = caterogie;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", libelle=" + libelle + ", prixUnitaire=" + prixUnitaire + ", datePeremtion=" + datePeremtion + ", caterogie=" + caterogie + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Produit other = (Produit) obj;
        return this.id == other.id;
    }

    public boolean estPerime() {
        return this.datePeremtion.isBefore(LocalDate.now());
    }

    public boolean estPerime(LocalDate dateReference) {
        return this.datePeremtion.isBefore(dateReference);
    }

}
