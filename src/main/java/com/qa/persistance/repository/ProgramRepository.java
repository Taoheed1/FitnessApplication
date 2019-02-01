package com.qa.persistance.repository;

public interface ProgramRepository {
	
	String getAllPrograms();
	
	String getProgramsByType(String programType);
	
	String getProgramsByName(String programName);

	String addNewProgram(String program);

	String deleteProgram(String programName);

	String updateProgram(String programName, String program);
}
