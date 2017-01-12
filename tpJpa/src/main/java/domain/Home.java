package domain;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Home {

	@Column(name="id_home")
	private long id;
	private long taille;
	private long nombre_de_pièce ;
	private  Person person_homme;
	
	private Collection<	Heater> chauffage;
	
	

	public Home() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Home(long taille, long nombre_de_pièce, Collection<Heater> chauffage,
			Person person_homme) {
		super();
		this.taille = taille;
		this.nombre_de_pièce = nombre_de_pièce;
		this.chauffage = chauffage;
		this.person_homme= person_homme;
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

	public long getNombre_de_pièce() {
		return nombre_de_pièce;
	}

	public void setNombre_de_pièce(long nombre_de_pièce) {
		this.nombre_de_pièce = nombre_de_pièce;
	}
	
	@OneToMany(mappedBy="homes", cascade=CascadeType.PERSIST)
	public Collection<Heater> getChauffage() {
		return chauffage;
	}

	public void setChauffage(Collection<Heater> chauffage) {
		this.chauffage = chauffage;
	}
	
	@ManyToOne
	public Person getPerson_homme() {
		return person_homme;
	}

	public void setPerson_homme(Person person_homme) {
		this.person_homme = person_homme;
	}
	
	
	
}
