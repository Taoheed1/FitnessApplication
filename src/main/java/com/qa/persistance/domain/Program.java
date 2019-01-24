package com.qa.persistance.domain;

import java.awt.List;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Program {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long programID;
	private String programName;
	private String exerciseType;
	private int reps;
	private String intensity;
	@OneToMany(mappedBy="userID", cascade=CascadeType.ALL)
	private ArrayList<Account> users = new ArrayList<>();


	public Program() {

	}

	public Program(String programName, String exerciseType, int reps) {
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
