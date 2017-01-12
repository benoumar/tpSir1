package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Heater {

	
	private long id;
	private String nom_chauffage ;
	private String puissance;
	public Heater() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Heater(String nom_chauffage, String puissance) {
		super();
		this.nom_chauffage = nom_chauffage;
		this.puissance = puissance;
	}
	@Id @GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom_chauffage() {
		return nom_chauffage;
	}
	public void setNom_chauffage(String nom_chauffage) {
		this.nom_chauffage = nom_chauffage;
	}
	public String getPuissance() {
		return puissance;
	}
	public void setPuissance(String puissance) {
		this.puissance = puissance;
	}
	
	
	
}
