package it.daniele.banca.service;

import java.util.List;

import it.daniele.banca.model.ContoCorrente;
import it.daniele.banca.model.UtenteBancario;



public interface ContoCorrenteService {

	
	List<ContoCorrente> getAllConti();
	void salvaConto(ContoCorrente conti);
	ContoCorrente getContiById(long id);
	List<ContoCorrente> findAllContiByUtentebancario(UtenteBancario utente);
	

}
