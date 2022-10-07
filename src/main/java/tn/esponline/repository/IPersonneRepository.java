package tn.esponline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esponline.entities.Domaine;
import tn.esponline.entities.Personne;

@Repository
public interface IPersonneRepository extends JpaRepository<Personne, Integer> {
 
	
	public Personne findByNomAndAge(String nom, int age);
	public List<Personne> findByAgeGreaterThan(int age);
	
	@Query("select p from Personne p where p.domaine=:x and p.nom =:y")
	public List<Personne> getPersonnesByDomaine(@Param("x") Domaine d, @Param("y") String nom);


	@Query("select p from Personne p where p.domaine= ?1 and p.nom = ?2")
	public List<Personne> getPersonnesByDomaine2( Domaine d,  String nom);

}
