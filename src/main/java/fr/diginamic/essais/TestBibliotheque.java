package fr.diginamic.essais;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.bibliotheque.Emprunt;

/**
 * JPA : TP 03
 * 
 * @author Jeremy
 *
 */
public class TestBibliotheque {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityManagerfactory.createEntityManager();

		// Extraire un emprunt et tous ses livres
		TypedQuery<Emprunt> queryEmprunt = entityManager.createQuery("select e from Emprunt e where id=:id", Emprunt.class);
		queryEmprunt.setParameter("id", 5);
		List<Emprunt> listeEmprunt = queryEmprunt.getResultList();
		listeEmprunt.forEach(System.out::println);
		
		// Extraire tous les emprunts d'un client		
		TypedQuery<Emprunt> queryEmprunt2 = entityManager.createQuery("select e from Emprunt e where e.client.id=:id", Emprunt.class);
		queryEmprunt2.setParameter("id", 1);
		List<Emprunt> listeEmprunt2 = queryEmprunt2.getResultList();
		listeEmprunt2.forEach(System.out::println);
		
		entityManager.close();
		entityManagerfactory.close();
	}
}
