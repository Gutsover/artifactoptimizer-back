package com.artifactoptimizer.controllers.dto;

public class CreateArtifactDTO {

	private String pieceType;
	private String setType;
	private Integer level;
	private Double mainStat;
	private Double subStatOne;
	private Double subStatTwo;
	private Double subStatThree;
	private Double subStatFour;
	private Long idUser;
	
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
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

}
