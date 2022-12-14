package it.daniele.banca.service;

import java.util.List;

import it.daniele.banca.model.UtenteBancario;



public interface UtenteBancarioService {
	List<UtenteBancario> getAllUtenti();
	void salvaUtente(UtenteBancario utente);
	UtenteBancario getUtenteById(long id);
	void cancellaUtenteById(long id);
	
}
