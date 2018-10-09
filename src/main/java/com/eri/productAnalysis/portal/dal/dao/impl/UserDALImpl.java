package com.eri.productAnalysis.portal.dal.dao.impl;

import com.eri.productAnalysis.portal.dal.dao.UserDAL;
import com.eri.productAnalysis.portal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDALImpl implements UserDAL {


    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public List<User> getAllUsers() {

        return mongoTemplate.findAll(User.class);
    }

    @Override
    public User addNewUser(User user) {
        mongoTemplate.save(user);

        return getUserById(user.getUserId());
    }

    @Override
    public User getUserById(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));
        return mongoTemplate.findOne(query,User.class);
    }

    @Override
    public Object getAllUserSettings(String userId) {
        return null;
    }

    @Override
    public String getUserSetting(String userId, String key) {
        return null;
    }

    @Override
    public String addUserSetting(String userId, String key, String value) {
        return null;
    }


}
