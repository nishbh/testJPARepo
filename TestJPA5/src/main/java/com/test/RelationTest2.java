package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RelationTest2 {

	public static void main(String[] args) {
	
		/* Create EntityManagerFactory */
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPAExamples");

		/* Create EntityManager */
		EntityManager em = emf.createEntityManager();

		EntityTransaction transaction = em.getTransaction();

		transaction.begin();
		
		Employee employee1 = new Employee();
		employee1.setFirstname("pranil");
		employee1.setLastname("gilda");
		//employee1.setEmail("sdfsdf");

		Employee employee2 = new Employee();
		employee2.setFirstname("prasad2");
		employee2.setLastname("kharkar2");
		//employee2.setEmail("dfgfdg2");
		
		Department department1 = new Department();
		department1.setName("IT");
		employee1.setDepartment(department1);
		employee2.setDepartment(department1);

		em.persist(employee2);
		em.persist(employee1);
		
		transaction.commit();
		/*
		 * List<Employee> employees = new ArrayList<Employee>();
		 * employees.add(employee1); employees.add(employee2);
		 */
		/*
		 * Department department1 = new Department(); department1.setName("IT");
		 * department1.setEmployees(employees);
		 * 
		 * employee1.setDepartment(department1);
		 */

		//em.persist(department1);
		/*
		 * int employeeID = employee1.getIdemployee(); int departmentid =
		 * department1.getIddepartment(); transaction.commit();
		 */
		/*
		 * transaction.begin();
		 * 
		 * Employee employee = em.find(Employee.class, employeeID);
		 * System.out.println(employee.getDepartment());
		 * 
		 * Department department = em.find(Department.class, departmentid);
		 * System.out.println(department.getEmployees());
		 * 
		 * transaction.commit();
		 */
		
	}

}
