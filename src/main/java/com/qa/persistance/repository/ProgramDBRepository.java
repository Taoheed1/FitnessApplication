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
public class ProgramDBRepository implements ProgramRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Override
	@Transactional(REQUIRED)
	public String getAllPrograms() {
		// TODO Auto-generated method stub
		Query query = manager.createQuery("Select a FROM Program a");
		Collection<Program> Programs = (Collection<Program>) query.getResultList();
		return util.getJSONForObject(Programs);
	}

	@Override
	@Transactional(REQUIRED)
	public String getProgramsByType(String program) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(REQUIRED)
	public String addNewProgram(String program) {
		// TODO Auto-generated method stub
		manager.persist(program);
		return "{\"message\":\"program has been successfully created\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteProgram(long programID) {
		// TODO Auto-generated method stub
		Program programInDB = findProgram(programID);
		if (programInDB != null) {
			manager.remove(programInDB);
			return "{\"message\":\"program has been successfully deleted\"}";
		}
		 return "{\"message\":\"program does not exist\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String updateProgram(long programID, String program) {
		// TODO Auto-generated method stub
		Program programInDB = findProgram(programID);
		if (programInDB != null) {
			manager.remove(programInDB);
			manager.persist(program);
			return "{\"message\":\"program has been successfully updated\"}";
		} else {
			return "{\"message\": \"program does not exist\"}";
		}

	}

	private Program findProgram(long programID) {
		return manager.find(Program.class, programID);
	}

}
