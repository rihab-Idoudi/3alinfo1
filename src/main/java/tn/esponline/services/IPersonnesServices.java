package tn.esponline.services;

import java.util.List;

import tn.esponline.entities.Personne;

public interface IPersonnesServices {
	
	public Personne addPersonne(Personne p);
	public Personne findById(int  idp);
	
	public Personne getbynomandage(String nom, int age);
	
	public List<Personne> getAllByage(int age);
	
	public List<Personne> getAll ();

}
