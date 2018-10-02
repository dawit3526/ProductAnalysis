package com.eri.productAnalysis.portal.cotroller;
import com.eri.productAnalysis.portal.resource.ProductRequest;
import org.springframework.stereotype.Controller;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.List;

@Controller
public class ProductController {

  @POST
  @PathParam("/setProduct")
  public Response.ResponseBuilder setProducts(List<ProductRequest> products){


  return Response.ok();
  }

}
