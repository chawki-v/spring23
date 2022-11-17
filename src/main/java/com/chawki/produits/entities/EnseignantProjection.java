package com.chawki.produits.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomEnseignant", types = { Enseignant.class })
public interface EnseignantProjection {
	public String getNomEnseignant();
}