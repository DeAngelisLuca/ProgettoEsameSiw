package it.uniroma3.model;
import javax.persistence.*;

@Entity
public class Quadro {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private String titolo;
	@Column(nullable=false)
	private Integer annoRealizzazione;
	@Column(nullable=false)
	private String tecnica;
	@Column(nullable=false)
	private String dimensione;
	@ManyToOne(fetch=FetchType.EAGER)
	private Autore autore;
	
	public Quadro() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getAnnoRealizzazione() {
		return annoRealizzazione;
	}

	public void setAnnoRealizzazione(Integer annoRealizzazione) {
		this.annoRealizzazione = annoRealizzazione;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public String getDimensione() {
		return dimensione;
	}

	public void setDimensione(String dimensione) {
		this.dimensione = dimensione;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}
	

}
