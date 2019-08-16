package com.test;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

@Entity
public class Department {

	@Override
	public String toString() {
		return "Department [iddepartment=" + iddepartment + ", name=" + name + ", employees=" + employees + "]";
	}

	//@TableGenerator(table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", name = "department_gen", allocationSize = 1)
	@Id
	//@GeneratedValue(strategy = GenerationType.TABLE, generator = "department_gen")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddepartment;
	/*
	 * @Override public String toString() { return "Department [iddepartment=" +
	 * iddepartment + ", name=" + name + ", employees=" + employees + "]"; }
	 */

	private String name;

	//@OneToMany(mappedBy = "department")
	//private List<Employee> employees;
	
	@OneToMany(mappedBy = "department")
	private List<Employee> employees;

	public int getIddepartment() {
		return iddepartment;
	}

	public void setIddepartment(int iddepartment) {
		this.iddepartment = iddepartment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
 
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	/*
	 * public List<Employee> getEmployees() { return employees; }
	 * 
	 * public void setEmployees(List<Employee> employees) { this.employees =
	 * employees; }
	 */

}