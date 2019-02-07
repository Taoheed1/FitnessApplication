package com.qa.persistance.repository;

public interface ProgramRepository {
	
	String getAllPrograms();
	
	String getProgramsByType(String programType);
	
	String getProgramsByName(String programName);

	String addNewProgram(String program);

	String deleteProgram(Long programID);

	String updateProgram(Long programID, String program);
}
