package tn.esprit.spring.entities;





import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;



public class Voyage2  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long idVoyage2;
	

	long codeVoyage2;
	
	private Ville gareDepart2;
	
	
	private Ville gareArrivee2;
	
	private Date dateDepart2;
	
	private Date dateArrivee2;
	
	private double heureDepart2;
	
	private double heureArrivee2;
	
	Train train2;
	
	
    public List<Voyageur> mesVoyageurs2;


	public long getCodeVoyage() {
		return codeVoyage2;
	}


	public void setCodeVoyage(long codeVoyage2) {
		this.codeVoyage2 = codeVoyage2;
	}


	public Long getidVoyage2() {
		return idVoyage2;
	}


	public void setidVoyage2(Long idVoyage2) {
		this.idVoyage2 = idVoyage2;
	}


	public Ville getgareDepart2() {
		return gareDepart2;
	}


	public void setgareDepart2(Ville gareDepart2) {
		this.gareDepart2 = gareDepart2;
	}


	public Ville getgareArrivee2() {
		return gareArrivee2;
	}


	public void setgareArrivee2(Ville gareArrivee2) {
		this.gareArrivee2 = gareArrivee2;
	}


	public Date getdateDepart2() {
		return dateDepart2;
	}


	public void setdateDepart2(Date dateDepart2) {
		this.dateDepart2 = dateDepart2;
	}


	public Date getdateArrivee2() {
		return dateArrivee2;
	}


	public void setdateArrivee2(Date dateArrivee2) {
		this.dateArrivee2 = dateArrivee2;
	}


	public double getheureDepart2() {
		return heureDepart2;
	}


	public void setheureDepart2(double heureDepart2) {
		this.heureDepart2 = heureDepart2;
	}


	public double getheureArrivee2() {
		return heureArrivee2;
	}


	public void setheureArrivee2(double heureArrivee2) {
		this.heureArrivee2 = heureArrivee2;
	}


	public Train getTrain() {
		return train2;
	}


	public void setTrain(Train train2) {
		this.train2 = train2;
	}


	public List<Voyageur> getMesVoyageurs() {
		return mesVoyageurs2;
	}


	public void setMesVoyageurs(List<Voyageur> mesVoyageurs2) {
		this.mesVoyageurs2 = mesVoyageurs2;
	}


	public Voyage2() {
		super();
	}
	
	


    


	
	
}
