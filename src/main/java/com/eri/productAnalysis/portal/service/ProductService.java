package com.eri.productAnalysis.portal.service;
import com.eri.productAnalysis.portal.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductService {


    void setProduts(Product products);


    List<Product> getProducts();


}
