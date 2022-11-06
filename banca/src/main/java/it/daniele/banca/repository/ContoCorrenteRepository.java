package it.daniele.banca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.daniele.banca.model.ContoCorrente;
import it.daniele.banca.model.UtenteBancario;


@Repository

public interface ContoCorrenteRepository extends JpaRepository<ContoCorrente,Long> {

	
	List<ContoCorrente> findAllContiByUtentebancario(UtenteBancario utente);
	
	
}
