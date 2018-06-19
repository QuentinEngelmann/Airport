package Airport.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passager {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	
	Collection<Billet> billets = new ArrayList<Billet>();
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Collection<Billet> getBillets() {
		return billets;
	}

	public void setBillets(Collection<Billet> billets) {
		this.billets = billets;
	}
	
	
	@Override
	public String toString() {
		return "Passager [Nom = " + nom + " Prenom = " + "]";
	}

}
