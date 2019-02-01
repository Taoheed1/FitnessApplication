package com.qa.persistance.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Program {

	@Id
	private String programName;
	private String exerciseName;
	private int reps;
	private int sets;
	private String programType;
	// @OneToMany(fetch = FetchType.EAGER, mappedBy="programName",
	// cascade=CascadeType.ALL)
	// private List<Account> users = new ArrayList<>();

	public Program() {
	}

	public Program(String programName, String exerciseName, int reps, int sets, String programType) {
		this.programName = programName;
		this.exerciseName = exerciseName;
		this.reps = reps;
		this.sets = sets;
		this.programType = programType;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}

	public String getProgramType() {
		return programType;
	}

	public void setProgramType(String programType) {
		this.programType = programType;
	}

	// public List<Account> getUsers() {
	// return users;
	// }
	//
	// public void setUsers(List<Account> users) {
	// this.users = users;
	// }

}
