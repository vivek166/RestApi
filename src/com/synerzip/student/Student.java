package com.synerzip.student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/record")
public class Student {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHelloXML() {
		String response = "I am vivek";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{name}")
	public String sayHelloXML(@PathParam("name") String name) {
		String response = "I am "+name;
		return response;
	}

}
