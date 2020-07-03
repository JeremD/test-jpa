package fr.diginamic.banque;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Entité Client
 * 
 * @author Jeremy
 *
 */
public class Client {

	/** id */
	@Id
	@GeneratedValue
	private int id;

	/** nom */
	private String nom;

	/** prénom */
	private String prenom;

	/** date de naissance */
	private LocalDate dateNaissance;

	@Embedded
	private Adresse adresse;

	@ManyToOne
	@JoinColumn
	private Banque banque;

	@ManyToMany(mappedBy = "client")
	private List<Compte> compte;

	/**
	 * Constructor
	 * 
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

	/**
	 * Getter
	 * 
	 * @return dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * Setter
	 * 
	 * @param dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * Getter
	 * 
	 * @return adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * Setter
	 * 
	 * @param adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter
	 * 
	 * @return banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**
	 * Setter
	 * 
	 * @param banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/**
	 * Getter
	 * 
	 * @return compte
	 */
	public List<Compte> getCompte() {
		return compte;
	}

	/**
	 * Setter
	 * 
	 * @param compte to set
	 */
	public void setCompte(List<Compte> compte) {
		this.compte = compte;
	}

}
