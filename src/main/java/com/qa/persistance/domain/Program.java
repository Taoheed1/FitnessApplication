package com.qa.persistance.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Program {

	@Id
	private String programName;
	private int day;
	private String exerciseName;
	private int reps;
	private int sets;
	private String programType;

	public Program() {
	}

	public Program(String programName, int day, String exerciseName, int reps, int sets, String programType) {
		this.programName = programName;
		this.day = day;
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

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
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
