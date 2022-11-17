package com.chawki.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chawki.produits.entities.Enseignant;
import com.chawki.produits.repos.EnseignantRepository;

@SpringBootTest
class EnseignantsApplicationTests {

	@Autowired
	private EnseignantRepository enseignantRepository;

	@Test
	public void testCreateProduit() {
		Enseignant prod = new Enseignant("chawki");
		enseignantRepository.save(prod);
	}

	@Test
	public void testFindProduit() {
		Enseignant p = enseignantRepository.findById(1L).get();
		System.out.println(p);
	}

	@Test
	public void testUpdateProduit() {
		Enseignant p = enseignantRepository.findById(1L).get();
		p.setNomEnseignant("ahmed");
		enseignantRepository.save(p);
	}

	@Test
	public void testDeleteProduit() {
		enseignantRepository.deleteById(1L);
		;
	}

	@Test
	public void testListerTousProduits() {
		List<Enseignant> prods = enseignantRepository.findAll();
		for (Enseignant p : prods) {
			System.out.println(p);
		}
	}

}
