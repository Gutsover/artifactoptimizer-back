package com.artifactoptimizer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artifactoptimizer.controllers.dto.CreateArtifactDTO;
import com.artifactoptimizer.controllers.dto.UpdateArtifactDTO;
import com.artifactoptimizer.entities.Artifact;
import com.artifactoptimizer.services.ArtifactService;

@RestController
@RequestMapping("/artifact")
@CrossOrigin(origins = "http://localhost:4200")
public class ArtifactController {

	@Autowired
	ArtifactService artifactService;

	@PostMapping
	public ResponseEntity<Artifact> createArtifact(@RequestBody CreateArtifactDTO artifactDTO) {
		return new ResponseEntity<Artifact>(artifactService.createArtifact(artifactDTO), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public void deleteArtifact(@PathVariable Long id) {
		artifactService.deleteArtifactById(id);
	}

	@GetMapping
	public ResponseEntity<List<Artifact>> getAllArtifacts() {
		return new ResponseEntity<List<Artifact>>(artifactService.getAllArtifacts(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Artifact> findArtifactById(@PathVariable Long id) {
		return new ResponseEntity<Artifact>(HttpStatus.OK);
	}

	@PutMapping
	public void updateArtifact(@RequestBody UpdateArtifactDTO updateArtifactDTO) {
		artifactService.updateArtifact(updateArtifactDTO);
	}

}
