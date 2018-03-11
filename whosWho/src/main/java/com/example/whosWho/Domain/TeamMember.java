package com.example.whosWho.Domain;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Team_Member")
public class TeamMember {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;

	private String lastName;
	
	private String funFact;
	
	@Column (length = 10000)
	private String photoUrl;
	
	public TeamMember(){}
	
	public TeamMember(String firstName, String lastName, String funFact, String photoUrl) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.funFact = funFact;
		this.photoUrl = photoUrl;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFunFact() {
		return funFact;
	}
	public void setFunFact(String funFact) {
		this.funFact = funFact;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

}
