package com.chawki.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chawki.produits.entities.Enseignant;
import com.chawki.produits.repos.EnseignantRepository;

@Service
public class EnseignantServiceImpl implements EnseignantService {
	@Autowired
	EnseignantRepository enseignantRepository;

	@Override
	public Enseignant saveProduit(Enseignant p) {
		return enseignantRepository.save(p);
	}

	@Override
	public Enseignant updateProduit(Enseignant p) {
		return enseignantRepository.save(p);
	}

	@Override
	public void deleteProduit(Enseignant p) {
		enseignantRepository.delete(p);
	}

	@Override
	public void deleteProduitById(Long id) {
		enseignantRepository.deleteById(id);
	}

	@Override
	public Enseignant getProduit(Long id) {
		return enseignantRepository.findById(id).get();
	}

	@Override
	public List<Enseignant> getAllProduits() {
		return enseignantRepository.findAll();
	}
}
