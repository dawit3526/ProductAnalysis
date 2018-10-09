package com.eri.productAnalysis.portal.dal.dao;
import com.eri.productAnalysis.portal.model.Product;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class ProducRepositroryImp implements ProductDAL{

    @Inject
    private MongoTemplate mongoTemplate;

    @Override
    public List<Product> getAllProducts() {
        return mongoTemplate.findAll(Product.class);
    }

    @Override
    public List<Product> getProductById(int productId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("productId").is(productId));
        return mongoTemplate.find(query, Product.class);
    }

    @Override
    public Product addNewProduct(Product product) {
        mongoTemplate.save(product);
        return  product;
    }
}
