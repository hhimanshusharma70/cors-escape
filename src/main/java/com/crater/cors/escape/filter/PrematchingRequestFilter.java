package com.crater.cors.escape.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PrematchingRequestFilter implements ContainerRequestFilter {
	
	private static final Logger LOG = LoggerFactory.getLogger(PrematchingRequestFilter.class);

	@Override
	public void filter(final ContainerRequestContext ctx) throws IOException {
		LOG.info("INside Request Filter"+ctx.getHeaders().toString());

	}
}