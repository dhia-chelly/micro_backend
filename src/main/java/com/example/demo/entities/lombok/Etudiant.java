package com.example.demo.entities.lombok;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity 
@DiscriminatorValue("etd")
@Data //@Data= @FieldDefaults(level=AccessLevel.PRIVATE) +@Setter + @Getter + @ToString
public class Etudiant extends Member implements Serializable{
	

	@NonNull
	private String diplome;
	@NonNull
	@Temporal(TemporalType.DATE)
	private Date dateInscription;
	@NonNull
	@ManyToOne
	private EnseignantChercheur encadrant;
	
	public Etudiant(Long id, @NonNull String cin, @NonNull String nom, @NonNull String prenom, @NonNull String email,
			@NonNull String password, @NonNull String cv, @NonNull Date date, @NonNull byte[] photo) {
		super(id, cin, nom, prenom, email, password, cv, date, photo);
	}

}
