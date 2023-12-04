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
 * @author victoire
 */

@XmlRootElement
public class Employe extends Personne {
    
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate dateNaissance;

    public Employe() {
    }

    public Employe(LocalDate dateNaissance, long id, String nom, String prenom) {
        super(id, nom, prenom);
        this.dateNaissance = dateNaissance;
    }

    @XmlTransient
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Employe{" + "dateNaissance=" + dateNaissance + '}';
    }
 
    
}
