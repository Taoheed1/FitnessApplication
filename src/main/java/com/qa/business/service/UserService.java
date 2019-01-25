package com.qa.business.service;

public interface UserService {

	String getAllUsers();

	String addNewAccount(String account);

	String deleteUser(long userID);

	String updateUser(long userID, String account);

}
