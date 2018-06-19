package Airport.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompagnieAerienne {
	
	@Id
	private String nom;
	Collection<Vol> vol = new ArrayList<Vol>();
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Collection<Vol> getVol() {
		return vol;
	}
	public void setVol(Collection<Vol> vol) {
		this.vol = vol;
	}

	@Override
	public String toString() {
		return "Compagnie aérienne [Nom = " + nom + "]";
	}
}
