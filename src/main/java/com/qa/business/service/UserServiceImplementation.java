package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistance.repository.UserRepository;

public class UserServiceImplementation implements UserService {

	@Inject
	private UserRepository repo;

	@Override
	public String getAllUsers() {
		// TODO Auto-generated method stub
		return repo.getAllUsers();
	}

	@Override
	public String addNewAccount(String account) {
		// TODO Auto-generated method stub
		return null;
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

}
