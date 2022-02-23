package com.artifactoptimizer.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Hero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@ManyToOne
	@JsonIgnore
	private User user;

	@OneToMany(mappedBy = "hero")
	private List<Artifact> artifacts;

	public Hero(Long id, String name, User user, List<Artifact> artifacts) {
		super();
		this.id = id;
		this.name = name;
		this.user = user;
		this.artifacts = artifacts;
	}

	public Hero() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Artifact> getArtifacts() {
		return artifacts;
	}

	public void setArtifacts(List<Artifact> artifacts) {
		this.artifacts = artifacts;
	}

	@Override
	public String toString() {
		return "Character [id=" + id + ", name=" + name + ", user=" + user + ", artifacts=" + artifacts + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(artifacts, id, name, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hero other = (Hero) obj;
		return Objects.equals(artifacts, other.artifacts) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(user, other.user);
	}

}
