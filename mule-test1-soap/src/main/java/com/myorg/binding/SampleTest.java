package com.myorg.binding;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Path("/test")
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
public class SampleTest {

	public static final Logger LOGGER = LoggerFactory.getLogger(SampleTest.class);
	
	private DBOperations dbo;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String create(String jsonPayload) {
	    LOGGER.info("Message received by create(). Payload: " + jsonPayload);
	    dbo.create(jsonPayload);
	    return jsonPayload;
	}
}
