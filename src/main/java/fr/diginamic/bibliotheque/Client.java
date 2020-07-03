package fr.diginamic.bibliotheque;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entité Client
 * 
 * @author Jeremy
 *
 */
@Entity
@Table(name = "client")
public class Client {

	/** id */
	@Id
	private int id;

	/** nom */
	@Column(name = "NOM")
	private String nom;

	/** prenom */
	@Column(name = "PRENOM")
	private String prenom;

	/** jointure avec emprunt */
	@OneToMany(mappedBy = "client")
	private List<Emprunt> emprunt;

	
	/** Constructor
	 */
	public Client() {
		
	}

	/**
	 * Getter
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Constructor
	 * 
	 * @param nom
	 * @param prenom
	 */
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Setter
	 * 
	 * @param id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter
	 * 
	 * @param prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return  nom + " " + prenom;
	}

}
