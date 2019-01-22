package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.qa.business.service.FitnessService;

@Path("/classroom")
public class FitnessEndpoint {

	@Inject
	private FitnessService service;

	@Path("/getAllUsers")
	@GET
	@Produces({ "application/json" })
	public String getAccounts() {
		return service.getAllUsers();
	}

	@Path("/getAllPrograms")
	@GET
	@Produces({ "application/json" })
	public String getPrograms() {
		return service.getAllPrograms();
	}

	@Path("/createAccount")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String account) {
		return service.addNewAccount(account);
	}

	@Path("/deleteAccount/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") Long userID) {
		return service.deleteUser(userID);
	}

	@Path("/updateUser/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateAccount(@PathParam("id") Long userID, String account) {
		return service.updateUser(userID, account);
	}

	@Path("/updateProgram/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updatePrograms(@PathParam("id") Long programID, String program) {
		return service.updateProgram(programID, program);
	}

	public void setService(FitnessService service) {
		this.service = service;
	}

}
