package com.chawki.produits.service;

import java.util.List;

import com.chawki.produits.entities.Enseignant;

public interface EnseignantService {
	Enseignant saveProduit(Enseignant p);

	Enseignant updateProduit(Enseignant p);

	void deleteProduit(Enseignant p);

	void deleteProduitById(Long id);

	Enseignant getProduit(Long id);

	List<Enseignant> getAllProduits();

}
