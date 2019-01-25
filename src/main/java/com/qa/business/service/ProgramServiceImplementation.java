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
	public String addNewProgram(String program) {
		return repo.addNewProgram(program);
	}

	@Override
	public String deleteProgram(long programID) {
		return repo.deleteProgram(programID);
	}

	@Override
	public String updateProgram(long programID, String program) {
		return repo.updateProgram(programID, program);
	}

	
}
