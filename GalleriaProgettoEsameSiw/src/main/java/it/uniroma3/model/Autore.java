package it.uniroma3.model;
import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Autore {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	private String nome;
	
	@NotNull
	private String cognome;
	
	@NotNull
	
	private String nazionalita;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dataNascita;

	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dataMorte;

	@OneToMany(mappedBy="autore" ,fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
	private List<Quadro> quadri;
	
	public Autore() {
		this.quadri = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Date getDataMorte() {
		return dataMorte;
	}

	public void setDataMorte(Date dataMorte) {
		this.dataMorte = dataMorte;
	}

	public List<Quadro> getQuadri() {
		return quadri;
	}

	public void setQuadri(List<Quadro> quadri) {
		this.quadri = quadri;
	}
	
	

}
