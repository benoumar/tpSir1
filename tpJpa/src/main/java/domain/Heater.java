package domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Heater {

	@Column(name="id_heater")
	private long id;
	private String nom_chauffage ;
	private String puissance;
	private Home homes;
	
	public Heater() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Heater(String nom_chauffage, String puissance,Home homes) {
		super();
		this.nom_chauffage = nom_chauffage;
		this.puissance = puissance;
		this.homes = homes;
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
	
	@ManyToOne
	public Home getHomes() {
		return homes;
	}
	public void setHomes(Home homes) {
		this.homes = homes;
	}
	
	
	
}
