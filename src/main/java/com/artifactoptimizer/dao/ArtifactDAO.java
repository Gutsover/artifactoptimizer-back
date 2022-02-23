package com.artifactoptimizer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artifactoptimizer.entities.Artifact;

@Repository
public interface ArtifactDAO extends JpaRepository<Artifact, Long> {

}
