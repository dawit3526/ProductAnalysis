package com.eri.productAnalysis.portal.dal.dao;
import com.eri.productAnalysis.portal.model.Product;

import java.util.List;

public interface ProductDAL {

    List<Product> getAllProducts();

    Product getProductById(String productId);

    Product addNewProduct(Product product);

}
