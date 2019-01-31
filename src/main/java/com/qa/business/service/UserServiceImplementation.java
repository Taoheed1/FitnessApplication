package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistance.domain.Account;
import com.qa.persistance.repository.UserRepository;

public class UserServiceImplementation implements UserService {

	@Inject
	private UserRepository repo;

	@Override
	public String getAllUsers() {
		return repo.getAllUsers();
	}

	@Override
	public String addNewAccount(String account) {
		return repo.addNewAccount(account);
	}

	@Override
	public String deleteUser(long userID) {
		return repo.deleteUser(userID);
	}

	@Override
	public String updateUser(long userID, String account) {
		return repo.updateUser(userID, account);
	}

}
