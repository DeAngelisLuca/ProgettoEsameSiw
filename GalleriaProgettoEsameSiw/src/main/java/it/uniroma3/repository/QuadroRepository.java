package it.uniroma3.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.model.Autore;
import it.uniroma3.model.Quadro;

public interface QuadroRepository extends CrudRepository<Quadro, Long>{

	List<Quadro> findByTitolo(String titolo);

	List<Quadro> findByAutore(Autore autore);

	List<Quadro> findByTecnica(String tecnica);

	List<Quadro> findByAnnoRealizzazione(Integer annoRealizzazione);

	List<Quadro> findByDimensioni(String dimensioni);
}
