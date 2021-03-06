package com.qa.persistance.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.qa.persistance.domain.Account;
import com.qa.persistance.domain.Program;
import com.qa.util.JSONUtil;

@Default
@Transactional(SUPPORTS)
public class ProgramDBRepository implements ProgramRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Override
	@Transactional(REQUIRED)
	public String getAllPrograms() {
		Query query = manager.createQuery("Select a FROM Program a");
		Collection<Program> programs = (Collection<Program>) query.getResultList();
		return util.getJSONForObject(programs);
	}

	@Override
	@Transactional(REQUIRED)
	public String getProgramsByType(String programType) {
		Query query = manager.createQuery("Select a FROM Program a");
		List<Program> allPrograms = query.getResultList();
		List<Program> programsOfType = allPrograms.stream().filter(i -> i.getProgramType().equals(programType))
				.collect(Collectors.toList());
		return util.getJSONForObject(programsOfType);
	}

	@Override
	@Transactional(REQUIRED)
	public String getProgramsByName(String programName) {
		Query query = manager.createQuery("Select a FROM Program a");
		List<Program> allPrograms = query.getResultList();
		List<Program> programs = allPrograms.stream().filter(i -> i.getProgramName().equals(programName))
				.collect(Collectors.toList());
		return util.getJSONForObject(programs);
	}
	@Override
	@Transactional(REQUIRED)
	public String addNewProgram(String program) {
		Program newProgram = util.getObjectForJSON(program, Program.class);
		manager.persist(newProgram);
		return "{\"message\":\"program has been successfully created\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteProgram(Long programID) {
		Program programInDB = findProgram(programID);
		if (programInDB != null) {
			manager.remove(programInDB);
			return "{\"message\":\"program has been successfully deleted\"}";
		}
		return "{\"message\":\"program does not exist\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String updateProgram(Long programID, String program) {
		Program programJSON = util.getObjectForJSON(program, Program.class);
		Program programInDB = findProgram(programID);
		if (programInDB != null) {
			manager.remove(programInDB);
			manager.persist(programJSON);
			return "{\"message\":\"program has been successfully updated\"}";
		} else {
			return "{\"message\": \"program does not exist\"}";
		}

	}

	private Program findProgram(Long programID) {
		return manager.find(Program.class, programID);
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

}
