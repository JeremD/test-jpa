package fr.diginamic.banque;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

/**
 * Entité Operation
 * 
 * @author Jeremy
 *
 */
public class Operation {

	/** id */
	@Id
	@GeneratedValue
	private int id;

	/** date */
	private LocalDate date;

	/** montant */
	private double montant;

	/** motif */
	private String motif;

	@ManyToOne
	@JoinTable
	private List<Compte> compte;

	/**
	 * Constructor
	 * 
	 */
	public Operation() {
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
	 * @return date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Setter
	 * 
	 * @param date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Getter
	 * 
	 * @return montant
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * Setter
	 * 
	 * @param montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/**
	 * Getter
	 * 
	 * @return motif
	 */
	public String getMotif() {
		return motif;
	}

	/**
	 * Setter
	 * 
	 * @param motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
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
