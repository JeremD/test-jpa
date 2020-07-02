package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class TestJpa {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityManagerfactory.createEntityManager();

		System.out.println(entityManagerfactory);
		System.out.println(entityManager);

		entityManager.close();
		entityManagerfactory.close();
	}
}
