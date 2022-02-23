package com.artifactoptimizer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artifactoptimizer.entities.Hero;

@Repository
public interface HeroDAO extends JpaRepository<Hero, Long> {

}
