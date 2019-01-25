package com.qa.persistance.repository;

public interface UserRepository {

	String getAllUsers();

	String addNewAccount(String account);

	String deleteUser(long userID);

	String updateUser(long userID, String account);

}
