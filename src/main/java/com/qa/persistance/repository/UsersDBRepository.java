package com.qa.persistance.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistance.domain.Account;
import com.qa.persistance.domain.Program;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
public class UsersDBRepository implements UserRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Override
	@Transactional(REQUIRED)
	public String getAllUsers() {
		// TODO Auto-generated method stub
		Query query = manager.createQuery("Select a FROM Account a");
		Collection<Account> Users = (Collection<Account>) query.getResultList();
		return util.getJSONForObject(Users);
	}

	@Override
	@Transactional(REQUIRED)
	public String addNewAccount(Account account) {
		// TODO Auto-generated method stub
		//Account user = util.getObjectForJSON(account, Account.class);
		Program program = findProgram(account.getProgramID());
		manager.persist(account);
		return "{\"message\": \"account has been sucessfully added\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteUser(long userID) {
		// TODO Auto-generated method stub
		Account accountInDB = findAccount(userID);
		if (accountInDB != null) {
			manager.remove(accountInDB);
			return "{\"message\": \"account sucessfully deleted\"}";
		}
		return "{\"message\": \"account does not exist\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String updateUser(long userID, Account account) {
		// TODO Auto-generated method stub
		Program program = findProgram(account.getProgramID());
		Account accountInDB = findAccount(userID);
		if (program != null) {
			manager.remove(accountInDB);
			manager.persist(program);
			return "{\"message\":\"account has been successfully updated\"}";
		} else {
			return "{\"message\": \"account does not exist\"}";
		}
	}

	private Account findAccount(long userID) {
		return manager.find(Account.class, userID);
	}

	private Program findProgram(long programID) {
		return manager.find(Program.class, programID);
	}

}
