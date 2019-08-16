package com.test;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idemployee;
	private String name;

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "employee_project", joinColumns = @JoinColumn(name = "idemployee"), inverseJoinColumns = @JoinColumn(name = "idproject"))
	private List<Project> projects;

	public int getIdemployee() {
		return idemployee;
	}

	public void setIdemployee(int idemployee) {
		this.idemployee = idemployee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}