package com.test;

import java.io.Serializable;
import javax.persistence.*;
 


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

@Entity
public class Employee {

	//@TableGenerator(name = "employee_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 100)
	@Id
	//@GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idemployee;
	private String firstname;
	private String lastname;
	private String email;

	@OneToOne
	@JoinColumn(name = "iddesk")
	private Desk desk;

	public int getIdemployee() {
		return idemployee;
	}

	@Override
	public String toString() {
		return "Employee [idemployee=" + idemployee + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", desk=" + desk + "]";
	}

	public void setIdemployee(int idemployee) {
		this.idemployee = idemployee;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Desk getDesk() {
		return desk;
	}

	public void setDesk(Desk desk) {
		this.desk = desk;
	}

}