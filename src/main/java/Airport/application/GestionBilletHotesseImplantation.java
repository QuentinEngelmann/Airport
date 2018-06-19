package Airport.application;

import java.util.Collection;
import java.util.Date;

import Airport.domain.Aeroport;
import Airport.domain.Billet;
import Airport.domain.Client;
import Airport.domain.Hotesse;
import Airport.domain.Passager;
import Airport.domain.Vol;
import Airport.services.persistence.Repository;

public class GestionBilletHotesseImplantation implements GestionBilletHotesse{

	Hotesse hotesse = new Hotesse();
	Repository<Billet> repository;
	
	@Override
	public Billet achatBillet(Date date, int numero, Passager passager, Vol vol) {
		Billet billet = repository.findOne(numero);
		if (billet == null) {
			billet = new Billet();
			repository.save(billet);
		}

		billet.setDate(date);
		billet.setNumero(numero);
		billet.setPassager(passager);
		billet.setVol(vol);
		billet.setClient(null);
		billet.setHotesse(hotesse);
		
		hotesse.addBillet(billet);

		return billet;
	}

	@Override
	public void annulerBillet(Date date, int numero, Passager passager, Vol vol) {
		Billet billet = new Billet();
		billet.setDate(null);
		billet.setNumero(0);
		billet.setPassager(null);
		billet.setVol(null);
		billet.setClient(null);
		billet.setHotesse(null);
	}


	@Override
	public Vol chercherVol(Date dateDepart, String heureDepart, Date dateArrivee, String heureArrivee,
			Aeroport decoller, Aeroport aterrir) {
		Vol vol = new Vol();
		vol.setDateDepart(dateDepart);
		vol.setHeureDepart(heureDepart);
		vol.setDateArrivee(dateArrivee);
		vol.setHeureArrivee(heureArrivee);
		vol.setDecoller((Collection<Aeroport>) decoller);
		vol.setAtterir((Collection<Aeroport>) aterrir);
		return vol;
	}
	
	@Override
	public void achatBilletClient(Client client) {
		// TODO Auto-generated method stub
		
	}

}
