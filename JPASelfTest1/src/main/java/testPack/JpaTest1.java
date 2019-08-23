package testPack;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory ef = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = ef.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Car car= new Car();
		car.setIdcar(3);
		car.setColor("red");
		car.setManufacturer("chevy");
		car.setModel("cruise");
		em.persist(car);
		tx.commit();
		System.out.println("this car has been commited to DB finally--hurray");
	}

}
