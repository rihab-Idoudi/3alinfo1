package tn.esponline.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Laboratoire implements Serializable {
	@Id
	private int id;
	
	private String adresse;
	@OneToMany(mappedBy = "labo")
	private List<Personne> listPersonnes;

	public Laboratoire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
