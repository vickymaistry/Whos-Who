package com.example.whosWho.Domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="Project")
public class Project {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String projectName;
	private String projectAbbreviation;
	private String projectDescription;
	
	public Project(){}
	
	
	public String getProjectName() {
		return projectName;
	}
	public Project(String projectName, String projectAbbreviation, String projectDescription) {
		super();
		this.projectName = projectName;
		this.projectAbbreviation = projectAbbreviation;
		this.projectDescription = projectDescription;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectAbbreviation() {
		return projectAbbreviation;
	}
	public void setProjectAbbreviation(String projectAbbreviation) {
		this.projectAbbreviation = projectAbbreviation;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	
	

}
