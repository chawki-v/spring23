package com.chawki.produits.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.chawki.produits.entities.Enseignant;
import com.chawki.produits.service.EnseignantService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EnseignantRESTController {
	@Autowired
	EnseignantService enseignantService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Enseignant> getAllEnseignant() {
		return enseignantService.getAllEnseignant();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Enseignant getEnseignantById(@PathVariable("id") Long id) {
		return enseignantService.getEnseignant(id);

	}

	@RequestMapping(method = RequestMethod.POST)
	public Enseignant createEnseignant(@RequestBody Enseignant enseignant) {
		return enseignantService.saveEnseignant(enseignant);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Enseignant updateEnseignant(@RequestBody Enseignant enseignant) {
		return enseignantService.updateEnseignant(enseignant);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteEnseignant(@PathVariable("id") Long id) {
		enseignantService.deleteEnseignantById(id);
	}

	@RequestMapping(value = "/ensmat/{idMat}", method = RequestMethod.GET)
	public List<Enseignant> getEnseignantByMatId(@PathVariable("idMat") Long idMat) {
		return enseignantService.findByMatiereIdMat(idMat);
	}
}