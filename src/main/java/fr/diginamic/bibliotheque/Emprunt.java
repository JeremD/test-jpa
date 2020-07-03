package fr.diginamic.bibliotheque;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entité Emprunt
 * 
 * @author Jeremy
 *
 */
@Entity
@Table(name = "emprunt")
public class Emprunt {

	/** id */
	@Id
	private int id;

	/** date debut */
	@Column(name = "DATE_DEBUT")
	private LocalDate dateDebut;

	/** delai */
	@Column(name = "DELAI")
	private int delai;

	/** date fin */
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;

	/** jointure avec client */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_CLIENT")
	private Client client;

	/** jointure avec compo */
	@ManyToMany
	@JoinTable(name = "compo", joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
	private List<Livre> livre;

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
	 * @return dateDebut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/**
	 * Setter
	 * 
	 * @param dateDebut to set
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Getter
	 * 
	 * @return delai
	 */
	public int getDelai() {
		return delai;
	}

	/**
	 * Setter
	 * 
	 * @param delai to set
	 */
	public void setDelai(int delai) {
		this.delai = delai;
	}

	/**
	 * Getter
	 * 
	 * @return dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * Setter
	 * 
	 * @param dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Getter
	 * 
	 * @return client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Setter
	 * 
	 * @param client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Getter
	 * 
	 * @return livre
	 */
	public List<Livre> getLivre() {
		return livre;
	}

	/**
	 * Setter
	 * 
	 * @param livre to set
	 */
	public void setLivre(List<Livre> livre) {
		this.livre = livre;
	}

	/**
	 * toString()
	 */
	@Override
	public String toString() {
		return getClient() + " - Emprunt du " + getDateDebut() + " au " + getDateFin() + ", Livre(s) emprunté(s) : " + getLivre();
	}

}
