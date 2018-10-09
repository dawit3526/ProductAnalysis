package eri.productAnalysis.crawler;

import eri.productAnalysis.crawler.controller.CrawlerController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/ProductCrawler")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(CrawlerController.class);
	}
}
