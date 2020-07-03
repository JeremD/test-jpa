package fr.diginamic.essais;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.bibliotheque.Livre;

/**
 * JPA - TP 02
 * 
 * @author Jeremy
 *
 */
public class TestJpa {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityManagerfactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
				
		// -- Afficher un livre
		Livre livre = entityManager.find(Livre.class, 1);
		System.out.println("find --> " + livre.toString());

		// -- Inserer un livre
		Livre nouveauLivre = new Livre();
		nouveauLivre.setId(6);
		nouveauLivre.setTitre("L'Étranger");
		nouveauLivre.setAuteur("Albert Camus");

		// Execution de la transaction
		entityTransaction.begin();
		entityManager.persist(nouveauLivre);
		entityTransaction.commit();
		
		System.out.println("insert --> " + nouveauLivre.toString());
				
		// -- Modifier un livre
		Livre modifLivre = entityManager.find(Livre.class, 5);
		modifLivre.setTitre("Du plaisir dans la cuisine");
		
		entityTransaction.begin();
		entityManager.persist(modifLivre);
		entityTransaction.commit();
		
		System.out.println("update --> " + modifLivre.toString());
		
		//-- Extraire un livre en fonction du titre.
		TypedQuery<Livre> queryTitle = entityManager.createQuery("select l from Livre l where l.titre = = :titre", Livre.class);
		queryTitle.setParameter("titre", "Du plaisir dans la cuisine");
		List<Livre> listeLivre = queryTitle.getResultList();
		listeLivre.forEach(System.out::println);
		
		//-- Extraire un livre en fonction de l'auteur.
		TypedQuery<Livre> queryAuthor = entityManager.createQuery("select l from Livre l where l.auteur = :auteur", Livre.class);
		queryAuthor.setParameter("name", "Emile Zola");
		List<Livre> listeLivre2 = queryAuthor.getResultList();
		listeLivre2.forEach(System.out::println);
		
		//-- Supprimer un livre
		Livre retirerLivre = entityManager.find(Livre.class, 6);
		entityManager.remove(retirerLivre);
		
		entityManager.getTransaction().begin();
		entityManager.getTransaction().commit();
		
		//--Affichage de tous les livres
		TypedQuery<Livre> queryLivre = entityManager.createQuery("select l from Livre l", Livre.class);
		List<Livre> listeLivreAll = queryLivre.getResultList();
		listeLivreAll.forEach(System.out::println);
		
		entityManager.close();
		entityManagerfactory.close();
	}
}
