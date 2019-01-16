package com.qa.persistance.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long UserID;
	@Size(min=1, max=20)
	private String firstName;
	@Size(min=1, max=20)
	private String lastName;
	private int programCode;

	public Account() {
	}

	public Long getUserID() {
		return UserID;
	}

	public void setUserID(Long userID) {
		UserID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getProgramCode() {
		return programCode;
	}

	public void setProgramCode(int programCode) {
		this.programCode = programCode;
	}

	public Account(String firstName, String lastName, int programCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.programCode = programCode;
	}
}
