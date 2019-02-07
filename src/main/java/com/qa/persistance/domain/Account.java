package com.qa.persistance.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long UserID;
	@Size(min = 1, max = 20)
	private String userName;
	private String password;
	private String proficiency;
//	@OneToMany(fetch = FetchType.EAGER)
//	@JoinColumn(name="programName")
//	private List<Program> progamExerciseList = new ArrayList<>();

	public Account() {
	}

	public Account(String userName, String password, String proficiency) {
		this.userName = userName;
		this.password = password;
		this.proficiency = proficiency;
	}

	public Long getUserID() {
		return UserID;
	}

	public void setUserID(Long userID) {
		UserID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProficiency() {
		return proficiency;
	}

	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}

}