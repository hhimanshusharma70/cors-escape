package com.crater.cors.escape.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;

public class CORSResponseFilter implements ContainerResponseFilter {

	@Override
	public void filter(final ContainerRequestContext requestContext, final ContainerResponseContext responseContext)
			throws IOException {
		final MultivaluedMap<String, Object> headers = responseContext.getHeaders();
		if(headers.containsKey("Access-Control-Allow-Origin")){
			headers.remove("Access-Control-Allow-Origin");
		}
		headers.add("Access-Control-Allow-Origin", "*");
		headers.add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");	
		responseContext.getHeaders().add("Access-Control-Allow-Headers", "*");
		/*headers.add("Access-Control-Allow-Headers", "Authorization,oauth-token, Origin, X-Requested-With, Content-Type,Accept");*/
		headers.add("Access-Control-Allow-Credentials", true);
	}


}
