package com.eri.productAnalysis.portal.controller;
import com.eri.productAnalysis.portal.model.Product;

import com.eri.productAnalysis.portal.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Controller
@Path("/product")
public class ProductController{


  private final ProductService productService;
  private final Logger logger = LoggerFactory.getLogger(ProductController.class);
  @Inject
  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @POST
  @Path("/setProduct")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response setProducts(@RequestBody Product products){
  logger.info("Inserting product "+ products.getProductId());
    productService.setProduts(products);

    return  Response.ok().build();

  }

  @GET
  @Path("/get")
  @Produces(MediaType.APPLICATION_JSON)
  public Response getProducts(){
    List<Product> products = productService.getProducts();
    logger.info("get product called "+products);
    return Response.ok(products).build();

  }

}
