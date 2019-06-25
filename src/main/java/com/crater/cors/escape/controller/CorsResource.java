package com.crater.cors.escape.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/cors-escape")
public interface CorsResource {

	@POST
	@Path("{url : .+}")
	public Response post(@Context final HttpHeaders headers,
			@Context final UriInfo uriInfo, final String requestBody);

	@PUT
	@Path("{url : .+}")
	public Response put(@Context final HttpHeaders headers,
			@Context final UriInfo uriInfo, final String requestBody);

	@GET
	@Path("{url : .+}")
	public Response get(@Context final HttpHeaders headers,
			@Context final UriInfo uriInfo);

}
