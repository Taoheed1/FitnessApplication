package com.qa.business.service;

public interface ProgramService {

	String getAllPrograms();

	String getProgramsByType(String programType);

	String addNewProgram(String program);

	String deleteProgram(long programID);

	String updateProgram(long programID, String program);
}
