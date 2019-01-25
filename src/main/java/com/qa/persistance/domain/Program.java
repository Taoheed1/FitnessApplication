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
	private String exerciseName;
	private int reps;
	private ProgramType programType;
	@OneToMany(mappedBy="userID", cascade=CascadeType.ALL)
	private ArrayList<Account> users = new ArrayList<>();


	public Program() {
	}

	public Program(String programName, String exerciseName, int reps) {
		this.programName = programName;
		this.exerciseName = exerciseName;
		this.reps = reps;
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

	public ArrayList<Account> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<Account> users) {
		this.users = users;
	}

}
