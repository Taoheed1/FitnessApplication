package com.qa.business.service;

public interface ProgramService {

	String getAllPrograms();

	String getProgramsByType(String programType);

	String getProgramsByName(String programName);

	String addNewProgram(String program);

	String deleteProgram(String programName);

	String updateProgram(String programName, String program);
}
