package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


/*
 * 
 * Points to notice for Many to Many relationship JPA

@ManyToMany annotation specifies the relationship between Employee and Project entities.
@JoinColumn specifies the name of column that will refer to the Entity to be considered as owner of the association while @inverseJoinColumn specifies the name of inverse side of relationship. (You can choose any side to be considered as owner. Just make sure those sides in relationship). In our case we have chosen Employee as the owner so @JoinColumn refers to idemployee column in join table employee_project and @InverseJoinColumn refers to idproject which is inverse side of jpa many to many mapping.
@ManyToMany annotation in Project entity shows inverse relationship hence it uses mappedBy=projects to refer to the field in Employee entity.

 */
public class RelationTest2 {

	public static void main(String[] args) {
	
		/* Create EntityManagerFactory */
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPAExamples");

		/* Create EntityManager */
		EntityManager em = emf.createEntityManager();

		//EntityTransaction transaction = em.getTransaction();
		
		
		List<Employee> users = em.createQuery("SELECT e FROM Employee e").getResultList();

		System.out.println(users);
		
	}

}
