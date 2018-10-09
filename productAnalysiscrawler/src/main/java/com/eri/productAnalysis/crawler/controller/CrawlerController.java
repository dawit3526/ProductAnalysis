package com.eri.productAnalysis.crawler.controller;
import com.eri.productAnalysis.crawler.service.CrawlerService;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Named
@Controller
@Path("crawler")
public class CrawlerController {


    CrawlerService crawlerService;

    @Inject
    public CrawlerController(CrawlerService crawlerService){
        this.crawlerService = crawlerService;
    }


    @GET
    @Path("/crawelProdut")
    @Produces(MediaType.APPLICATION_JSON)
    public Response crawelEngine(@QueryParam(value = "product") String product){

        String bodyText = crawlerService.searchProduct(product);
        return Response.ok(bodyText).build();
    }
}
