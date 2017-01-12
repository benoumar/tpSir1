package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ElectronicDevice {

	
	private long id;
	private long consommation;
	private Person personnes;
	
	public ElectronicDevice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectronicDevice(long cconsommation) {
		super();
		this.consommation = cconsommation;
	}
	
	@Id @GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCconsommation() {
		return consommation;
	}
	public void setCconsommation(long cconsommation) {
		this.consommation = cconsommation;
	}
	@ManyToOne
	public Person getPersonnes() {
		return personnes;
	}
	public void setPersonnes(Person personnes) {
		this.personnes = personnes;
	}
	
	
}
