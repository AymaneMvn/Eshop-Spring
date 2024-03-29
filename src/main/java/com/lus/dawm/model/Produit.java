package com.lus.dawm.model;
import java.io.Serializable;
import java.util.List;

public class Produit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String designation, description;
	private int qte;
	
	private Categorie categorie;
	
	private List<LigneCommade> ligneCommades;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public List<LigneCommade> getLigneCommades() {
		return ligneCommades;
	}

	public void setLigneCommades(List<LigneCommade> ligneCommades) {
		this.ligneCommades = ligneCommades;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
