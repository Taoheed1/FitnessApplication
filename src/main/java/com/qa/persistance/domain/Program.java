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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long programID;
	private String programName;
	private String exerciseName;
	private int reps;
	private int sets;
	private ProgramType programType;
//	@OneToMany(fetch = FetchType.EAGER, mappedBy="programID", cascade=CascadeType.ALL)
//	private List<Account> users = new ArrayList<>();


	public Program() {
	}

	public Program(String programName, String exerciseName, int reps, int sets, ProgramType programType) {
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

	public long getProgramID() {
		return programID;
	}

	public void setProgramID(long programID) {
		this.programID = programID;
	}

	public ProgramType getProgramType() {
		return programType;
	}

	public void setProgramType(ProgramType programType) {
		this.programType = programType;
	}

//	public List<Account> getUsers() {
//		return users;
//	}
//
//	public void setUsers(List<Account> users) {
//		this.users = users;
//	}

}
