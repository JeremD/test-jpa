package fr.diginamic.banque;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entité Banque
 * 
 * @author Jeremy
 *
 */
public class Banque {

	/** id */
	@Id
	@GeneratedValue
	private int id;

	/** nom */
	private String nom;

	@OneToMany(mappedBy = "banque")
	private List<Client> client;

	/**
	 * Constructor
	 * 
	 */
	public Banque() {
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
	 * @return client
	 */
	public List<Client> getClient() {
		return client;
	}

	/**
	 * Setter
	 * 
	 * @param client to set
	 */
	public void setClient(List<Client> client) {
		this.client = client;
	}

}
