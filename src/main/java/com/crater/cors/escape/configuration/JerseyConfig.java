package com.crater.cors.escape.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.crater.cors.escape.controller.impl.CorsResourceImpl;
import com.crater.cors.escape.filter.CORSResponseFilter;
import com.crater.cors.escape.filter.PrematchingRequestFilter;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
    	register(CorsResourceImpl.class);
         register(PrematchingRequestFilter.class);
         register(CORSResponseFilter.class);
    }
}