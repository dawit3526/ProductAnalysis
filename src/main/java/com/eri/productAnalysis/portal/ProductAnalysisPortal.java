package com.eri.productAnalysis.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.eri.productAnalysis.portal" )
public class ProductAnalysisPortal extends SpringBootServletInitializer {
	public static void main(String[] args) {

		final SpringApplication app = new SpringApplication(ProductAnalysisPortal.class);
		app.run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(final SpringApplicationBuilder builder) {
		return builder.sources(ProductAnalysisPortal.class);
	}


}
