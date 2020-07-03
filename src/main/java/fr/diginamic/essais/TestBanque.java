package fr.diginamic.essais;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Jeremy
 *
 */
public class TestBanque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("pu_banque");
		EntityManager entityManager = entityManagerfactory.createEntityManager();


	}

}
