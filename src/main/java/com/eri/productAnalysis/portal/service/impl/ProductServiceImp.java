package com.eri.productAnalysis.portal.service.impl;
import com.eri.productAnalysis.portal.dal.dao.ProductRepository;
import com.eri.productAnalysis.portal.model.Product;
import com.eri.productAnalysis.portal.service.ProductService;

import javax.inject.Inject;
import java.util.List;

public class ProductServiceImp implements ProductService {

    @Inject
    ProductRepository productRepository;

    @Override
    public void setProduts(List<Product> products) {
        for(Product p : products)
        productRepository.save(p);

    }
}
