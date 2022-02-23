package com.artifactoptimizer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.artifactoptimizer.entities.Hero;
import com.artifactoptimizer.services.HeroService;

@RestController
public class HeroController {

	@Autowired
	HeroService heroService;
	
	@GetMapping("/heros")
	public ResponseEntity<List<Hero>> getAllHeros() {
		return new ResponseEntity<List<Hero>>(heroService.getAllHeros(), HttpStatus.OK);
	}
	
	@GetMapping("/hero/{id}")
	public ResponseEntity<Hero> findHeroById(@PathVariable Long id) {
		return new ResponseEntity<Hero>(heroService.findHeroById(id), HttpStatus.OK);
	}

}
