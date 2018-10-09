package com.eri.productAnalysis.portal;

import com.eri.productAnalysis.portal.controller.ProductController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.eri.productAnalysis.portal" )
public class ProductAnalysisPortal extends SpringBootServletInitializer {


	@Override
	protected SpringApplicationBuilder configure(final SpringApplicationBuilder builder) {
		return builder.sources(ProductAnalysisPortal.class);
	}
	public static void main(String[] args) throws Exception{

		SpringApplication.run(ProductAnalysisPortal.class, args);


	}

}
