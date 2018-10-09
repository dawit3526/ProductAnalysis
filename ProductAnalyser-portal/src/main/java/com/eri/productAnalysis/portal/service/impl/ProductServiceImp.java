package com.eri.productAnalysis.portal.service.impl;
import com.eri.productAnalysis.portal.dal.dao.ProductDAL;
import com.eri.productAnalysis.portal.dal.dao.ProductRepository;
import com.eri.productAnalysis.portal.model.Product;
import com.eri.productAnalysis.portal.service.ProductService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Named
@Transactional
public class ProductServiceImp implements ProductService {


    @Inject
    ProductDAL productDAL;

    @Override
    public void setProduts(Product product) {

        productDAL.addNewProduct(product);

    }

    @Override
    public List<Product> getProducts() {
        List<Product> products = productDAL.getAllProducts();
       // List<Product> products = new ArrayList<>();
       // Product p1 = new Product();
        //p1.setPrice(12);
       // p1.setDescription("appple");
        //products.add(p1);
        return products;
    }

    @Override
    public List<Product> getProductById(int productId) {
        return productDAL.getProductById(productId);
    }
}
