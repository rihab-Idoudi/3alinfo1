package tn.esponline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esponline.entities.Personne;
import tn.esponline.repository.IPersonneRepository;
@Service
public class PersonnesServices implements IPersonnesServices {
	
	@Autowired
	IPersonneRepository persrep;

	@Override
	public Personne addPersonne(Personne p) {
		// TODO Auto-generated method stub
		return persrep.save(p);
	}

	@Override
	public Personne findById(int idp) {
		// TODO Auto-generated method stub
		return persrep.findById(idp).orElse(null);
	}

	@Override
	public Personne getbynomandage(String nom, int age) {
		// TODO Auto-generated method stub
		return persrep.findByNomAndAge(nom, age);
	}

	@Override
	public List<Personne> getAllByage(int age) {
		// TODO Auto-generated method stub
		return persrep.findByAgeGreaterThan(age);
	}

	@Override
	public List<Personne> getAll() {
		// TODO Auto-generated method stub
		return (List<Personne>) persrep.findAll();
	}

}
