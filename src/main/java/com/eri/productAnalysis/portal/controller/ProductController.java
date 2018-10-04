package com.eri.productAnalysis.portal.controller;
import com.eri.productAnalysis.portal.model.Product;

import com.eri.productAnalysis.portal.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Named
@Controller
@Singleton
public class ProductController{


  private final ProductService productService;
private final Logger logger = LoggerFactory.getLogger(ProductController.class);
  @Inject
  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @POST
  @PathParam("/setProduct")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response setProducts(List<Product> products){

    productService.setProduts(products);

    return  Response.ok().build();

  }

  @GET
  @PathParam("/getProduct")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response getProducts(){
    logger.info("I ma here");
    List<Product> products = productService.getProducts();

    return  Response.ok(products).build();

  }

}
