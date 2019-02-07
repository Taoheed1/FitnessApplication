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
	public String deleteProgram(Long programID) {
		return repo.deleteProgram(programID);
	}

	@Override
	public String updateProgram(Long programID, String program) {
		return repo.updateProgram(programID, program);
	}

	
}
