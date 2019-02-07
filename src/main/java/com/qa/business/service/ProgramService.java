package com.qa.business.service;

public interface ProgramService {

	String getAllPrograms();

	String getProgramsByType(String programType);

	String getProgramsByName(String programName);

	String addNewProgram(String program);

	String deleteProgram(Long programID);

	String updateProgram(Long programID, String program);
}
