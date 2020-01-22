package com.gestion.livres.models;

import java.time.LocalDate;

public class Livre {
	private Long id;
	private String isbn;
	private String description;
	private String titre;
	private double prix;
	private LocalDate datePub;
	
	public Livre() {}

	public Livre(Long id, String titre, Double prix) {
		super();
		this.id = id;
		this.titre = titre;
		this .prix = prix;
	}

	public Livre(String isbn, String description, String titre, double prix, LocalDate datePub) {
		super();
		this.isbn = isbn;
		this.description = description;
		this.titre = titre;
		this.prix = prix;
		this.datePub = datePub;
	}

	public Livre(Long id, String isbn, String description, String titre, double prix, LocalDate datePub) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.description = description;
		this.titre = titre;
		this.prix = prix;
		this.datePub = datePub;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public LocalDate getDatePub() {
		return datePub;
	}

	public void setDatePub(LocalDate datePub) {
		this.datePub = datePub;
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", isbn=" + isbn + ", description=" + description + ", titre=" + titre + ", prix="
				+ prix + ", datePub=" + datePub + "]";
	}
	
}
