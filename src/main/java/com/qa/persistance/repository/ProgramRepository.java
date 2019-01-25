package com.qa.persistance.repository;

public interface ProgramRepository {
	
	String getAllPrograms();
	
	String getProgramsByType(String program);

	String addNewProgram(String program);

	String deleteProgram(long programID);

	String updateProgram(long programID, String program);
}
