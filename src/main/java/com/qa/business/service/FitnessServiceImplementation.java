package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistance.repository.UserRepository;

public class FitnessServiceImplementation implements FitnessService {

	@Inject
	private UserRepository repo;

	@Override
	public String getAllUsers() {
		// TODO Auto-generated method stub
		return repo.getAllUsers();
	}

	@Override
	public String getAllPrograms() {
		// TODO Auto-generated method stub
		return repo.getAllPrograms();
	}

	@Override
	public String addNewAccount(String account) {
		// TODO Auto-generated method stub
		return repo.addNewAccount(account);
	}

	@Override
	public String deleteUser(long userID) {
		// TODO Auto-generated method stub
		return repo.deleteUser(userID);
	}

	@Override
	public String updateUser(long userID, String account) {
		// TODO Auto-generated method stub
		return repo.updateUser(userID, account);
	}

	@Override
	public String updateProgram(long programID, String program) {
		// TODO Auto-generated method stub
		return repo.updateProgram(programID, program);
	}

}
