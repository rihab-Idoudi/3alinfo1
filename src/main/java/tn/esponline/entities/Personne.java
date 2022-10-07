package tn.esponline.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="t_personne")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Personne implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idclient")
	
	private int id;
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date datenaissance;
	@Enumerated(EnumType.STRING)
	@Column(name="dom")
	private Domaine domaine;
	
	private int age;
	@OneToOne
	private Contact contact;
	@ManyToMany
	private List<Competence> listComp;
	@ManyToOne
	private Laboratoire labo;
	
	public Domaine getDomaine() {
		return domaine;
	}
	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public List<Competence> getListComp() {
		return listComp;
	}
	public void setListComp(List<Competence> listComp) {
		this.listComp = listComp;
	}
	public Laboratoire getLabo() {
		return labo;
	}
	public void setLabo(Laboratoire labo) {
		this.labo = labo;
	}
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}
	public Personne(String nom, Date datenaissance, Domaine domaine) {
		super();
		this.nom = nom;
		this.datenaissance = datenaissance;
		this.domaine = domaine;
	}
	
	

}
