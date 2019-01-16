package com.qa.persistance.repository;

import javax.persistence.Entity;

@Entity
public class Programs {

	
	private String programName;
	private String exerciseType;
	private int reps;
	private String intensity;
	
	public Programs() {
		
	}
	
	public Programs(String programName, String exerciseType, int reps) {
		this.programName = programName;
		this.exerciseType = exerciseType;
		this.reps = reps;
		
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getExerciseType() {
		return exerciseType;
	}

	public void setExerciseType(String exerciseType) {
		this.exerciseType = exerciseType;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public String getIntensity() {
		return intensity;
	}

	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}
}
