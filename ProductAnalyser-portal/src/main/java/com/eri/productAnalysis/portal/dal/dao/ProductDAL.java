package com.eri.productAnalysis.portal.dal.dao;
import com.eri.productAnalysis.portal.model.Product;

import java.util.List;

public interface ProductDAL {

    List<Product> getAllProducts();

    List<Product> getProductById(int productId);

    Product addNewProduct(Product product);

}
