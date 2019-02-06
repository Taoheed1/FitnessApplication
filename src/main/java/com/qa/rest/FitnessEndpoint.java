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

@Path("/fitness")
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

	@Path("/getProgramsByType/{type}")
	@GET
	@Produces({ "application/json" })
	public String getProgramsOfType(@PathParam("type") String programType) {
		return service_prog.getProgramsByType(programType);
	}
	
	@Path("/getProgramsByName/{name}")
	@GET
	@Produces({ "application/json" })
	public String getProgramsName(@PathParam("name") String programName) {
		return service_prog.getProgramsByName(programName);
	}

	@Path("/createAccount")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String account) {
		return service_user.addNewAccount(account);
	}
	
	@Path("/createProgram")
	@POST
	@Produces({ "application/json" })
	public String addProgram(String program) {
		return service_prog.addNewProgram(program);
	}

	@Path("/deleteAccount/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") Long userID) {
		return service_user.deleteUser(userID);
	}
	
	@Path("/deleteProgram/{progName}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteProgram(@PathParam("progName") String programName) {
		return service_prog.deleteProgram(programName);
	}
	@Path("/updateUser/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateAccount(@PathParam("id") Long userID, String account) {
		return service_user.updateUser(userID, account);
	}

	@Path("/updateProgram/{progName}")
	@PUT
	@Produces({ "application/json" })
	public String updatePrograms(@PathParam("progName") String programName, String program) {
		return service_prog.updateProgram(programName, program);
	}

	public void setUserService(UserService service_user) {
		this.service_user = service_user;
	}

	public void setProgramService(ProgramService service_prog) {
		this.service_prog = service_prog;
	}

}
