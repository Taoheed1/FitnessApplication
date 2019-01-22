package com.qa.persistance.repository;

public interface UserRepository {

	String getAllUsers();

	String getAllPrograms();

	String addNewAccount(String account);

	String deleteUser(long userID);

	String updateUser(long userID, String account);

	String updateProgram(long programID, String program);

}
