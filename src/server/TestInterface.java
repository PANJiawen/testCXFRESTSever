package server;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@WebService
@Path("/test")
public interface TestInterface {
	
	@Path("/send/{input}")
	@GET
	@Produces(MediaType.TEXT_PLAIN) 
	public String sendString(@PathParam("input")String input);
	
	
	@Path("/hello")
	@GET
	@Produces(MediaType.TEXT_PLAIN) 
	public String hello();
	
}
