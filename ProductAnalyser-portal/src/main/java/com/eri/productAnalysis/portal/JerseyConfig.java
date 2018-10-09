package com.eri.productAnalysis.portal;

import com.eri.productAnalysis.portal.controller.ProductController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/productAnalysis")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(ProductController.class);
	}
}
