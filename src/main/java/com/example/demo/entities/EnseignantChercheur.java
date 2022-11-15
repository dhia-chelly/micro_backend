package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
@DiscriminatorValue("ens")
public class EnseignantChercheur extends Member implements Serializable{
	
	private String grade;
	private String etablissement;
	@OneToMany(mappedBy="encadrant")
	private Collection<Etudiant> etudiants;
	

	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	
	public EnseignantChercheur(String cin, String nom, String prenom, String email, String password, String cv,
			Date date, byte[] photo, String grade, String etablissement, Collection<Etudiant> etudiants) {
		super(cin, nom, prenom, email, password, cv, date, photo);
		this.grade = grade;
		this.etablissement = etablissement;
		this.etudiants = etudiants;
	}
	public EnseignantChercheur() {
		super();
		// TODO Auto-generated constructor stub
	}


}
