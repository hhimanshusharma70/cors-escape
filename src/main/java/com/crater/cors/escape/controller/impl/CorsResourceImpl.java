package com.crater.cors.escape.controller.impl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.crater.cors.escape.controller.CorsResource;

@Component
public class CorsResourceImpl implements CorsResource {

	private static final Logger LOG = LoggerFactory
			.getLogger(CorsResourceImpl.class);

	private static String ESC_FIELD = "/cors-escape/";

	private static String processURL(final UriInfo uriInfo) {

		String path = uriInfo.getRequestUri().getPath();
		path = path.substring(ESC_FIELD.length());

		final String query = uriInfo.getRequestUri().getRawQuery();
		if (query != null && !query.trim().equals("")) {
			path = path + "?" + query;
		}
		return path;
	}

	@Override
	public Response post(final HttpHeaders headers, final UriInfo uriInfo,
			final String requestBody) {
		final String url = processURL(uriInfo);

		final Client client = ClientBuilder.newClient();
	
		Response response = null;
		try {
			response = client
					.target(url)
					.request(MediaType.APPLICATION_JSON)
					.post(Entity
							.entity(requestBody, MediaType.APPLICATION_JSON));
		} catch (final Exception e) {
			LOG.error(" Error occurred during calling CORS escape. Error is : "
					+ e);
		} finally {
			client.close();
		}
		return response;
	}

	@Override
	public Response put(final HttpHeaders headers, final UriInfo uriInfo,
			final String requestBody) {
		final String url = processURL(uriInfo);

		final Client client = ClientBuilder.newClient();
		Response response = null;
		try {
			response = client
					.target(url)
					.request(MediaType.APPLICATION_JSON)
					.put(Entity.entity(requestBody, MediaType.APPLICATION_JSON));
		} catch (final Exception e) {
			LOG.error(" Error occurred during calling CORS escape. Error is : "
					+ e);
		} finally {
			client.close();
		}
		return response;
	}

	@Override
	public Response get(final HttpHeaders headers, final UriInfo uriInfo) {
		final String url = processURL(uriInfo);

		final Client client = ClientBuilder.newClient();
		Response response = null;
		try {
			response = client.target(url).request(MediaType.APPLICATION_JSON)
					.get();

		} catch (final Exception e) {
			LOG.error(" Error occurred during calling CORS escape. Error is : "
					+ e);
		} finally {
			client.close();
		}
		return response;
	}

}