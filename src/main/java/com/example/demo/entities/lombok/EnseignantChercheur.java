package com.example.demo.entities.lombok;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NonNull;
@Entity
@DiscriminatorValue("ens")
@Data //@Data= @FieldDefaults(level=AccessLevel.PRIVATE) +@Setter + @Getter + @ToString
public class EnseignantChercheur extends Member implements Serializable{
	@NonNull
	private String grade;
	@NonNull
	private String etablissement;
	@NonNull
	@OneToMany(mappedBy="encadrant")
	private Collection<Etudiant> etudiants;
	
	public EnseignantChercheur(Long id, @NonNull String cin, @NonNull String nom, @NonNull String prenom,
			@NonNull String email, @NonNull String password, @NonNull String cv, @NonNull Date date,
			@NonNull byte[] photo) {
		super(id, cin, nom, prenom, email, password, cv, date, photo);
		// TODO Auto-generated constructor stub
	}

}
