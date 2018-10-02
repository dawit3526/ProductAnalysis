package com.eri.productAnalysis.portal.dal.dao;
import com.eri.productAnalysis.portal.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.inject.Named;


public interface ProductRepository extends MongoRepository<Product,String> {
}
