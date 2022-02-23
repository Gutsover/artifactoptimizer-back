package com.artifactoptimizer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artifactoptimizer.controllers.dto.CreateArtifactDTO;
import com.artifactoptimizer.controllers.dto.UpdateArtifactDTO;
import com.artifactoptimizer.dao.ArtifactDAO;
import com.artifactoptimizer.dao.UserDAO;
import com.artifactoptimizer.entities.Artifact;
import com.artifactoptimizer.entities.User;

@Service
public class ArtifactService {

	@Autowired
	private ArtifactDAO artifactDAO;
	@Autowired
	private UserDAO userDAO;

	public Artifact createArtifact(CreateArtifactDTO artifactDTO) {
		Optional<User> user = userDAO.findById(artifactDTO.getIdUser());
		Artifact artifact = new Artifact(null, null, null, null, null, null, null, null, null, null, null, null, null);
		artifact.setUser(user.get());
		artifact.setLevel(artifactDTO.getLevel());
		artifact.setSetType(artifactDTO.getSetType());
		artifact.setPieceType(artifactDTO.getPieceType());
		artifact.setMainStat(artifactDTO.getMainStat());
		artifact.setSubStatOne(artifactDTO.getSubStatOne());
		artifact.setSubStatTwo(artifactDTO.getSubStatTwo());
		artifact.setSubStatThree(artifactDTO.getSubStatThree());
		artifact.setSubStatFour(artifactDTO.getSubStatFour());
		artifactDAO.save(artifact);
		return artifact;
	}

	public void deleteArtifactById(Long id) {
		artifactDAO.deleteById(id);
	}

	public List<Artifact> getAllArtifacts() {
		return artifactDAO.findAll();
	}

	public Optional<Artifact> findArtifactById(Long id) {
		return artifactDAO.findById(id);
	}

	public void updateArtifact(UpdateArtifactDTO updateArtifactDTO) {
		Optional<Artifact> currentArtifact = artifactDAO.findById(updateArtifactDTO.getId());
		Artifact artifact = currentArtifact.get();
		artifact.setLevel(updateArtifactDTO.getLevel());
		artifact.setSetType(updateArtifactDTO.getSetType());
		artifact.setPieceType(updateArtifactDTO.getPieceType());
		artifact.setMainStat(updateArtifactDTO.getMainStat());
		artifact.setSubStatOne(updateArtifactDTO.getSubStatOne());
		artifact.setSubStatTwo(updateArtifactDTO.getSubStatTwo());
		artifact.setSubStatThree(updateArtifactDTO.getSubStatThree());
		artifact.setSubStatFour(updateArtifactDTO.getSubStatFour());
		artifactDAO.save(artifact);
	}

}
