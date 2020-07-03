package fr.diginamic.bibliotheque;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Entité Livre
 * 
 * @author Jeremy
 *
 */
@Entity
@Table(name = "livre")
public class Livre {

	/** id */
	@Id
	private int id;

	/** titre */
	@Column(name = "TITRE")
	private String titre;

	/** auteur */
	@Column(name = "AUTEUR")
	private String auteur;

	/** jointure avec compo */
	@ManyToMany
	@JoinTable(name = "compo", joinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
	private List<Emprunt> emprunt;

	/**
	 * Getter
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * Setter
	 * 
	 * @param titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * Getter
	 * 
	 * @return auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * Setter
	 * 
	 * @param auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * toString()
	 */
	@Override
	public String toString() {
		return "Titre du livre : " + getTitre() + ", Auteur : " + getAuteur();
	}

}
