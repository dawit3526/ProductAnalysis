package com.eri.productAnalysis.crawler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.eri.productAnalysis.crawler")
public class ProductCrawler extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder builder) {
        return builder.sources(ProductCrawler.class);
    }
    public static void main(String[] args) throws Exception{

        SpringApplication.run(ProductCrawler.class, args);


    }
}
