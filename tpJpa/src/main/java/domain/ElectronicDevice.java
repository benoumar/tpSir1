package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class ElectronicDevice {

	@Column(name="id_electronicDevice")
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
