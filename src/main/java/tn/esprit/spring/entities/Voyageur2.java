package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Voyageur2 implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long idVoyageur2;
	
	String nomVoyageur2;

	
	public List<Voyage> getMesvoyages2() {
		return mesvoyages2;
	}

	public void setMesvoyages2(List<Voyage> mesvoyages2) {
		this.mesvoyages2 = mesvoyages2;
	}

    public List<Voyage> mesvoyages2;

	public Long getIdVoyageur2() {
		return idVoyageur2;
	}

	public void setIdVoyageur(Long idVoyageur2) {
		this.idVoyageur2 = idVoyageur2;
	}

	public String getNomVoyageur() {
		return nomVoyageur2;
	}

	public void setNomVoyageur(String nomVoyageur2) {
		this.nomVoyageur2 = nomVoyageur2;
	}

	public Voyageur2() {
		super();
	}
	
	
}
