package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistance.repository.ProgramRepository;

public class ProgramServiceImplementation implements ProgramService{

	@Inject
	private ProgramRepository repo;

	@Override
	public String getAllPrograms() {
		return repo.getAllPrograms();
	}

	@Override
	public String getProgramsByType(String program) {
		return repo.getProgramsByType(program);
	}
	
	@Override
	public String getProgramsByName(String program) {
		return repo.getProgramsByName(program);
	}

	@Override
	public String addNewProgram(String program) {
		return repo.addNewProgram(program);
	}

	@Override
	public String deleteProgram(String programName) {
		return repo.deleteProgram(programName);
	}

	@Override
	public String updateProgram(String programName, String program) {
		return repo.updateProgram(programName, program);
	}

	
}
