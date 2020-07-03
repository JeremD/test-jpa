package fr.diginamic.banque;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * Entité Compte
 * 
 * @author Jeremy
 *
 */
public class Compte {

	/** id */
	@Id
	@GeneratedValue
	private int id;

	/** numero */
	private String numero;

	/** solde */
	private double solde;

	@ManyToMany(mappedBy = "compte")
	private List<Client> client;

	@OneToMany(mappedBy = "compte")
	private List<Operation> operation;

	/**
	 * Constructor
	 * 
	 */
	public Compte() {
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
	 * @return numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Setter
	 * 
	 * @param numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Getter
	 * 
	 * @return solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
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

	/**
	 * Getter
	 * 
	 * @return operation
	 */
	public List<Operation> getOperation() {
		return operation;
	}

	/**
	 * Setter
	 * 
	 * @param operation to set
	 */
	public void setOperation(List<Operation> operation) {
		this.operation = operation;
	}

}
