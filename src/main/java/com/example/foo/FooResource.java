package com.example.foo;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Michal Szynkiewicz, michal.l.szynkiewicz@gmail.com
 * <br>
 * Date: 28/06/2019
 */
@Path("/foos")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class FooResource {
   @GET
   public Response foo() {
      throw new IllegalStateException("forced exception");
   }

   @POST
   public Response bar() {
      throw new IllegalStateException("forced exception");
   }
}
