/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.api.entites;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caleb
 */

@XmlRootElement
public class Achat {

    private long id;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate date;
    private double remise;
    private Client client;
    private List<ProduitAchete> produitAchete = new ArrayList<>();
    private Employe employe;

    public Achat() {

    }

    public Achat(long id, LocalDate date, double remise) {
        this.id = id;
        this.date = date;
        this.remise = remise;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @XmlTransient
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<ProduitAchete> getProduitAchete() {
        return produitAchete;
    }

    public void setProduitAchete(List<ProduitAchete> produitAchete) {
        this.produitAchete = produitAchete;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    @Override
    public String toString() {
        return "Achat{" + "id=" + id + ", date=" + date + ", remise=" + remise + ", client=" + client + ", produitAchete=" + produitAchete + ", employe=" + employe + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Achat other = (Achat) obj;
        return this.id == other.id;
    }

    public double getRemiseTotale() {
        double remiseTotale = 0;
        for (ProduitAchete produit : this.produitAchete) {
            remiseTotale += produit.getRemise();
        }
        return remiseTotale;
    }

    public double getTotalAPayer() {
        double totaleAPayer = 0;
        for (ProduitAchete produit : this.produitAchete) {
             totaleAPayer = produit.getProduit().getPrixUnitaire();
        }
        totaleAPayer -= this.getRemiseTotale();
        return totaleAPayer;
    }
}
