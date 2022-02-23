package com.artifactoptimizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.artifactoptimizer.controllers.dto.CreateArtifactDTO;
import com.artifactoptimizer.entities.User;
import com.artifactoptimizer.services.ArtifactService;
import com.artifactoptimizer.services.UserService;

@SpringBootApplication
public class ArtifactoptimizerApplication {

	@Autowired
	UserService userService;

	@Autowired
	ArtifactService artifactService;

	public static void main(String[] args) {
		SpringApplication.run(ArtifactoptimizerApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return (args) -> {

		};
	}

}