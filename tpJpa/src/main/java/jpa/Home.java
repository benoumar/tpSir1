package jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Home {

	
	private long id;
	private long taille;
	private long nombre_de_pi�ce ;
	
	
	private Collection<	Heater> chauffage;
	
	
	private Collection<ElectronicDevice> equip_electronics;

	public Home() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Home(long taille, long nombre_de_pi�ce, Collection<Heater> chauffage,
			Collection<ElectronicDevice> equip_electronics) {
		super();
		this.taille = taille;
		this.nombre_de_pi�ce = nombre_de_pi�ce;
		this.chauffage = chauffage;
		this.equip_electronics = equip_electronics;
	}
	
	@Id @GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTaille() {
		return taille;
	}

	public void setTaille(long taille) {
		this.taille = taille;
	}

	public long getNombre_de_pi�ce() {
		return nombre_de_pi�ce;
	}

	public void setNombre_de_pi�ce(long nombre_de_pi�ce) {
		this.nombre_de_pi�ce = nombre_de_pi�ce;
	}
	@Transient
	public Collection<Heater> getChauffage() {
		return chauffage;
	}

	public void setChauffage(Collection<Heater> chauffage) {
		this.chauffage = chauffage;
	}
	@Transient
	public Collection<ElectronicDevice> getEquip_electronics() {
		return equip_electronics;
	}

	public void setEquip_electronics(Collection<ElectronicDevice> equip_electronics) {
		this.equip_electronics = equip_electronics;
	}
	
	
	
}
