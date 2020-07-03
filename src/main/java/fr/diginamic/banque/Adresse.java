package fr.diginamic.banque;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entité Operation
 * 
 * @author Jeremy
 *
 */
@Embeddable
public class Adresse {

	/** id */
	@Id
	@GeneratedValue
	private int id;
	
	/** numero */
	private int numero;
	
	/** rue */
	private String rue;
	
	/** codePostal */
	private int codePostal;
	
	/** ville */
	private String ville;
	
}
