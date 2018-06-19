package Airport.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import Airport.application.GestionVol;

@Entity
public class Vol {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Date dateDepart;	
	private String heureDepart;
	private Date dateArrivee;
	private String heureArrivee;

	Collection<Billet> billets = new ArrayList<Billet>();
	Collection<Hotesse> hotesse = new ArrayList<Hotesse>();
	Collection<Aeroport> decoller = new ArrayList<Aeroport>();
	Collection<Aeroport> atterir = new ArrayList<Aeroport>();
	
	public CompagnieAerienne compagnie;
	
	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public String getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public String getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	public Collection<Billet> getBillets() {
		return billets;
	}

	public void setBillets(Collection<Billet> billets) {
		this.billets = billets;
	}

	public Collection<Hotesse> getHotesse() {
		return hotesse;
	}

	public void setHotesse(Collection<Hotesse> hotesse) {
		this.hotesse = hotesse;
	}

	public void addHotesse(Hotesse hotesses)
	{
		hotesse.add(hotesses);
		hotesses.setVols((Collection<Vol>) this);
	}
	
	public CompagnieAerienne getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(CompagnieAerienne compagnie) {
		this.compagnie = compagnie;
	}

	public Collection<Aeroport> getDecoller() {
		return decoller;
	}

	public void setDecoller(Collection<Aeroport> decoller) {
		this.decoller = decoller;
	}

	public Collection<Aeroport> getAtterir() {
		return atterir;
	}

	public void setAtterir(Collection<Aeroport> atterir) {
		this.atterir = atterir;
	}

	@Override
	public String toString() {
		return "Vol [Date de départ / Heure de départ = " + dateDepart + " / " + heureDepart + " Date d'arrivée / Heure d'arrivée = " + dateArrivee + " / " + heureArrivee + " Hotesse(s) = " + hotesse + "Compagnie aérienne = " + compagnie + "Aéroport de départ = " + decoller + " Aéroport d'arrivé = " + atterir + "]";
	}

}
