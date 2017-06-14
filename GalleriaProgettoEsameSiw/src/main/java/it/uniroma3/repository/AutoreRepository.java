package it.uniroma3.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.model.Autore;
import it.uniroma3.model.Quadro;

public interface AutoreRepository extends CrudRepository<Autore, Long> {
	
  Autore findByNome(String nome);
  
  Autore findByCognome(String cognome);
  
//  Autore findByOpere(List<Quadro> quadri);
  
}
