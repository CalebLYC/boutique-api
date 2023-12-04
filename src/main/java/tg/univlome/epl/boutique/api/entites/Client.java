/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.api.entites;

import jakarta.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author victoire
 */

@XmlRootElement
public class Client extends Personne {
    

    public Client() {
    }

    public Client(long id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    @Override
    public String toString() {
        return "Client{" + '}';
    }  
}
