package com.qa.persistance.domain;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ProgramInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long programID;
	@OneToMany(mappedBy = "programID", cascade = CascadeType.PERSIST)
	private ArrayList<Program> programsOfType = new ArrayList<>();

	public long getProgramID() {
		return programID;
	}

	public void setProgramID(long programID) {
		this.programID = programID;
	}

	public ArrayList<Program> getProgramsOfType() {
		return programsOfType;
	}

	public void setProgramsOfType(ArrayList<Program> programsOfType) {
		this.programsOfType = programsOfType;
	}
}
