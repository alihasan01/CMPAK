import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import java.util.List;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;




//This is My Java Restful api class.
//Path annotation define the base url of my restful web service.
@Path("/test")
public class MLMRestApi {
	
	// This is Get Method of warehouse management Rest Web service for testing purpose either service is working or not.
		@GET
		@Produces("text/plain")
		@Path("/hello")
		public String sayHello(){
			return "Hello World";
		}
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/labtestorders/{patNo}")
		public Response getAllTestOrders(@PathParam("patNo") String patNo){
			
			try{
				//List<TestOrders> testOrders = labTestModel.getPatientTestOrders(patNo);			
				// Start building a json tree
				//	return Response.ok(root).build();
			}
			catch(Exception e){
				e.printStackTrace();
				return Response.status(Response.Status.BAD_REQUEST).build() ;
			}
		}

	
}
