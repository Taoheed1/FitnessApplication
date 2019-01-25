package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.ProgramService;
import com.qa.business.service.UserService;
import com.qa.persistance.domain.Account;

@Path("/classroom")
public class FitnessEndpoint {

	@Inject
	private UserService service_user;

	@Inject
	private ProgramService service_prog;

	@Path("/getAllUsers")
	@GET
	@Produces({ "application/json" })
	public String getAccounts() {
		return service_user.getAllUsers();
	}

	@Path("/getAllPrograms")
	@GET
	@Produces({ "application/json" })
	public String getPrograms() {
		return service_prog.getAllPrograms();
	}

	@Path("/getProgramsByType")
	@GET
	@Produces({ "application/json" })
	public String getProgramsOfType(String programType) {
		return service_prog.getProgramsByType(programType);
	}

	@Path("/createAccount")
	@POST
	@Produces({ "application/json" })
	public String addAccount(Account account) {
		return service_user.addNewAccount(account);
	}

	@Path("/deleteAccount/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") Long userID) {
		return service_user.deleteUser(userID);
	}

	@Path("/updateUser/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateAccount(@PathParam("id") Long userID, Account account) {
		return service_user.updateUser(userID, account);
	}

	@Path("/updateProgram/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updatePrograms(@PathParam("id") Long programID, String program) {
		return service_prog.updateProgram(programID, program);
	}

	public void setService(UserService service_user) {
		this.service_user = service_user;
	}

	public void setService(ProgramService service_prog) {
		this.service_prog = service_prog;
	}

}
