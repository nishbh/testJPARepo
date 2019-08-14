package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RelationTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* Create EntityManagerFactory */
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPAExamples");

		/* Create EntityManager */
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx= em.getTransaction();
		
		Employee employee;

		employee = new Employee();
		employee.setFirstname("pranil4");
		employee.setLastname("gilda4");
		employee.setEmail("sdfsdf4");

		Desk desk = em.find(Desk.class, 1); // retrieves desk from database
		employee.setDesk(desk);
		tx.begin();
		em.persist(employee);
		tx.commit();
		
		desk = em.find(Desk.class, 1); // retrieves desk from database
		desk.setEmployee(employee);
		System.out.println(desk.getEmployee());

		/*
		 * desk = em.find(Desk.class, 1); // retrieves desk from database
		 * desk.setEmployee(employee); System.out.println(desk.getEmployee());
		 */
	}

}
