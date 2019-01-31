package com.qa.business.service;

import com.qa.persistance.domain.Account;

public interface UserService {

	String getAllUsers();

	String addNewAccount(String account);

	String deleteUser(long userID);

	String updateUser(long userID, String account);

}
