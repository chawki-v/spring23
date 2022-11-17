package com.chawki.produits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.chawki.produits.entities.Enseignant;
import com.chawki.produits.repos.EnseignantRepository;

@SpringBootApplication
public class EnseignantsApplication implements CommandLineRunner {
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;


	public static void main(String[] args) {
		SpringApplication.run(EnseignantsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Enseignant.class);

	}
}