package com.artifactoptimizer.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Artifact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JsonIgnore
	private User user;

	@ManyToOne
	private Hero hero;

	private String pieceType;
	private String setType;
	private String nameArtifact;
	private String picture;
	private Integer level;
	private Double mainStat;
	private Double subStatOne;
	private Double subStatTwo;
	private Double subStatThree;
	private Double subStatFour;

	public Artifact(Long id, User user, Hero hero, String pieceType, String setType, String nameArtifact,
			String picture, Integer level, Double mainStat, Double subStatOne, Double subStatTwo, Double subStatThree,
			Double subStatFour) {
		super();
		this.id = id;
		this.user = user;
		this.hero = hero;
		this.pieceType = pieceType;
		this.setType = setType;
		this.nameArtifact = nameArtifact;
		this.picture = picture;
		this.level = level;
		this.mainStat = mainStat;
		this.subStatOne = subStatOne;
		this.subStatTwo = subStatTwo;
		this.subStatThree = subStatThree;
		this.subStatFour = subStatFour;
	}

	public Artifact() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}

	public String getPieceType() {
		return pieceType;
	}

	public void setPieceType(String pieceType) {
		this.pieceType = pieceType;
	}

	public String getSetType() {
		return setType;
	}

	public void setSetType(String setType) {
		this.setType = setType;
	}

	public String getNameArtifact() {
		return nameArtifact;
	}

	public void setNameArtifact(String nameArtifact) {
		this.nameArtifact = nameArtifact;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Double getMainStat() {
		return mainStat;
	}

	public void setMainStat(Double mainStat) {
		this.mainStat = mainStat;
	}

	public Double getSubStatOne() {
		return subStatOne;
	}

	public void setSubStatOne(Double subStatOne) {
		this.subStatOne = subStatOne;
	}

	public Double getSubStatTwo() {
		return subStatTwo;
	}

	public void setSubStatTwo(Double subStatTwo) {
		this.subStatTwo = subStatTwo;
	}

	public Double getSubStatThree() {
		return subStatThree;
	}

	public void setSubStatThree(Double subStatThree) {
		this.subStatThree = subStatThree;
	}

	public Double getSubStatFour() {
		return subStatFour;
	}

	public void setSubStatFour(Double subStatFour) {
		this.subStatFour = subStatFour;
	}

	@Override
	public String toString() {
		return "Artifact [id=" + id + ", user=" + user + ", hero=" + hero + ", pieceType=" + pieceType + ", setType="
				+ setType + ", nameArtifact=" + nameArtifact + ", picture=" + picture + ", level=" + level
				+ ", mainStat=" + mainStat + ", subStatOne=" + subStatOne + ", subStatTwo=" + subStatTwo
				+ ", subStatThree=" + subStatThree + ", subStatFour=" + subStatFour + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hero, id, level, mainStat, nameArtifact, picture, pieceType, setType, subStatFour,
				subStatOne, subStatThree, subStatTwo, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artifact other = (Artifact) obj;
		return Objects.equals(hero, other.hero) && Objects.equals(id, other.id) && Objects.equals(level, other.level)
				&& Objects.equals(mainStat, other.mainStat) && Objects.equals(nameArtifact, other.nameArtifact)
				&& Objects.equals(picture, other.picture) && Objects.equals(pieceType, other.pieceType)
				&& Objects.equals(setType, other.setType) && Objects.equals(subStatFour, other.subStatFour)
				&& Objects.equals(subStatOne, other.subStatOne) && Objects.equals(subStatThree, other.subStatThree)
				&& Objects.equals(subStatTwo, other.subStatTwo) && Objects.equals(user, other.user);
	}

}
