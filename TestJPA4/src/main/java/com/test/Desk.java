package com.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

@Entity
public class Desk {

	//@TableGenerator(table = "id_gen", name = "desk_gen", pkColumnName = "gen_name", valueColumnName = "gen_value", allocationSize = 1)
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int iddesk;
	private int number1;
	private String location;

	public int getIddesk() {
		return iddesk;
	}

	public void setIddesk(int iddesk) {
		this.iddesk = iddesk;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number) {
		this.number1 = number;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	@OneToOne(mappedBy = "desk")
	private Employee employee;
	 
	public Employee getEmployee() {
		return employee;
	}
	 
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}