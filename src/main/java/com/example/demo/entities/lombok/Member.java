package com.example.demo.entities.lombok;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "type_mbr", discriminatorType = DiscriminatorType.STRING,length = 3)
@Data //@Data= @FieldDefaults(level=AccessLevel.PRIVATE) +@Setter + @Getter + @ToString
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public abstract class Member implements Serializable{
	
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String cin;
	@NonNull
	private String nom;
	@NonNull
	private String prenom;
	@NonNull
	private String email;
	@NonNull
	private String password;
	@NonNull
	private String cv;
	@NonNull
	@Temporal(TemporalType.DATE)
	private Date date;
	@NonNull
	//@Lob
	private byte[] photo;
	
	
}
