package com.eri.productAnalysis.portal.dal.dao;

import com.eri.productAnalysis.portal.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
