package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity 
@DiscriminatorValue("etd")
public class Etudiant extends Member implements Serializable{
	
	private String diplome;
	@Temporal(TemporalType.DATE)
	private Date dateInscription;
	@ManyToOne
	private EnseignantChercheur encadrant;
	
	
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public EnseignantChercheur getEncadrant() {
		return encadrant;
	}
	public void setEncadrant(EnseignantChercheur encadrant) {
		this.encadrant = encadrant;
	}
	
	
	public Etudiant() {
		super();
	}
	public Etudiant(String cin, String nom, String prenom, String email, String password, String cv, Date date,
			byte[] photo, String diplome, Date dateInscription, EnseignantChercheur encadrant) {
		super(cin, nom, prenom, email, password, cv, date, photo);
		this.diplome = diplome;
		this.dateInscription = dateInscription;
		this.encadrant = encadrant;
	}

	

}
