package tn.esponline;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esponline.entities.Domaine;
import tn.esponline.entities.Personne;
import tn.esponline.services.IPersonnesServices;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonneServicesTest {
	@Autowired
	IPersonnesServices personneservice;

	@Test
	public void testaddPersonne() throws ParseException {
//		SimpleDateFormat df= new SimpleDateFormat("dd/mm/yyyy");
//		Date date= df.parse("22/05/1986");
//		Personne p = new Personne("Salma", date, Domaine.info);
//		personneservice.addPersonne(p);
			Assertions.assertEquals(3, personneservice.getAll().size());
	}

}
