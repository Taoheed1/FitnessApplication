package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistance.repository.ProgramRepository;
import com.qa.persistance.repository.UserRepository;

public class ProgramServiceImplementation implements ProgramService{

	@Inject
	private ProgramRepository repo;

	@Override
	public String getAllPrograms() {
		// TODO Auto-generated method stub
		return repo.getAllPrograms();
	}

	@Override
	public String getProgramsByType(String program) {
		// TODO Auto-generated method stub
		return repo.getProgramsByType(program);
	}

	@Override
	public String addNewProgram(String program) {
		// TODO Auto-generated method stub
		return repo.addNewProgram(program);
	}

	@Override
	public String deleteProgram(long programID) {
		// TODO Auto-generated method stub
		return repo.deleteProgram(programID);
	}

	@Override
	public String updateProgram(long programID, String program) {
		// TODO Auto-generated method stub
		return repo.updateProgram(programID, program);
	}

	
}
