package fr.treeptik.pojo;

import java.io.Serializable;
import java.util.List;

public class Contact implements Serializable{
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private Integer id;
	private String nom;
	private String prenom;
	private List<Numero> numeros;

	public Contact() {
		super();
	}

	public Contact( String nom, String prenom) {
		super();
		//this.id= id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Numero> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Numero> numeros) {
		this.numeros = numeros;
	}

}
